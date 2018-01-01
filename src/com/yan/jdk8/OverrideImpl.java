package com.yan.jdk8;

public class OverrideImpl implements Defaultable {
    @Override
    public String notRequired() {
        return null;
    }

    @Override
    public String sayHay() {
        return null;
    }
}
