package com.peeyush.linkeslist;

public class DeleteNode {

    class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        if (head != null) {
            SinglyLinkedListNode tmp = head;

            if (position == 0) {
                head = head.next;
            } else {
                int count = 0;
                while (tmp != null && count < position - 1) {
                    tmp = tmp.next;
                    count++;
                }

                if (tmp != null) {
                    tmp.next = tmp.next.next;
                }
            }


        }

        return head;
    }
}
