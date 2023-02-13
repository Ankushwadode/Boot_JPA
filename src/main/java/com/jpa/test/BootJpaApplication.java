package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootJpaApplication.class, args);
		
		UserRepository userrepo = context.getBean(UserRepository.class);
		
//create(User Object)
		
//		User user = new User();
//		user.setName("raj");
//		user.setCity("Nagpur");
//		user.setStatus("student");
//		
//		User user1 = new User();
//		user1.setName("ankit");
//		user1.setCity("Nagpur");
//		user1.setStatus("student");

//saving single user
		
//		User us = userrepo.save(user); 
//		System.out.println(us);
		
//saving multiple users(objects)
		
//		List<User> users = List.of(user,user1);
//		Iterable<User> result = userrepo.saveAll(users);
		
//		result.forEach(User->{
//			System.out.println(User);
//		});
		
//updating the user
		
//		Optional<User> id = userrepo.findById(452);
//		User user = id.get();
//		user.setName("Jitendra Wadode");
//		User result = userrepo.save(user);
//		System.out.println(result);
		
//getting the data
		
//		findbyid(id)-return optional containing your data
//		Optional<User> optional = userrepo.findById(453);
//		User user=optional.get();
//		System.out.println(user);
		
//findall gives all data
//		Iterable<User> itr = userrepo.findAll();
//old way
		
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()){
//			User user=iterator.next();
//			System.out.println(user);
//		}

//		new way but lengthy one
		
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		
//lambda process
		
//		itr.forEach(user->{System.out.println(user);});
		
//deleting...
		
//by id single delete.
//		userrepo.deleteById(453);
		
//total clean sweep
//		Iterable<User> alluser = userrepo.findAll();
//		alluser.forEach(user->System.out.println(user));
//		userrepo.deleteAll(alluser);
		
//		List<User> users = userrepo.findByNameAndCity("Ankush Wadode","Nagpur");
//		users.forEach(e->System.out.println(e));
		
//		List<User> allUser = userrepo.getAllUser();
//		allUser.forEach(e->{
//			System.out.println(e);
//		});
		
//		List<User> UBN = userrepo.getUserByName("tanmay","Nagpur");
//		UBN.forEach(e->{
//			System.out.println(e);
//		});
		
		userrepo.getall().forEach(e->System.out.println(e));
		System.out.println("done....");
		
	}

}
