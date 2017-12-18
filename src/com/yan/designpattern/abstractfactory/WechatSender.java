package com.yan.designpattern.abstractfactory;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:23
 * Function:
 * 抽象工厂设计模式，新增的功能，验证此种模式的低耦合性，新增功能后不需改变现有的功能代码
 */

import com.yan.designpattern.model.Sender;

public class WechatSender implements Sender {

  @Override
  public void Send() {
    System.out.println("WeChat Send message");
  }
}
