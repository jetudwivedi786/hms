package com.springboot.web;

import com.springboot.web.details.staffDetails;
import com.springboot.web.inter.staffRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@SpringBootTest
class ManagerServiceApplicationTests {
//	@Autowired
//	private staffService service;
//	@MockBean
//	private staffRepo repo;

	@Test
	public  void getallstaffTest(){
//		when(repo.findAll()).thenReturn(Stream.of(new staffDetails("jeetu",87686886L,"jeetu@gmail","kanpur",34)).collect(Collectors.toList()));
//		assertEquals(1,service.getallstaff().size());

	}


}
