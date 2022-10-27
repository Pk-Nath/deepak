package com.deepak.service;

import com.deepak.entity.User;

public interface UserService {

	public void saveData(User user);

	public User getDate(long id);

	public String[] cityArray(String city);

}
