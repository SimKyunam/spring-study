package com.example.tobycontroller.handler.adapter;

import lombok.Setter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Setter
public abstract class SimpleController implements Controller {
    private String[] requireParams;
    private String viewName;

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        if(viewName == null) throw new IllegalStateException();

        Map<String, String> params = new HashMap<>();
        for(String param: requireParams) {
            String value = request.getParameter(param);
            if(value == null) throw new IllegalStateException();
            params.put(param, value);
        }

        Map<String, Object> model = new HashMap<>();
        this.control(params, model);

        return new ModelAndView(this.viewName, model);
    }

    public abstract void control(Map<String, String> params, Map<String, Object> model) throws Exception;
}
