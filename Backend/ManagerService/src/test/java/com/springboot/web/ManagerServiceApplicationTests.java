//package com.springboot.web;
//
////import com.springboot.web.details.staffDetails;
////import com.springboot.web.inter.staffRepo;
////import com.springboot.web.service.staffService;
////import org.junit.Test;
////import org.junit.runner.RunWith;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.boot.test.context.SpringBootTest;
////import org.springframework.boot.test.mock.mockito.MockBean;
////import org.springframework.test.context.junit4.SpringRunner;
////
////import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import com.springboot.web.details.staffDetails;
//import com.springboot.web.inter.staffRepo;
//import com.springboot.web.service.staffService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//@RunWith(SpringRunner.class)
//@SpringBootTest
// public class ManagerServiceApplicationTests {
//	@Autowired
//	private staffService staffService;
//	@MockBean
//	private staffRepo repo;
//
//	@Test
//	public  void getUsersTest(){
//		when(repo.findAll()).thenReturn(Stream.of(new staffDetails(1,"jeetu","abc",21,34567L,"jsksk")).collect(Collectors.toList()));
//		assertEquals(1,staffService.getUsers().size());
//
//	}
//
//
//}
