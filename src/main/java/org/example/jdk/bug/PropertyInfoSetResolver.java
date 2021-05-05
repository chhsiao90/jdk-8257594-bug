package org.example.jdk.bug;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.util.LinkedHashMap;
import java.util.Map;

public class PropertyInfoSetResolver {

  public static <M extends AccessibleObject & Member, PI extends PropertyInfo> Map<String, PI> resolveProperties(
      Class<?> type, PropertyInfoResolver<M, PI> resolver) {
    Map<String, PI> properties = new LinkedHashMap<>();
    for (M member : resolver.membersFor(type)) {
      String name = member.getName();
      PI pi = resolver.propertyInfoFor(type, member, name);
      properties.put(name, pi);
    }
    return properties;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 20000; i++) {
      System.out.println(resolveProperties(Map.class, new MethodResolver()).size());
    }
  }
}
