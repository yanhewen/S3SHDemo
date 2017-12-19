package com.yan.thread;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/19 20:23
 * Function:
 * synchronized(class)跟修饰static方法都是获取类锁
 * 类锁跟对象锁可以同时获取
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
