package com.yan.thread;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/19 20:14
 * Function:
 *
 */

public class ShowThreadRun {
  protected static void showThreadRun(int i) {
    while(i-->0){
      System.out.println(Thread.currentThread().getName()+":"+i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
