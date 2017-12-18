package com.yan.designpattern.model;

/**
 * VERSION V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 20:32
 * Function:
 * 设计模式 - 实现了 Sender()SnsSender类
 */

public class SnsSender implements Sender{

  @Override
  public void Send() {
    System.out.println("SNSSender Send a message");
  }
}
