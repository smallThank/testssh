package cn.stscode.stsblog.controller;

import cn.stscode.stsblog.dao.UserDao;
import cn.stscode.stsblog.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ConfigurationProperties(prefix = "user")
public class QucikController {

    @Autowired
    private UserDao userDao;

    //@Value("${user.username}")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    /*@RequestMapping("/getUser")
    @ResponseBody
    public List<User> test_one(){

        List<User> users = userDao.findUsers();
        return users;

    }*/

    @RequestMapping(path = "/user")
    @ResponseBody
    public String QuickTest(){
        System.out.println(username);
        return "welcome to spring boot";
    }

    @RequestMapping(path = "/dispatch")
    public String dispatcher(){
        return "success";
    }

}
