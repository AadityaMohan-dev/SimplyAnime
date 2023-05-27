package com.simply_anime.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.simply_anime.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

	@Query("select c from Customer c where c.user.username=?1")
	Optional<Customer> findByUserName(String username);

}
