package com.yan.thread;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/19 20:13
 * Function:
 * synchronized ���η�������this�����ȡ���Ƕ�������
 * ����һ��ͬ�������������̻߳�ȡ��������������ȡ��������̶߳��ᱻ����
 */

public class TestSynchronized {
  public synchronized void test1(){
    // ����������ȡ��������֮�������߳̾Ͳ��ܶ���ȡ�����������û�����̻߳����Լ���ִ��
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
