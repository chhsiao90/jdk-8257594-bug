package org.example.jdk.bug;

import java.lang.reflect.Method;

public class MethodInfo implements PropertyInfo {

  private Class<?> type;
  private Method method;
  private String name;

  public MethodInfo(Class<?> type, Method method, String name) {
    this.type = type;
    this.method = method;
    this.name = name;
  }
}
