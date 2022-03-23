package com.springboot.web;

		import static org.junit.jupiter.api.Assertions.assertEquals;
		import static org.mockito.Mockito.*;

		import java.util.ArrayList;
		import java.util.stream.Collectors;
		import java.util.stream.Stream;

		import com.springboot.web.model.Details;
		import com.springboot.web.model.Reservation;
		import com.springboot.web.repository.contactRepo;
		import com.springboot.web.repository.reservationRepo;
		import com.springboot.web.service.guestService;
		import com.springboot.web.service.reservationService;
		import org.apache.tomcat.jni.Address;
		import org.junit.Test;
		import org.junit.runner.RunWith;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.test.context.SpringBootTest;
		import org.springframework.boot.test.mock.mockito.MockBean;
		import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public  class ReceptionistAppApplicationTests {
	@Autowired
	private guestService guestservice;
	@MockBean
	private contactRepo contactrepo;


	@Autowired
	private reservationService reservationservice;

	@MockBean
	private reservationRepo reservationrepo;

	@Test
	public void getAlGuestTest() {
		when(contactrepo.findAll()).thenReturn(Stream.of(new Details(23,"abc",1223L,"hsh","hh","jh","jhd","thg")).collect(Collectors.toList()));
		assertEquals(1,guestservice.getAlGuest().size());

	}
	@Test
	public void addGuesTest(){
		Details det=new Details(23,"abc",1223L,"hsh","hh","jh","jhd","thg");
		when(contactrepo.save(det)).thenReturn(det);
		assertEquals(det,guestservice.save(det));
	}



	@Test
	public void update() {
		Details updateDetails =  new Details(23,"abc",1223L,"hsh","hh","jh","jhd","thg");
		contactrepo.save(updateDetails);
		verify(contactrepo,times(1)).save(updateDetails);
	}

	@Test
	public void deleteById() {
		Integer userID = 23;
		guestservice.deleteById(userID);
		verify(contactrepo,times(1)).deleteById(userID);
	}

//@Test
//	public void addReservationTest(){
//	Reservation det =  new Reservation(2,2,2,"2002-02-09","2002-02-09","abc",new ArrayList<Address>());
//		when(reservationrepo.save(det)).thenReturn(det);
//		assertEquals(det,reservationservice.addGuest(det));
//	}


//	@Test
//	public void getReserve() {
//		when(reservationrepo.findAll()).thenReturn(Stream.of(new Reservation(2,2,2,"2002-02-09","2002-02-09","abc",new ArrayList<Address>())).collect(Collectors.toList()));
//		assertEquals(1,reservationservice.getReserved().size());
//
//	}

//	@Test
//	public void updateReservation() {
//		Reservation updateDetails =  new Reservation(2,2,2,"2002-02-09","2002-02-09","abc",new ArrayList<Address>());
//		reservationrepo.save(updateDetails);
//		verify(reservationrepo,times(1)).save(updateDetails);
//	}

@Test
	public void deleteReservation(){
		Integer userID=23;
	reservationservice.deleteReservation(userID);
	verify(reservationrepo,times(1)).deleteById(userID);
}






}



