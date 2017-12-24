package com.yan.designpattern.singleton;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/19 20:50
 * Function:
 * 利用静态代码块初始化
 */

public class Singleton_5 {
  private static Singleton_5 instance = null;
  private Singleton_5(){};
  static {
    instance = new Singleton_5();
  }
  public static Singleton_5 getInstance(){
    return instance;
  }
}
