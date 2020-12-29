package com.oxx.Blog.controller;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oxx.Blog.common.Result;
import com.google.code.kaptcha.Producer;
import com.oxx.Blog.pojo.User;
import com.oxx.Blog.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController  extends BaseController<User,UserService>{
	
	@Autowired
	private UserService userService;
	@Autowired
    private Producer kaptchaProducer;
	
	@RequestMapping("/login")
	public Result login(User user,String vercode,HttpServletRequest request,HttpSession session) {
		
		Result result=new Result();
		if(vercode==null||"".equals(vercode)) {
			result.setCode(Result.ERROR_CODE);
			result.setMessage("没有输入验证码");
			return result;
		}
		String s_kaptcha=(String) session.getAttribute("kaptcha");
		if(!vercode.equalsIgnoreCase(s_kaptcha)) {
			result.setCode(Result.ERROR_CODE);
			result.setMessage("验证码输入错误");
			return result;
		}
		User t_user=userService.login(user);
		if(t_user==null) {
			result.setCode(Result.ERROR_CODE);
			result.setMessage("用户名或密码错误！");
		}else {
			session.setAttribute("user", t_user);
		}
		return result;
	}
	
	@RequestMapping("/exit")
	public void tc(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException {
		Enumeration em = request.getSession().getAttributeNames();  //得到session中所有的属性名
		while (em.hasMoreElements()) {
			request.getSession().removeAttribute(em.nextElement().toString()); //遍历删除session中的值
		}
	}
	
	@RequestMapping("/findUserById")
	public Result findUserById(int admin_user_id) {
		
		User user=userService.findUserById(admin_user_id);
		
		Result result=new Result(Result.SUCCESS_CODE, "", user);
		
		return result;
	}
	
	@RequestMapping("/list")
	public Result list(User user) {
		
		List<User> list = userService.list(user);
		
		return new Result(Result.SUCCESS_CODE, "",list);
		
	}
	
	@RequestMapping("/edit")
	public Result edit(User user) {
		
		int row=userService.edit(user);
		
		return new Result(Result.SUCCESS_CODE, "",row);
	
	}
	
	@RequestMapping("/edits")
	public Result edits(User user) {
		
		int row=userService.edits(user);
		
		return new Result(Result.SUCCESS_CODE, "",row);
	
	}
	
	@RequestMapping(path = "/kaptcha", method = RequestMethod.GET)
    public void getKaptcha(HttpServletResponse response, HttpSession session) {
        String text = kaptchaProducer.createText();
        System.out.println(text);
        BufferedImage image = kaptchaProducer.createImage(text);
        session.setAttribute("kaptcha", text);
        response.setContentType("image/png");
        try {
            OutputStream os = response.getOutputStream();
            ImageIO.write(image, "png", os);
        } catch (IOException e) {
        }
    }
}
