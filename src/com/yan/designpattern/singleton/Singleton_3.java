package com.yan.designpattern.singleton;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:42
 * Function:
 * ����ģʽ������ģʽ��ʹ��ͬ�����ֹ���߳��²�������
 */

public class Singleton_3 {
  private static Singleton_3 instance = null;
  private Singleton_3(){}
  public static synchronized Singleton_3 getInstance(){
    if (null == instance)
      instance = new Singleton_3();
    return instance;
  }
}
