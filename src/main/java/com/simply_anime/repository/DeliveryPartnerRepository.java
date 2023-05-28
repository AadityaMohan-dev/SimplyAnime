package com.simply_anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.simply_anime.model.DeliveryPartner;

public interface DeliveryPartnerRepository extends JpaRepository<DeliveryPartner, Long>{

	@Query("select d from DeliveryPartner d where d.user.username=?1")
	DeliveryPartner findByUsername(String username);

}
