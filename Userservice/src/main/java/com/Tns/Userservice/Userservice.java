package com.Tns.Userservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional


public class Userservice {
	
	@Autowired

	private UserserviceRepository repo;
	public List <User> listAll()
	{
		return repo.findAll();
	}
	public User get(Integer User_id)
	{
		return repo.findById(User_id).get();
	}
	public void delete(Integer User_id)
	{
		repo.deleteById(User_id);
	}
	public void save (User usr)
	{
		repo.save(usr);
	}

}
