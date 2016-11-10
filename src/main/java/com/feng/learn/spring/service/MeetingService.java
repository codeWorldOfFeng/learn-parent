/**
 * 
 */
package com.feng.learn.spring.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feng.learn.spring.dao.MeetingDao;
import com.feng.learn.spring.dao.UserDao;

/**
 * @author feng
 *
 */
@Service("meetingService")
public class MeetingService {
	@Resource
	private UserDao userDao;
	@Autowired
	private MeetingDao meetingDao;

}
