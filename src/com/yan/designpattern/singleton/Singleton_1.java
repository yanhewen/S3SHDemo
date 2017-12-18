package com.yan.designpattern.singleton;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:33
 * Function:
 * ����ģʽ - ����ģʽ,���̰߳�ȫ����
 */

public class Singleton_1 {
  private static Singleton_1 instance;
  private Singleton_1(){

  }
  public Singleton_1 getInstance(){
    if (null == instance){
      instance = new Singleton_1();
    }
    return instance;
  }
}
