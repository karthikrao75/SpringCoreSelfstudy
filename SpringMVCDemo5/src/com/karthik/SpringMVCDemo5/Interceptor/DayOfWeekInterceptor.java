package com.karthik.SpringMVCDemo5.Interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse servletResponse, Object handler)
			throws Exception {
		Calendar calendar = Calendar.getInstance();
		int day_of_week = calendar.get(calendar.DAY_OF_WEEK);
		if (day_of_week == 1) {
			servletResponse.getWriter()
					.write("this site can be acessed only on week days wont be working on sunday for maintainance");
			return false;
		}
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse servletResponse, Object handler,
			ModelAndView modelAndView) throws Exception {
		// if the above method returns true then this method is called
		System.out.println("postHandle");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse servletResponse, Object handler,
			Exception exception) throws Exception {
// this method is called if the above method return true and after view is rendered for the response
		System.out.println("afterCompletion");
	}
}
