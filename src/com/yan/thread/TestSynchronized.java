package com.yan.thread;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/19 20:13
 * Function:
 * synchronized 修饰方法或者this对象获取的是对象锁，
 * 类中一个同步方法被其他线程获取对象锁后，其他获取这个锁的线程都会被阻塞
 */

public class TestSynchronized {
  public synchronized void test1(){
    // 对象锁，获取到对象锁之后，其他线程就不能都获取这个锁，但是没锁的线程还可以继续执行
//    synchronized(this){
      int i=10;
      ShowThreadRun.showThreadRun(i);
//    }
  }
  public synchronized void test2(){
    int j=10;
    ShowThreadRun.showThreadRun(j);
  }

  public static void main(String[] args) {
    TestSynchronized testSynchronized = new TestSynchronized();
    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        testSynchronized.test1();
      }
    },"thread1");
    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        testSynchronized.test2();
      }
    },"thread2");
    thread1.start();
    thread2.start();
  }

}
