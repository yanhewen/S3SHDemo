package com.yan.designpattern.abstractfactory;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:21
 * Function:
 * 抽象工厂设计模式，生产MailSender类型的实例
 */

import com.yan.designpattern.model.MailSender;
import com.yan.designpattern.model.Sender;

public class MailSendFactory implements Provider {

  @Override
  public Sender produce() {
    return new MailSender();
  }
}
