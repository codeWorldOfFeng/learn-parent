/**
 * 
 */
package com.feng.learn.spring.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.feng.learn.spring.dao.MeetingDao;
import com.feng.learn.spring.dao.UserDao;

/**
 * @author feng
 *
 */
@Service
//@Scope("prototype")
@Scope("singleton")
@Lazy(false)

public class MeetingService {
	//@Resource
	private UserDao userDao;
	//@Autowired(required = false)
	private MeetingDao meetingDao;

	public void init() {
		System.out.println("init()");
	}

	public void destroy() {
		System.out.println("destroy()");
	}

	public void initMethod() {
		System.out.println("initMethod()");
	}

	public void destroyMethod() {
		System.out.println("destroyMethod()");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("@PostConstruct()");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy()");
	}
}
