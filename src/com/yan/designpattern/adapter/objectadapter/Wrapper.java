package com.yan.designpattern.adapter.objectadapter;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 22:25
 * Function:
 *
 */

public class Wrapper implements Targetable{
  private Source source;

  public Wrapper(Source source) {
    this.source = source;
  }

  @Override
  public void method1() {
    source.method1();
  }

  @Override
  public void method2() {
    System.out.println("Class Wrapper,method2");
  }
}
