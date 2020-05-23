package com.peeyush.linkeslist;

public class InsetNodeAtSpecificPosition {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode tmp = head;

        SinglyLinkedListNode newNode = new SinglyLinkedListNode();
        newNode.data = data;

        int count = 0;
        while (tmp != null && count < position - 1) {
            tmp = tmp.next;
            count++;
        }

        if (tmp != null) {
            newNode.next = tmp.next;
            tmp.next = newNode;
        }

        return head;
    }

}
