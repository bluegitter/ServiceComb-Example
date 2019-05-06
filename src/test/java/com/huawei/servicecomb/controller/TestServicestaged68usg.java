package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestServicestaged68usg {

        Servicestaged68usgDelegate servicestaged68usgDelegate = new Servicestaged68usgDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = servicestaged68usgDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}