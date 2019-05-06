package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestServicestagec6u8xp {

        Servicestagec6u8xpDelegate servicestagec6u8xpDelegate = new Servicestagec6u8xpDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = servicestagec6u8xpDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}