package com.sunpersonal.springboot.controller;


import com.sunpersonal.springboot.mapper.UserMapper;
import com.sunpersonal.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IDEA
 * <p>
 * author:Faqing Sun
 * <p>
 * Date:2018/11/7
 * <p>
 * Time:14:30
 */
@Controller
public class SpringbootController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/demo")
    @ResponseBody
    public List<User> demo() {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
