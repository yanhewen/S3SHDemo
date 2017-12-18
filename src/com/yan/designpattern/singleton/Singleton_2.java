package com.yan.designpattern.singleton;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:38
 * Function:
 * 单例模式，饿汉模式，可以保证线程安全，缺点是需要启动时加载
 */

public class Singleton_2 {
  private static final Singleton_2 INSTANCE = new Singleton_2();
  private Singleton_2(){}
  public Singleton_2 getInstance(){
    return INSTANCE;
  }
}
