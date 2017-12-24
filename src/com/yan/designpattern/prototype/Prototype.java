package com.yan.designpattern.prototype;
/*
 * Version V1.0
 * Copyright (c) 1990-2018 by yan-hewen@163.com
 * Written by Mr. YanHeWen
 * Date 2017/12/21 21:54
 * Function:
 *
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable,Serializable {

  private static final long serialVersionUID = 1L;

  private String string;

  private SerializableObject obj;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return (Prototype)super.clone();
  }

  public Object deepClone() throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream ops = new ObjectOutputStream(bos);
    ops.writeObject(this);
    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bis);
    return ois.readObject();
  }

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  class SerializableObject implements Serializable{
    private static final long serialVersionUID = 1L;
  }
}
