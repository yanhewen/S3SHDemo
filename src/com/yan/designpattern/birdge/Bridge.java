package com.yan.designpattern.birdge;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/26 23:05
 * Function:
 *
 */

public abstract class Bridge {
  private Sourceable source;

  public Sourceable getSource() {
    return source;
  }

  public void setSource(Sourceable source) {
    this.source = source;
  }
  public void method(){
    System.out.println("Class Birdge ,method()...");
  }
}
