package com.csdj.xc.service.impl;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csdj.xc.mapper.BookinfoMapper;
import com.csdj.xc.pojo.Bookinfo;
import com.csdj.xc.pojo.Users;
import com.csdj.xc.service.BookinfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;




@Service
public class BookinfoServiceImpl implements BookinfoService{
	@Autowired
	private BookinfoMapper mapper;

	@Override
	public Users GetUsers(String usercode, String password) {
		// TODO Auto-generated method stub
		return mapper.GetUsers(usercode, password);
	}

	@Override
	public PageInfo<Bookinfo> GetBookinfo(Integer booktype, String bookatuthor, Integer isborrow, Integer pageSize,
			Integer pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Bookinfo> list=mapper.GetBookinfo(booktype, bookatuthor, isborrow);
		PageInfo<Bookinfo> page=new PageInfo<>(list);
		return page;
	}

	@Override
	public List<Bookinfo> Getbooktypeisborrow() {
		// TODO Auto-generated method stub
		return mapper.Getbooktypeisborrow();
	}
    
}
