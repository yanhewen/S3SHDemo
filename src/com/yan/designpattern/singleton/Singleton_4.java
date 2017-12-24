package com.yan.designpattern.singleton;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/19 20:47
 * Function:
 * 懒汉模式，双重校验防止多线程
 */

public class Singleton_4 {
  private volatile static Singleton_4 instance = null;
  private Singleton_4(){};
  public static Singleton_4 getInstance(){
    synchronized (instance){
      if (null == instance)
        instance = new Singleton_4();
    }
    return instance;
  }
}
