package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addHeadTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        testList.add ("TestHead");
        String expected = "TestHead";
        String actual = testList.head.value;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addTailTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        testList.add ("TestHead");
        testList.add ("TestTail");
        String expected = "TestTail";
        String actual = testList.tail.value;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addMoreTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        testList.add ("TestHead");
        testList.add ("TestTail");
        testList.add ("TestThird");
        String expected = "TestThird";
        String actual = testList.tail.value;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeHeadTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        String testHead = "TestHead";
        testList.add (testHead);
        Assert.assertTrue(testList.remove(testHead));
    }

    @Test
    public void removeTailTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        testList.add ("TestHead");
        testList.add ("TestTail");
        Assert.assertTrue(testList.remove(testTail));
    }

    @Test
    public void removeMoreTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        testList.add ("TestHead");
        testList.add ("TestTail");
        testList.add ("TestThird");
        Assert.assertTrue(testList.remove(testThird));
    }

    @Test
    public void removeFailureTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        String testFourth = "TestFourth";
        testList.add ("TestHead");
        testList.add ("TestTail");
        testList.add ("TestThird");
        Assert.assertFalse(testList.remove(testFourth));
    }

    @Test
    public void containsHeadTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        String testHead = "TestHead";
        testList.add (testHead);
        Assert.assertTrue(testList.contains(testHead));
    }

    @Test
    public void containsTailTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        testList.add ("TestHead");
        testList.add ("TestTail");
        Assert.assertTrue(testList.contains(testTail));
    }

    @Test
    public void containsMoreTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        testList.add ("TestHead");
        testList.add ("TestTail");
        testList.add ("TestThird");
        Assert.assertTrue(testList.contains(testThird));
    }

    @Test
    public void containtsFailureTest(){
        SinglyLinkedList<String> testList= new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        String testFourth = "TestFourth";
        testList.add ("TestHead");
        testList.add ("TestTail");
        testList.add ("TestThird");
        Assert.assertFalse(testList.contains(testFourth));
    }
}
