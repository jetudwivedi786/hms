package com.springboot.web;


import com.springboot.web.model.roomDetails;
import com.springboot.web.repository.roomRepo;
import com.springboot.web.service.roomService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
 public  class ManagerServiceAppApplicationTests {
	@Autowired
	private roomService roomservice;
	@MockBean
	private roomRepo roomrepo;

	@Test
	public void getUsersTest() {
		when(roomrepo.findAll()).thenReturn(Stream.of(new roomDetails(23,678.7,"jkhjkh","qwe")).collect(Collectors.toList()));
		assertEquals(1,roomservice.getAlRooms().size());

	}
	@Test
	public void deleteroomsTest() {
		Integer userID = 2;
		roomservice.deleteById(userID);
		verify(roomrepo,times(1)).deleteById(userID);
	}
}
