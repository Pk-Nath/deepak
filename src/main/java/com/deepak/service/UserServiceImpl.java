package com.deepak.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.entity.User;
import com.deepak.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository ur;

	@Override
	public void saveData(User user) {
		ur.save(user);
	}

	@Override
	public User getDate(long id) {
		Optional<User> findById = ur.findById(id);
		if(findById.isPresent()) {
			User data=findById.get();
			return data;
		}else 
			return null;
	}

	@Override
	public String[] cityArray(String city) {
		String[] cities = city.trim().split("[|]");
		return cities;
	}
	
}
