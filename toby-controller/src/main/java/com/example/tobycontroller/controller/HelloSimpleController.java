package com.example.tobycontroller.controller;

import com.example.tobycontroller.handler.adapter.SimpleController;

import java.util.Map;

public class HelloSimpleController extends SimpleController {

    public HelloSimpleController() {
        this.setRequireParams(new String[] {"name"});
        this.setViewName("/hello");
    }

    @Override
    public void control(Map<String, String> params, Map<String, Object> model) throws Exception {
        model.put("message", "Hello " + params.get("name"));
    }
}
