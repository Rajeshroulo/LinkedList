package com.UnorderedLinkedList;

class Node<E extends Comparable<E> >{
    E data;
    Node next;
    Node(E data){
        this.data=data;
        this.next=null;

    }
    @Override
    public String toString(){

        return "LinkedList [data=" +data;
    }
}
public class LinkedList<E extends Comparable<E> > {
    public static Node head=null;
    public static Node tail=null;
    E data;
    public LinkedList(E data){
        this.data=data;
    }

    public LinkedList() {

    }

    public  <E extends Comparable<E> > Node list(){

        if(head==null){
            head=null;
            tail=null;
        }
        return null;
    }

    public <E extends Comparable<E> > E add(E data) {
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        return data;
    }

    public <E extends Comparable<E> > E remove(E data){
        Node current=head;
        Node temp=null;
        if(data==current.data){
            current=current.next;

        }
        while(current!=null && current.data!=data){
            temp=current;
            current=current.next;
        }
        temp.next=current.next;

        return data;
    }

    public <E extends Comparable<E> >  int size() {
        Node current=head;
        int size=0;
        while(current!=null){
            size++;
            current=current.next;
        }
        return size;
    }
}
