//package com.example.ApiGateway.basicAuth.service;
//
//import com.example.ApiGateway.basicAuth.repo.UserRepo;
//import com.example.ApiGateway.details.UserModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class MyUserDetailService implements UserDetailsService {
//	@Autowired
//	private UserRepo repo;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//		UserModel normal = new UserModel();
//		normal.setId(1);
//		normal.setUserName("normal");
//		normal.setPassword(new BCryptPasswordEncoder().encode("normal"));
//		normal.setActive(true);
//		normal.setRoles("ROLE_NORMAL");
//		repo.save(normal);
//
//		UserModel manager = new UserModel();
//		manager.setId(2);
//		manager.setUserName("manager");
//		manager.setPassword(new BCryptPasswordEncoder().encode("manager"));
//		manager.setActive(true);
//		manager.setRoles("ROLE_MANAGER");
//		repo.save(manager);
//
//
//		UserModel owner = new UserModel();
//		owner.setId(2);
//		owner.setUserName("owner");
//		owner.setPassword(new BCryptPasswordEncoder().encode("owner"));
//		owner.setActive(true);
//		owner.setRoles("ROLE_OWNER");
//		repo.save(owner);
//
//		Optional<UserModel> user = repo.findByUserName(username);
//		user.orElseThrow(() -> new UsernameNotFoundException("Not Found" + username));
//		return user.map(MyUserDetail::new).get();
//	}
//
//}
