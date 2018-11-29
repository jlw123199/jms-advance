package com.xl.serivceorder;

@FunctionalInterface
public interface FunctionInterfaceUtility<T> {

    T generate();


    FunctionInterfaceUtility<String> UUID = () -> java.util.UUID.randomUUID().toString();



    FunctionInterfaceUtility<Integer> AGE = () ->  5 ;


}
