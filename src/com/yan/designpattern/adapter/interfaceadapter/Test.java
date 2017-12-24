package com.yan.designpattern.adapter.interfaceadapter;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 22:40
 * Function:
 *
 */

public class Test {

  public static void main(String[] args) {
    Sourceable sourceable1 = new Sub1();
    Sourceable sourceable2 = new Sub2();

    Sourceable s1 = new WrapperAbstract();

    s1.method1();
    s1.method2();
    s1.method3();

//    sourceable1.method1();
//    sourceable1.method2();
//    sourceable1.method3();
//
//    sourceable2.method1();
//    sourceable2.method2();
//    sourceable2.method3();
  }


}
