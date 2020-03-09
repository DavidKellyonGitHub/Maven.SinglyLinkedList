package com.zipcodewilmington.singlylinkedlist;

import com.sun.tools.javac.code.Attribute;

import java.util.ArrayList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<F> {
    int numOfNodes=0;
    Node<F> head;
    Node<F> tail;
    SinglyLinkedList<F> linkList= new SinglyLinkedList<F>();

    public static class Node<F>{
         boolean isHead;
         boolean isTail;
         Node<F> prevNode;
         Node<F> nextNode;
         F value;

         public Node(F value, Node<F> prevNode, Node<F> nextNode){
             this.prevNode = prevNode;
             this.nextNode= nextNode;
             this.value = value;
         }

         public Node(F value, Node<F> nextOrPreviousNode, boolean isHead){
             if (isHead){
                 this.nextNode = nextOrPreviousNode;
             } else {
                 this.prevNode = nextOrPreviousNode;
             }
         }
         public Node(){
             this.value = null;
             this.prevNode = null;
             this.nextNode = null;
         }
    }


    public <F>SinglyLinkedList(){
    }

    public SinglyLinkedList<F> add(Object o) {
        if (numOfNodes == 0) {
            this.head = new Node(o, null, true);
            numOfNodes++;
        } else if (numOfNodes ==1 ){
            this.tail = new Node(o, head, false);;
            numOfNodes++;
        } else {
            this.tail = new Node(o, tail, null);
            numOfNodes++;
        }
        return linkList;
    }

    public SinglyLinkedList <F> remove(Object o){
        for(int i = 0; i < numOfNodes; i++){
            if (head.value == o){
                this.head = head.nextNode;
            } else if (tail.value == o){
                this.tail = tail.prevNode;
                numOfNodes--;
            }
        }
        Node<F> placeHolder = getHead();
        for (int i = 0; i < numOfNodes; i++){
            if (placeHolder.value != o){
                placeHolder = placeHolder.nextNode;
            } if (placeHolder.value ==o){
                placeHolder.prevNode.nextNode = placeHolder.nextNode;
            }
        }
        return linkList;
    }

    public boolean contains(Object o){
        return false;
    }
    public int find(Object o){
        return 0;
    }
    public int size(Object o){
        return 0;
    }
    public Object get(Object o){
        return null;
    }
    public SinglyLinkedList <F> copy(Object o){
        return null;
    }
    public SinglyLinkedList <F> sort(Object o){
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

    public SinglyLinkedList<F> getLinkList() {
        return linkList;
    }

    public void setLinkList(SinglyLinkedList<F> linkList) {
        this.linkList = linkList;
    }

    public void setHead(Node<F> head) {
        this.head = head;
    }

    public void setTail(Node<F> tail) {
        this.tail = tail;
    }
}
