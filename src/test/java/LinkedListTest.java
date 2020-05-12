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

}
