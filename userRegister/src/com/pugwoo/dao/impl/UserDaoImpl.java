package com.pugwoo.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.pugwoo.dao.UserDao;
import com.pugwoo.model.User;

/**
 * ���ڴ���ģ�����ݿ�
 */
public class UserDaoImpl implements UserDao {

	//ģ�������ݿ��е�����
	private static Map<String,User> userList = new HashMap<String,User>();
	
	//��ʼ��һЩ����
	static{
		User user;
		user = new User("admin","admin");
		userList.put(user.getUsername(), user);
		user = new User("pugwoo","123456");
		userList.put(user.getUsername(), user);
	}
	
	@Override
	public void deleteUserByName(String name) {
		userList.remove(name);
	}

	@Override
	public User getUserByName(String name) {
		return userList.get(name);
	}

	@Override
	public String[] getUsernameList() {
		return (String[])userList.keySet().toArray();
	}

	@Override
	public void saveUser(User user) {
		userList.put(user.getUsername(), user);
	}

}
