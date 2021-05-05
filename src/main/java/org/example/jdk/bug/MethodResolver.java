package org.example.jdk.bug;

import java.lang.reflect.Method;

public class MethodResolver implements PropertyInfoResolver<Method, MethodInfo> {

  @Override
  public MethodInfo propertyInfoFor(Class<?> initialType, Method member, String name) {
    return new MethodInfo(initialType, member, name);
  }

  @Override
  public Method[] membersFor(Class<?> type) {
    return type.getDeclaredMethods();
  }
}
