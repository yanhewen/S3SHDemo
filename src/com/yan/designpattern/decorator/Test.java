package com.yan.designpattern.decorator;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/24 23:53
 * Function:
 *
 */

public class Test {

  public static void main(String[] args) {
    Sourceable source = new Source();
    Sourceable sourceable = new Decorator(source);
    sourceable.method();
  }
}
