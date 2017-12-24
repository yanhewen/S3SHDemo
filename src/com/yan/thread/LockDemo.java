package com.yan.thread;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/19 21:04
 * Function:
 *
 */

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

  class MyService {
    private ReentrantLock lock = new ReentrantLock();

    public void method(){

      try {
        lock.lock();
        for (int i = 0; i <= 3; i++){
          Thread.sleep(1000);
          System.out.println(Thread.currentThread().getName()+":"+i);
        }
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      finally {
        lock.unlock();
      }
    }
  }
  class MyThread extends Thread{

  }
}
