package com.yan.designpattern.birdge;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/26 23:07
 * Function:
 *
 */

public class MyBridge extends Bridge {

  public void method(){
    getSource().method();
  }
}
