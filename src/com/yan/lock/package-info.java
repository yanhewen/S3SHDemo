
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/27 22:31
 * Function:
 * Java中锁的分类
 */

package com.yan.lock;


/**
 * 1、公平锁、非公平锁
 * 公平锁：多个线程按照申请锁的顺序类获得锁
 * 非公平锁：多个线程获得锁的顺序并不是按照申请的顺序.而是随机的获取锁
 * ReentrantLock 中，可以hi在构造函数中指定是否是公平锁，默认是非公平锁；
 * synchronized而言，也是一种非公平锁；
 * 优点：非公平锁的吞吐量要比公平锁大
 */

/**
 * 2、可重入锁
 * 指一个线程在外层方法获取锁的时候，在进入内层方法的时候也会自动获取锁；
 * 如：ReentrantLock
 */
