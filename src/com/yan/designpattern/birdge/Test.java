package com.yan.designpattern.birdge;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/26 23:07
 * Function:
 *
 */

public class Test {

  public static void main(String[] args) {
    Bridge bridge = new MyBridge();

    /*���õ�һ������*/
    Sourceable source1 = new SourceSub1();
    bridge.setSource(source1);
    bridge.method();

    /*���õڶ�������*/
    Sourceable source2 = new SourceSub2();
    bridge.setSource(source2);
    bridge.method();
  }
}
