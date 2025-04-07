package edu.kis.vh.nursery.list;

public class IntLinkedList {

    Node last;
    final static int DEFAULT_VALUE = -1;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return DEFAULT_VALUE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
