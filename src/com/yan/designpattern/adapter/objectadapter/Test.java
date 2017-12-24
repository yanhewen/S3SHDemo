package com.yan.designpattern.adapter.objectadapter;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 22:27
 * Function:
 *
 */

public class Test {

  public static void main(String[] args) {
    Source source = new Source();
    Wrapper wrapper = new Wrapper(source);
    wrapper.method1();
    wrapper.method2();
  }
}
