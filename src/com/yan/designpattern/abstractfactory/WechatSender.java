package com.yan.designpattern.abstractfactory;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:23
 * Function:
 * ���󹤳����ģʽ�������Ĺ��ܣ���֤����ģʽ�ĵ�����ԣ��������ܺ���ı����еĹ��ܴ���
 */

import com.yan.designpattern.model.Sender;

public class WechatSender implements Sender {

  @Override
  public void Send() {
    System.out.println("WeChat Send message");
  }
}
