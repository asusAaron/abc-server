package com.abc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.service.TestService;

@Controller
@RequestMapping("/testController")
public class TestController {
    
    public static final Logger LOGGER = Logger.getLogger(TestController.class);
    
    @Autowired
    private TestService testService;
    
    @RequestMapping("/test")
    public void test(HttpServletRequest request, HttpServletResponse response) {
        try {
            String result = testService.testQuery();
            response.getWriter().print(result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
