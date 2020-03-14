package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addHeadTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        testList.add("TestHead");
        String expected = "TestHead";
        String actual = testList.head.value;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTailTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        testList.add("TestHead");
        testList.add("TestTail");
        String expected = "TestTail";
        String actual = testList.tail.value;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addMoreTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        testList.add("TestHead");
        testList.add("TestTail");
        testList.add("TestThird");
        String expected = "TestThird";
        String actual = testList.tail.value;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeHeadTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        String testHead = "TestHead";
        testList.add(testHead);
        Assert.assertTrue(testList.remove(testHead));
    }

    @Test
    public void removeTailTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        testList.add("TestHead");
        testList.add("TestTail");
        Assert.assertTrue(testList.remove(testTail));
    }

    @Test
    public void removeMoreTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        testList.add("TestHead");
        testList.add("TestTail");
        testList.add("TestThird");
        Assert.assertTrue(testList.remove(testThird));
    }

    @Test
    public void removeFailureTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        String testFourth = "TestFourth";
        testList.add("TestHead");
        testList.add("TestTail");
        testList.add("TestThird");
        Assert.assertFalse(testList.remove(testFourth));
    }

    @Test
    public void containsHeadTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        String testHead = "TestHead";
        testList.add(testHead);
        Assert.assertTrue(testList.contains(testHead));
    }

    @Test
    public void containsTailTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        testList.add("TestHead");
        testList.add("TestTail");
        Assert.assertTrue(testList.contains(testTail));
    }

    @Test
    public void containsMoreTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        testList.add("TestHead");
        testList.add("TestTail");
        testList.add("TestThird");
        Assert.assertTrue(testList.contains(testThird));
    }

    @Test
    public void containsFailureTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        String testFourth = "TestFourth";
        testList.add("TestHead");
        testList.add("TestTail");
        testList.add("TestThird");
        Assert.assertFalse(testList.contains(testFourth));
    }

    @Test
    public void sizeTestAddOnly() {
        SinglyLinkedList<String> testList = new SinglyLinkedList();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        testList.add("TestHead");
        testList.add("TestTail");
        testList.add("TestThird");
        int expected = 3;
        int actual = testList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTestAddRemoveHead() {
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testTail = "TestTail";
        String testThird = "TestThird";
        testList.add(testHead);
        testList.add(testTail);
        testList.add(testThird);
        testList.remove(testHead);
        int expected = 2;
        int actual = testList.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sizeTestAddRemoveMiddle() {
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testMiddle = "TestMiddle";
        String testTail = "TestTail";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        testList.remove(testMiddle);
        int expected = 2;
        int actual = testList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTestAddRemoveTail() {
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testMiddle = "TestMiddle";
        String testTail= "TestTail";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        testList.remove(testTail);
        int expected = 2;
        int actual = testList.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTestHead(){
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testMiddle = "TestMiddle";
        String testTail= "TestTail";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        int expected = 0;
        int actual = testList.find(testHead);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTestMiddle(){
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testMiddle = "TestMiddle";
        String testTail= "TestTail";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        int expected = 1;
        int actual = testList.find(testMiddle);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findTestTail() {
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testMiddle = "TestMiddle";
        String testTail = "TestTail";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        int expected = 2;
        int actual = testList.find(testTail);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTestHead() {
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testMiddle = "TestMiddle";
        String testTail = "TestTail";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        String expected = testHead;
        String actual = testList.get(0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTestMiddle() {
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testMiddle = "TestMiddle";
        String testTail = "TestTail";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        String expected = testMiddle;
        String actual = testList.get(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTestTail() {
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testMiddle = "TestMiddle";
        String testTail = "TestTail";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        String expected = testTail;
        String actual = testList.get(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void copyTest() {
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "TestHead";
        String testMiddle = "TestMiddle";
        String testTail = "TestTail";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        Assert.assertTrue(testList.contains(testHead));
        Assert.assertTrue(testList.contains(testMiddle));
        Assert.assertTrue(testList.contains(testTail));
        SinglyLinkedList newList = testList.copy();
        Assert.assertTrue(newList.contains(testHead));
        Assert.assertTrue(newList.contains(testMiddle));
        Assert.assertTrue(newList.contains(testTail));
    }

    @Test
    public void sortTestString(){
        SinglyLinkedList<String> testList = new SinglyLinkedList<String>();
        String testHead = "c";
        String testMiddle = "a";
        String testTail = "b";
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        testList.sort();
        Assert.assertEquals("a", testList.get(0));
        Assert.assertEquals("b", testList.get(1));
        Assert.assertEquals("c", testList.get(2));
    }

    @Test
    public void SortTestInt(){
        SinglyLinkedList<Integer> testList = new SinglyLinkedList<Integer>();
        Integer testHead = 3;
        Integer testMiddle = 1;
        Integer testTail = 2;
        testList.add(testHead);
        testList.add(testMiddle);
        testList.add(testTail);
        testList.sort();
        Assert.assertTrue(1== testList.get(0));
        Assert.assertTrue(2 == testList.get(1));
        Assert.assertTrue(3== testList.get(2));
    }

}
