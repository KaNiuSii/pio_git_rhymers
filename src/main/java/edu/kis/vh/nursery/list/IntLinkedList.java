package edu.kis.vh.nursery.list;

/**
 * This class represents a linked list of integers.
 */
public class IntLinkedList {

    private static final int ERROR_VALUE = -1;
    Node last;
    // TODO: refactor i value
    int i;

    /**
     * Adds an element to the end of the list.
     *
     * @param i the element to be added
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if the list is full. This method always returns false
     * as the list can dynamically grow.
     *
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the value of the last element without removing it.
     *
     * @return the value of the last element, or ERROR_VALUE if the list is empty
     */
    public int top() {
        if (isEmpty())
            return ERROR_VALUE;
        return last.getValue();
    }

    /**
     * Removes the last element from the list and returns its value.
     *
     * @return the value of the last element, or ERROR_VALUE if the list is empty
     */
    public int pop() {
        if (isEmpty())
            return ERROR_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * This class represents a node in the linked list.
     */
    private class Node {

        private int value;
        private Node prev;
        private Node next;

        /**
         * Constructor for Node.
         *
         * @param i the value to be stored in the node
         */
        public Node(int i) {
            setValue(i);
        }

        /**
         * Returns the value of the node.
         *
         * @return the value of the node
         */
        public int getValue() {
            return value;
        }

        /**
         * Sets the value of the node.
         *
         * @param value the value to be set
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * Returns the previous node.
         *
         * @return the previous node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets the previous node.
         *
         * @param prev the previous node to be set
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Returns the next node.
         *
         * @return the next node
         */
        public Node getNext() {
            return next;
        }

        /**
         * Sets the next node.
         *
         * @param next the next node to be set
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
