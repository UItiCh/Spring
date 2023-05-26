package com.HG.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.HG.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class LoginInterceptor implements HandlerInterceptor{

	// ���� ��Ӧ�����ص�ʱ��  
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	// ����ֵ true  ���� ���ŵ��ÿ�����           false ����
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
	    // �ж��Ƿ����ڵ�¼ 
		
		// 1. ��ȡ��ǰ������·��
		String uri = request.getRequestURI();
		
		//2. �ж�����·�����Ƿ����/login
		if(uri.indexOf("/login")>=0) {
			
			return true;
		}
		
		
		 // �жϵ�ǰ�û��Ƿ��¼
		//1. ��ȡsession
		HttpSession session = request.getSession();
		//2.��session��ȡuser
		User user = (User)session.getAttribute("USER_MSG");
		//3.�ж�user�Ƿ�Ϊ��
		if(user != null) {
			
			return  true;
		}
		
		//���ݴ�����Ϣ
		request.setAttribute("errMsg", "用户名或者密码错误");
		// ���û�е�¼  ��ȥ��¼
		request.getRequestDispatcher("/login").forward(request, response);
		
		return false;
	}

}
