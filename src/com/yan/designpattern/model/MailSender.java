package com.yan.designpattern.model;

/**
 * VERSION V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 20:31
 * Function:
 * ���ģʽ - ʵ���� Sender()�ӿڵ�MailSender��
 */

public class MailSender implements Sender{

  @Override
  public void Send() {
    System.out.println("MailSender Send a mail.");
  }
}
