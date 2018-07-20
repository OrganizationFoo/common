package org.foo.sandbox.impl;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.foo.sandbox.FooModel;
import org.junit.Test;

public class FooBarTest {

    @Test
    public void testFoo() {
        FooModel<Integer> fooBar = new FooBar(1);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            String foo = fooBar.foo(10);
            int parsed = Integer.parseInt(foo);
            assertTrue(parsed >= 1);
            assertTrue(parsed <= 10);
            set.add(parsed);
        }
        assertTrue(set.size() == 10);
    }
}
