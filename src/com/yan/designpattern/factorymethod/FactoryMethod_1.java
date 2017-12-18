package com.yan.designpattern.factorymethod;

import com.yan.designpattern.model.MailSender;
import com.yan.designpattern.model.Sender;
import com.yan.designpattern.model.SnsSender;

/**
 * VERSION V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 20:35
 * Function:
 * ��ͨ�Ĺ���ģʽ�����ò�ͬ�����ȷ�����ص�ʵ������
 * �����������ģʽ��ͨ������ͬ�Ĺ����������ز�ͬ�Ķ���
 * ��̬��������ģʽ��ͬ��
 */

public class FactoryMethod_1 {
  public static Sender produce(String type){
    if ("mail".equals(type)){
      return new MailSender();
    }
    else if ("sns".equals(type)){
      return new SnsSender();
    }
    else {
      System.out.println("type error!");
      return null;
    }
  }

  public static Sender produceMail(){
    return new MailSender();
  }

  public static void main(String[] args) {
    Sender sender = produce("sns");
    sender.Send();

    Sender sendeMail = produceMail();
    sendeMail.Send();
  }
}
