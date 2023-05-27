package com.simply_anime.dto;

import org.springframework.stereotype.Component;

import com.simply_anime.enums.StatusEnum;

@Component
public class ReqDelPartnerDto {
	
	private String DiliveryPatnerName;
	private String DiliveryPatneContact;
	private String DiliveryPatnEmail;
	private String DiliveryPatneRating;
	private StatusEnum status;
	private String username;
	private String password;
	
	public ReqDelPartnerDto() {
		
	}

	public ReqDelPartnerDto(String diliveryPatnerName, String diliveryPatneContact, String diliveryPatnEmail,
			String diliveryPatneRating, StatusEnum status, String username, String password) {
		super();
		DiliveryPatnerName = diliveryPatnerName;
		DiliveryPatneContact = diliveryPatneContact;
		DiliveryPatnEmail = diliveryPatnEmail;
		DiliveryPatneRating = diliveryPatneRating;
		this.status = status;
		this.username = username;
		this.password = password;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ReqDelPartnerDto [DiliveryPatnerName=" + DiliveryPatnerName + ", DiliveryPatneContact="
				+ DiliveryPatneContact + ", DiliveryPatnEmail=" + DiliveryPatnEmail + ", DiliveryPatneRating="
				+ DiliveryPatneRating + ", status=" + status + ", username=" + username + ", password=" + password
				+ "]";
	}
}
