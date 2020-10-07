package com.lty.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lty.pojo.Category;
import com.lty.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Iterator;

@Controller
@RequestMapping(produces = "application/json;charset=UTF-8")
public class Controller01 {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/hello")
    public String getCategorys(){
        return "hello";
    }

    @RequestMapping(value = "/model")
    public ModelAndView getCategory(){
        ModelAndView mv = new ModelAndView("model");
        int count = 0;
        Iterator<Category> iterator = categoryService.getAllCategory().iterator();
        while (iterator.hasNext()){
            mv.addObject("category"+String.valueOf(count),iterator.next());
            count+=1;
        }
        System.out.println(mv);
        return mv;
    }
    @RequestMapping(value = "/testajax")
    @ResponseBody
    public String getAjax(@RequestParam int id){
        Category category = categoryService.getAllCategory().get(id - 1);
        return category.toString();
    }
}
