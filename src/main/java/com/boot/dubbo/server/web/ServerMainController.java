package com.boot.dubbo.server.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.summaryday.framework.d.BaseDaoImpl;
import com.summaryday.framework.d.IBaseDao;
import com.summaryday.framework.db.SpringBeanHelper;


//@ComponentScan(value = {"org.easyframework.controller"})
@Import(SpringBeanHelper.class)
@ImportResource("classpath:provider.xml")
@Controller
@SpringBootApplication
public class ServerMainController {

	@RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello world";
    }
	
	@Bean(name="baseDao")
	public IBaseDao getIBaseDao(){
		return new BaseDaoImpl();
	}
	

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerMainController.class, args);
    }
}
