package com.example.springstudy.spring;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
public class XmlHello {
    private List<String> names;
    private Map<String, Integer> ages;
    private String dbName;
    private String dbUrl;
}
