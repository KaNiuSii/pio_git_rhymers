package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        list.push(45);
        Assert.assertEquals(45, list.top());

        list.push(100000);
        Assert.assertEquals(100000, list.top());
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());

        list.push(555);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(-1, list.top());

        list.push(52);
        Assert.assertEquals(52, list.top());

        list.push(222);
        Assert.assertEquals(222, list.top());
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(-1, list.pop());

        list.push(123);
        list.push(1234);
        Assert.assertEquals(1234, list.pop());
        Assert.assertEquals(123, list.pop());
        Assert.assertEquals(-1, list.pop());
    }

    @Test
    public void testPushAndPop() {
        IntLinkedList list = new IntLinkedList();
        for (int i = 0; i < 10; i++) {
            list.push(i);
            Assert.assertEquals(i, list.top());
        }

        for (int i = 9; i >= 0; i--) {
            Assert.assertEquals(i, list.pop());
        }

        Assert.assertTrue(list.isEmpty());
        Assert.assertEquals(-1, list.pop());
    }
}
