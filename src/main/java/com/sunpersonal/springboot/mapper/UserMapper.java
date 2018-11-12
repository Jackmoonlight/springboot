package com.sunpersonal.springboot.mapper;

import com.sunpersonal.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IDEA
 * <p>
 * author:Faqing Sun
 * <p>
 * Date:2018/11/7
 * <p>
 * Time:15:03
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
