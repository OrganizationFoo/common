package org.foo.sandbox.impl;

import org.foo.sandbox.FooInteger;
import org.foo.sandbox.FooModel;

public class FooBar extends FooInteger {

    private static final long serialVersionUID = 4829055376501871148L;

    public FooBar(Integer foo) {
        super(foo);
    }

    @Override
    public String foo(Integer i) {
        StringBuilder sb = new StringBuilder();

        int n = FooModel.random(baz(), i);
        sb.append(n);

        return sb.toString();
    }
}
