package com.yan.designpattern.decorator;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/24 23:51
 * Function:
 *
 */

public class Decorator implements Sourceable {

  private Sourceable source;

  public Decorator(Sourceable source) {
    this.source = source;
  }

  @Override
  public void method() {
    System.out.println("Before invoke");
    source.method();
    System.out.println("after invoke");
  }
}
