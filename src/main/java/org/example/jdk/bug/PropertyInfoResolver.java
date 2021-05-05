package org.example.jdk.bug;

import java.lang.reflect.Member;

public interface PropertyInfoResolver<M extends Member, PI extends PropertyInfo> {

  PI propertyInfoFor(Class<?> initialType, M member, String name);

  M[] membersFor(Class<?> type);
}
