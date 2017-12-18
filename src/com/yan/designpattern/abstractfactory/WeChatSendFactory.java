package com.yan.designpattern.abstractfactory;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:24
 * Function:
 * ���󹤳����ģʽ������WechatSender���͵�ʵ��
 */

import com.yan.designpattern.model.Sender;

public class WeChatSendFactory implements Provider{

  @Override
  public Sender produce() {
    return new WechatSender();
  }
}
