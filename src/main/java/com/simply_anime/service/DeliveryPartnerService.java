package com.simply_anime.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.simply_anime.dto.ReqDelPartnerDto;
import com.simply_anime.dto.ResDelPartnerDto;
import com.simply_anime.enums.StatusEnum;
import com.simply_anime.model.DeliveryPartner;
import com.simply_anime.model.User;
import com.simply_anime.repository.DeliveryPartnerRepository;
import com.simply_anime.repository.UserRepository;

@Service
public class DeliveryPartnerService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private DeliveryPartnerRepository dpr;
	
	
	// add delivery Partner
	public ResponseEntity<Object> addDeliveryPartner(ReqDelPartnerDto rdp) {
		User user = new User(); // make user object
		user.setUsername(rdp.getUsername());
		user.setPassword(rdp.getPassword());
		user.setRole("DELIVERY PARTNER");
		String encodePassword = passwordEncoder.encode(rdp.getPassword()); // here we encoded the password with password encoder
		user.setPassword(encodePassword);
		user = userRepository.save(user); // save user to user repository . 
		
		DeliveryPartner dip = new DeliveryPartner();
		dip.setDiliveryPatneContact(rdp.getDiliveryPatneContact());
		dip.setDiliveryPatnEmail(rdp.getDiliveryPatnEmail());
		dip.setDiliveryPatneRating(rdp.getDiliveryPatneRating());
		dip.setDiliveryPatnerName(rdp.getDiliveryPatnerName());
		dip.setStatus(StatusEnum.AVAILABLE);
		dip.setUser(user);
		
		dpr.save(dip);
		return ResponseEntity.status(HttpStatus.OK).body("Dilivery Patner Added Sucessfully");
	}
	
	//get delivery partner Details
	public ResponseEntity<Object> getDeliveryPartnersDetails(ResDelPartnerDto rdpd){
		List<DeliveryPartner> list = dpr.findAll();
		List<ResDelPartnerDto> listDto = new ArrayList<>();
		for(DeliveryPartner dp : list) {
			ResDelPartnerDto dto = new ResDelPartnerDto();
			dto.setDiliveryPatneContact(dp.getDiliveryPatneContact());
			dto.setDiliveryPatnEmail(dp.getDiliveryPatnEmail());
			dto.setDiliveryPatneRating(dp.getDiliveryPatneRating());
			dto.setDiliveryPatnerName(dp.getDiliveryPatnerName());
			dto.setId(dp.getId());
			dto.setStatus(dp.getStatus());
			
			listDto.add(dto);
		}
		return ResponseEntity.status(HttpStatus.OK).body(listDto);
	}
	
	//get delivery partner by id
	public ResponseEntity<Object> getDeliveryPartnerById(long id, ResDelPartnerDto rdpd){
		Optional<DeliveryPartner> optional = dpr.findById(id);
		if(optional.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Delivery Partner Not Found Check your id.");
		}
		DeliveryPartner dp = optional.get();
		
		rdpd.setDiliveryPatneContact(dp.getDiliveryPatneContact());
		rdpd.setDiliveryPatnEmail(dp.getDiliveryPatnEmail());
		rdpd.setDiliveryPatneRating(dp.getDiliveryPatneRating());
		rdpd.setDiliveryPatnerName(dp.getDiliveryPatnerName());
		rdpd.setId(dp.getId());
		rdpd.setStatus(dp.getStatus());
		
		return ResponseEntity.status(HttpStatus.OK).body(dp);
	}

	public ResponseEntity<Object> getDeliveryPartnerByUserName(String username, ResDelPartnerDto rdpd) {
		Optional<DeliveryPartner> optional = Optional.of(dpr.findByUsername(username));
		if(optional.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Delivery Partner Not Found Check your username.");
		}
		DeliveryPartner dp = optional.get();
		
		rdpd.setDiliveryPatneContact(dp.getDiliveryPatneContact());
		rdpd.setDiliveryPatnEmail(dp.getDiliveryPatnEmail());
		rdpd.setDiliveryPatneRating(dp.getDiliveryPatneRating());
		rdpd.setDiliveryPatnerName(dp.getDiliveryPatnerName());
		rdpd.setId(dp.getId());
		rdpd.setStatus(dp.getStatus());
		
		return ResponseEntity.status(HttpStatus.OK).body(dp);
	}

	public ResponseEntity<Object> deleteDeliveryPartnerById(long id, ResDelPartnerDto rdpd) {
		Optional<DeliveryPartner> optional = dpr.findById(id);
		if(optional.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Delivery Partner Not Found Check your id.");
		}
		
		return null;
	}
	
	
}
