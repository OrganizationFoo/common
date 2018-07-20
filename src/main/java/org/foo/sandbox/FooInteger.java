package org.foo.sandbox;

public abstract class FooInteger implements FooModel<Integer> {

    private static final long serialVersionUID = -6259267012601767172L;

    protected final Integer foo;

    public FooInteger(final Integer foo) {
        this.foo = foo;
    }

    @Override
    public Integer baz() {
        return foo;
    }
}
