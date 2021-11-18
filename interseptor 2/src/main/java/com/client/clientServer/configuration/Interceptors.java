package com.client.clientServer.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class Interceptors implements HandlerInterceptor {

    Logger log = LoggerFactory.getLogger(Interceptors.class);

    @Autowired
    RestTemplate restTemplate;

//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        log.info("pre handler is completed");
//        Boolean boolObject = restTemplate.getForObject("http://localhost:8080/validate", Boolean.class);
//        if (boolObject == true) {
//            return boolObject;
//        }
//        return false;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        log.info("post handler is successful");
//        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        log.info("message after completion");
//        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
//    }
}
