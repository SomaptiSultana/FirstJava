package com.practice.generic.generics;

public class Generic1<V> {
    private V value;

    public Generic1(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}
