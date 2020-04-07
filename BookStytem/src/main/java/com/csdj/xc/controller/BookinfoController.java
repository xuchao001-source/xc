package com.csdj.xc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csdj.xc.pojo.Bookinfo;
import com.csdj.xc.pojo.Users;
import com.csdj.xc.service.BookinfoService;
import com.github.pagehelper.PageInfo;

@Controller
public class BookinfoController {
   @Autowired
   private BookinfoService service;
   
   @RequestMapping("/{page}")
   public String page(@PathVariable String page) {
	   return page;
   }
   
   @ResponseBody
   @RequestMapping("GetUsers")
   public String GetUsers(String usercode,String password,HttpSession session) {
	Users users = service.GetUsers(usercode, password);
	if(users==null) {
		return"NO";
	}
	session.setAttribute("usercode", users.getUsercode());
	return"YES";
   }
   
   @ResponseBody
   @RequestMapping("GetBookinfo")
   public PageInfo<Bookinfo> GetBookinfo(Integer booktype,String bookatuthor,Integer isborrow, Integer pageNum) {
	   Integer pageSize=3;
	   if(pageNum==null || pageNum==0) {
		   pageNum=1;
	   }
	PageInfo<Bookinfo> page= service.GetBookinfo(booktype, bookatuthor, isborrow, pageSize, pageNum);
	return page;
   }
   
   @ResponseBody
   @RequestMapping("Getbooktypeisborrow")
   public List<Bookinfo> Getbooktypeisborrow() {
	List<Bookinfo> bookinfos = service.Getbooktypeisborrow();
	return bookinfos;
   }
   
   @RequestMapping("clearsession")
   public String clearsession(HttpSession session) {
	   session.invalidate();
	   return"Login";
   }
}
