package com.peeyush.linkeslist;

public class InsetNodeAtSpecificPosition {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        if (head != null) {

            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

            if (position == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                SinglyLinkedListNode tmp = head;
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
            }


        }

        return head;
    }

}
