package com.yan.designpattern.abstractfactory;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. Yanhewen
 * Date 2017/12/18 22:19
 * Function:
 * ���󹤳����ģʽ�������Ķ��������ӿ�
 */

import com.yan.designpattern.model.Sender;
import com.yan.designpattern.model.SnsSender;

public class SmsSenderFactory implements Provider {

  @Override
  public Sender produce() {
    return new SnsSender();
  }
}
