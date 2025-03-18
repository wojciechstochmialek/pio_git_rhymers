package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        final int callCheckValue=888;
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.isEmpty();
        Assert.assertEquals(true, result);

        rhymer.countIn(callCheckValue);

        result = rhymer.isEmpty();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        final int countInValue=888;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(countInValue);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.top();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        final int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.top();
        Assert.assertEquals(testValue, result);
        result = rhymer.top();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        final int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.pop();
        Assert.assertEquals(testValue, result);
        result = rhymer.pop();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}
