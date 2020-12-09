package com.ariel.demo.demo.hello;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private MessageSource messageSource;
	
    @RequestMapping("/")
    public String home(){
        return "Hello Home!";
    }
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    
    //convert the data to Json
    @GetMapping("/bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("test1");
    }
    
    //Get variables
    //http://localhost:8080/bean/variable/shinnhee
    @GetMapping("/bean/variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Your name is %s", name));
    }
    
    @GetMapping("/international")
    public String international(@RequestHeader(name="Accpet-Language", required=false) Locale locale){
    	return "hello";
    	//return messageSource.getMessage("morning.message", null, LocaleContextHolder.getLocale());
    }
    
}
