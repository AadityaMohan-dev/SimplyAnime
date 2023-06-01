package com.simply_anime.dto;

import org.springframework.stereotype.Component;

import com.simply_anime.enums.StatusEnum;

@Component
public class ResDelPartnerDto {
	
	private long id;
	private String DiliveryPatnerName;
	private String DiliveryPatneContact;
	private String DiliveryPatnEmail;
	private String DiliveryPatneRating;
	private StatusEnum status;
	
	public ResDelPartnerDto() {
		
	}

	public ResDelPartnerDto(long id, String diliveryPatnerName, String diliveryPatneContact, String diliveryPatnEmail,
			String diliveryPatneRating, StatusEnum status) {
		super();
		this.id = id;
		DiliveryPatnerName = diliveryPatnerName;
		DiliveryPatneContact = diliveryPatneContact;
		DiliveryPatnEmail = diliveryPatnEmail;
		DiliveryPatneRating = diliveryPatneRating;
		this.status = status;
	}

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

	public String toString() {
		return "ResDelPartnerDto [id=" + id + ", DiliveryPatnerName=" + DiliveryPatnerName + ", DiliveryPatneContact="
				+ DiliveryPatneContact + ", DiliveryPatnEmail=" + DiliveryPatnEmail + ", DiliveryPatneRating="
				+ DiliveryPatneRating + ", status=" + status + "]";
	}
	
}
