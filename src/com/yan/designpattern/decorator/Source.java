package com.yan.designpattern.decorator;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/24 23:50
 * Function:
 *
 */

public class Source implements Sourceable {

  @Override
  public void method() {
    System.out.println("Class Source,method");
  }
}
