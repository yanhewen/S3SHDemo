package com.yan.threadpool;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/26 22:37
 * Function:
 * �ɻ����̳߳�:newCachedThreadPool��
 * ����̳߳س��ȳ���������Ҫ���������տ����̣߳�
 * ���޿ɻ��գ����½��߳�
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommonThreadPool {

  public static void main(String[] args) {

    // newCachedThreadPool
    ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
    for(int i=0;i<10;i++){
      final int index = i;

      try {
        Thread.sleep(100*index);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      /*
      newCachedThreadPool.execute(new Runnable() {
        @Override
        public void run() {
          System.out.println("index:"+index+";Thread Name:"+Thread.currentThread().getName());
        }
      });
      */
    }

    // newFixedThreadPool
    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
    for (int i = 0; i < 10; i++) {
      final int index = i;
      fixedThreadPool.execute(() -> {
        try{
          System.out.println("index:"+index+";Thread Name:"+Thread.currentThread().getName());
          Thread.sleep(2000);

        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });
    }
  }
}
