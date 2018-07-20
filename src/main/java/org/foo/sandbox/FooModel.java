package org.foo.sandbox;

import java.io.Serializable;
import java.util.Random;

public interface FooModel<E> extends Serializable {

    public static final Random RANDOM = new Random();

    public String foo(E e);

    public E baz();

    public static int random(int from, int to) {
        int i = RANDOM.nextInt((to - from) + 1);
        i += from;
        return i;
    }
}
