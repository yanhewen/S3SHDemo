package com.yan.designpattern.adapter.classadapter;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 22:18
 * Function:
 *
 */

public class Adapter extends Source implements Targetable {

  @Override
  public void method2() {
    System.out.println("Class Adapter,method2");
  }
}
