package com.springboot.web;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.springboot.web.Service.ownerService;
import com.springboot.web.details.Details;
import com.springboot.web.inter.ownerRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
 public  class ContactWebAppApplicationTests {
	@Autowired
	private ownerService ownerservice;
	@MockBean
	private ownerRepo contactrepo;
	@Test
	 public void getUsersTest() {
		when(contactrepo.findAll()).thenReturn(Stream.of(new Details(23,"jkhjkh",12)).collect(Collectors.toList()));
		assertEquals(1,ownerservice.getUsers().size());

	}

}
