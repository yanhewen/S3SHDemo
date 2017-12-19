package com.yan.thread;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/19 20:23
 * Function:
 * synchronized(class)������static�������ǻ�ȡ����
 * ����������������ͬʱ��ȡ
 */

public class TestSynchronizedClass {
  public void test1(){
    synchronized (TestSynchronizedClass.class){
      int i=10;
      ShowThreadRun.showThreadRun(i);
    }
  }

  public static synchronized void test2(){
    int i=10;
    ShowThreadRun.showThreadRun(i);
  }

  public static void main(String[] args) {
    final TestSynchronizedClass testSynchronizedClass = new TestSynchronizedClass();

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        testSynchronizedClass.test1();
      }
    },"thread1");

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        testSynchronizedClass.test2();
      }
    },"thread2");

    thread1.start();
    thread2.start();
  }

}
