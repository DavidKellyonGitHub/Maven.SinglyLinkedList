package com.zipcodewilmington.singlylinkedlist;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import com.sun.tools.javac.code.Attribute;

import java.util.ArrayList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<F> {
    int numOfNodes=0;
    Node<F> head;
    Node<F> tail;

    public static class Node<F>{
         boolean isHead;
         boolean isTail;
         Node<F> prevNode;
         Node<F> nextNode;
         F value;
         int index;

         public Node(F value, Node<F> prevNode, Node<F> nextNode){
             this.prevNode = prevNode;
             this.nextNode= nextNode;
             this.value = value;
         }

         public Node(F value, Node<F> nextOrPreviousNode, boolean isHead){
             if (isHead){
                 this.nextNode = nextOrPreviousNode;
                 this.isHead = true;
                 this.index = 0;
             } else {
                 this.prevNode = nextOrPreviousNode;
                 this.isTail = true;
             }
             this.value = value;
         }
         public Node(){
             this.value = null;
             this.prevNode = null;
             this.nextNode = null;
         }
    }


    public <F>SinglyLinkedList(){
    }

    public void add(F o) {
        if (this.numOfNodes == 0) {
            Node<F> newNode = new Node<F>(o, null, true);
            newNode.index = 0;
            this.head = newNode;
            this.numOfNodes++;
        } else if (numOfNodes ==1 ){
            Node<F> newTail = new Node<F>(o, head, false);
            this.tail = newTail;
            this.head.nextNode = this.tail;
            newTail.index = 1;
            this.numOfNodes++;

        } else {
            Node<F> newTail = new Node<F>(o, tail, false);
            this.tail.nextNode = newTail;
            newTail.prevNode = this.tail;
            newTail.index = newTail.prevNode.index + 1;
            this.tail = newTail;
            this.numOfNodes++;
        }
    }

    public Boolean remove(F o){
            if (this.head.value == o){
                this.head = head.nextNode;
                this.numOfNodes--;
                return true;
            } else if (this.tail.value == o){
                this.tail = tail.prevNode;
                this.numOfNodes--;
                return true;
        }

        Node<F> placeHolder = this.head;
        for (int i = 0; i < this.numOfNodes; i++){
            if (placeHolder.value != o && placeHolder != this.tail){
                placeHolder = placeHolder.nextNode;
            } else if (placeHolder.value == o){
                placeHolder.prevNode.nextNode = placeHolder.nextNode;
                this.numOfNodes--;
                return true;
            } else if (placeHolder == this.tail && placeHolder.value != o){
                return false;
            }
        }
        return false;
    }

    public boolean contains(F o){
        if (this.head.value == o){
            return true;
        } else if (this.tail.value == o){
            return true;
        }

        Node<F> placeHolder = this.head;
        for (int i = 0; i < this.numOfNodes; i++){
            if (placeHolder.value != o){
                placeHolder = placeHolder.nextNode;
            } else if (placeHolder.value == o){
                return true;
            }
        }
        return false;
    }

    public int find(F o){
        if (this.head.value == o){
            return this.head.index;
        } else if (this.tail.value == o){
            return this.tail.index;
        }

        Node<F> placeHolder = this.head;
        for (int i = 0; i < this.numOfNodes; i++){
            if (placeHolder.value != o){
                placeHolder = placeHolder.nextNode;
            } else if (placeHolder.value == o){
                return placeHolder.index;
            }
        }
        return -1;
    }
    public int size(){
        return this.numOfNodes;
    }

    public Object get(Object o){
        return null;
    }

    public SinglyLinkedList <F> copy(F o){return null;}
    public SinglyLinkedList <F> sort(F o){
        return null;
    }

    public int getNumOfNodes() {
        return numOfNodes;
    }

    public void setNumOfNodes(int numOfNodes) {
        this.numOfNodes = numOfNodes;
    }

    public Node<F> getHead() {
        return head;
    }

    public Node<F> getTail() {
        return tail;
    }

    public void setHead(Node<F> head) {
        this.head = head;
    }

    public void setTail(Node<F> tail) {
        this.tail = tail;
    }
}
