package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-05-06T06:54:10.487Z")

@RestSchema(schemaId = "servicestagec6u8xp")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Servicestagec6u8xpImpl {

    @Autowired
    private Servicestagec6u8xpDelegate userServicestagec6u8xpDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userServicestagec6u8xpDelegate.helloworld(name);
    }

}
