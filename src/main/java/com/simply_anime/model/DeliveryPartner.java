package com.simply_anime.model;

import com.simply_anime.enums.StatusEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class DeliveryPartner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String DiliveryPatnerName;
	private String DiliveryPatneContact;
	private String DiliveryPatnEmail;
	private String DiliveryPatneRating;
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	@OneToOne
	private User user;
	
	//getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDiliveryPatnerName() {
		return DiliveryPatnerName;
	}
	public void setDiliveryPatnerName(String diliveryPatnerName) {
		DiliveryPatnerName = diliveryPatnerName;
	}
	public String getDiliveryPatneContact() {
		return DiliveryPatneContact;
	}
	public void setDiliveryPatneContact(String diliveryPatneContact) {
		DiliveryPatneContact = diliveryPatneContact;
	}
	public String getDiliveryPatnEmail() {
		return DiliveryPatnEmail;
	}
	public void setDiliveryPatnEmail(String diliveryPatnEmail) {
		DiliveryPatnEmail = diliveryPatnEmail;
	}
	public String getDiliveryPatneRating() {
		return DiliveryPatneRating;
	}
	public void setDiliveryPatneRating(String diliveryPatneRating) {
		DiliveryPatneRating = diliveryPatneRating;
	}
	public StatusEnum getStatus() {
		return status;
	}
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
