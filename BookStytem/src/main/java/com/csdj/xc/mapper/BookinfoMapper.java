package com.csdj.xc.mapper;

import java.util.List;

import com.csdj.xc.pojo.Bookinfo;
import com.csdj.xc.pojo.Users;

public interface BookinfoMapper {
    Users GetUsers(String usercode,String password);
    List<Bookinfo> GetBookinfo(Integer booktype,String bookatuthor,Integer isborrow);
    List<Bookinfo> Getbooktypeisborrow();
}
