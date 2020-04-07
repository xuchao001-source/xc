package com.csdj.xc.service;



import java.util.List;

import com.csdj.xc.pojo.Bookinfo;
import com.csdj.xc.pojo.Users;
import com.github.pagehelper.PageInfo;

public interface BookinfoService {
	Users GetUsers(String usercode,String password);
    PageInfo<Bookinfo> GetBookinfo(Integer booktype,String bookatuthor,Integer isborrow,Integer pageSize,Integer pageNum);
    List<Bookinfo> Getbooktypeisborrow();
}
