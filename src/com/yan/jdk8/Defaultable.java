package com.yan.jdk8;

public interface Defaultable {
    default String notRequired(){
        return "Default implementation";
    }

    String sayHay();
}
