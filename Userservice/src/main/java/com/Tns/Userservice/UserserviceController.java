package com.Tns.Userservice;

import java.util.List;
import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController

public class UserserviceController {
	
	@Autowired
	private Userservice u;

	@GetMapping (("/UserServices"))
	public List<User> list()
	{
		return u.listAll();
	}
	@GetMapping("/UserServices/(User_id)")
	public ResponseEntity<User> get (@PathVariable Integer User_id)
	{
		try
		{
			User User=u.get(User_id);
			return new ResponseEntity<User>(User,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/UserServices")
	public void add(@RequestBody User usr)
	{
		u.save(usr);
	}
	@PutMapping("/UserServices/(User_id)")
	public ResponseEntity<?> update(@RequestBody User usr,@PathVariable Integer User_id)
	{
		User existuser=u.get(User_id);
		u. save (usr);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/ UserServices / (User_id)")
	public void delete (@PathVariable Integer User_id)
	{
		u.delete(User_id);
	}



}
