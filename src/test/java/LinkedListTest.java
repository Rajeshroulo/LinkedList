package com.UnorderedLinkedList;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LinkedListTest {

    @Test
    public void whenCreate_newLinkedList_shouldReturn_emptyList() {
        LinkedList linkedList=new LinkedList();
        Node head= linkedList.list();
        Assert.assertEquals(null,head);

    }

    @Test
    public void whenAddNewItem_shouldReturn_nothing() {
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        Assert.assertEquals(4,linkedList.size());
    }

    @Test
    public void whenItem_removed_fromLinkedList_shouldReturnData() {
        LinkedList linkedList=new LinkedList();
        Comparable data=linkedList.remove(2);
        Assert.assertEquals(2,data);
    }

    @Test
    public void whenSearchItem_fromLinkedList_shouldReturnsTrue() {
        LinkedList linkedList=new LinkedList();
        Assert.assertTrue(linkedList.search(1));

    }

    @Test
    public void whenLinkedList_IsNotEmpty_returnsFalse(){
        LinkedList linkedList=new LinkedList();
        Assert.assertFalse(linkedList.isEmpty());
    }
}
