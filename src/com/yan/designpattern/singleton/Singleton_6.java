package com.yan.designpattern.singleton;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/19 20:56
 * Function:
 * ¾²Ì¬ÄÚ²¿Àà
 */

public class Singleton_6 {
  private static class instanceHolder{
    private static Singleton_6 instance = new Singleton_6();
  }

  private Singleton_6() {
  }

  public static Singleton_6 getInstance(){
    return instanceHolder.instance;
  }
}
