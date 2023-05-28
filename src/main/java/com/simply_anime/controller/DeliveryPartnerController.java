package com.simply_anime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simply_anime.dto.ReqDelPartnerDto;
import com.simply_anime.dto.ResDelPartnerDto;
import com.simply_anime.service.DeliveryPartnerService;

@RestController
@RequestMapping("api/dilPatner")
public class DeliveryPartnerController {
	
	@Autowired
	private DeliveryPartnerService dp;
	
	@PostMapping("/add")
	public ResponseEntity<Object> addDeliveryPartner(@RequestBody ReqDelPartnerDto rdp){
		return dp.addDeliveryPartner(rdp);
	}
	
	@GetMapping("/get/all")
	public ResponseEntity<Object> getDeliveryPartners(@RequestBody ResDelPartnerDto rdpd){
		return dp.getDeliveryPartnersDetails(rdpd);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Object> getDeliveryPartnerById(@PathVariable("id")long id,@RequestBody ResDelPartnerDto rdpd){
		return dp.getDeliveryPartnerById(id,rdpd);
	}
	
	@GetMapping("/get/{username}")
	public ResponseEntity<Object> getDeliveryPartnerByUserName(@PathVariable("username")String username, @RequestBody ResDelPartnerDto rdpd){
		return dp.getDeliveryPartnerByUserName(username,rdpd);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteDeliveryPartnerById(@PathVariable("id")long id,@RequestBody ResDelPartnerDto rdpd){
		return dp.deleteDeliveryPartnerById(id,rdpd);
	}
}
