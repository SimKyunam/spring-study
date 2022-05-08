package com.example.tobycontroller.controller;

import com.example.tobycontroller.annotation.RequiredParams;
import com.example.tobycontroller.annotation.ViewName;
import com.example.tobycontroller.handler.custom.CustomController;

import java.util.Map;

public class HelloCustomController implements CustomController {

    @Override
    @ViewName("/hello")
    @RequiredParams({"name"})
    public void control(Map<String, String> params, Map<String, Object> model) {
        model.put("message", "Hello " + params.get("name"));
    }
}
