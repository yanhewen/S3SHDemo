package com.yan.designpattern.abstractfactory;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:21
 * Function:
 * 抽象工厂方法类型，每个实例有单独的工厂方法，每个工厂方法都实现了相同的结构
 * 用来降低耦合性
 */

import com.yan.designpattern.model.Sender;

public class Test {

  public static void main(String[] args) {
    Provider provider = new MailSendFactory();
    Sender sender = provider.produce();
    sender.Send();

    Provider provider1 = new WeChatSendFactory();
    Sender sender1 = provider1.produce();
    sender1.Send();
  }

}
