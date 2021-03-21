package com.demo.grammer;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class OperationDemoTest {

    @Test
    public void testCollationOperation() {
        int a=5,b=3;
        int i = OperationDemo.collationOperation(5,3);
        Assert.assertThat(i, Is.is(1));
    }

    @Test
    public void testOrOperation() {
        int a=129,b=128;
        int i = OperationDemo.orOperation(a,b);
        Assert.assertThat(i,Is.is(129));
    }

    @Test
    public void testNotOperation() {
        int a=11;
        int i = OperationDemo.notOperation(a);
        Assert.assertThat(i,Is.is(-12));
    }

    @Test
    public void testXorOperation() {
        int a=11,b=8;
        int i = OperationDemo.xorOperation(a,b);
        Assert.assertThat(i,Is.is(3));
    }

    @Test
    public void testShiftOperation() {
        int i = OperationDemo.shiftOpertion(-1);
        System.out.println(i);
    }
}
