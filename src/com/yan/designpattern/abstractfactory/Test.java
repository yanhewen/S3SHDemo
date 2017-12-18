package com.yan.designpattern.abstractfactory;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:21
 * Function:
 * ���󹤳��������ͣ�ÿ��ʵ���е����Ĺ���������ÿ������������ʵ������ͬ�Ľṹ
 * �������������
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
