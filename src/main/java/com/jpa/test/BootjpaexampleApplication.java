package com.jpa.test;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entity.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		/*User u=new User();
		u.setName("naresh");
		u.setCity("Hyd");
		u.setStatus("alive");
		User u1=userRepository.save(u);
		System.out.println(u1);*/
		/*User user2=new User();
		user2.setName("Turab");
		user2.setCity("Hyd");
		user2.setStatus("Java Developer");
		User user3=new User();
		user3.setName("JK");
		user3.setCity("Hyd");
		user3.setStatus("Java And Spring boot Developer ");
		List<User> users=List.of(user2,user3);
		Iterable<User> result=userRepository.saveAll(users);*/
		/*Optional<User> optional=userRepository.findById(1);
		User user=optional.get();
		user.setName("Naresh Khatri");
		user.setCity("Hyd");
		user.setStatus("Java Developer");
		User result=userRepository.save(user);*/
		//Iterable<User> itr=userRepository.findAll();
		/*Iterator<User> iterator=itr.iterator();
		while(iterator.hasNext())
		{
			User user=iterator.next();
			System.out.println(user);
		}*/
		//itr.forEach(user->{System.out.println(user);});
		userRepository.deleteById(3);
		
		
	}

}
