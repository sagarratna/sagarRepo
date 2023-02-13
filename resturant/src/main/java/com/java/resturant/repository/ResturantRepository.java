package com.java.resturant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.resturant.entity.Resturant;
@Repository
public interface ResturantRepository extends JpaRepository<Resturant, Long>{

	@Query("from Resturant where resName=:name")
	List<Resturant> findName(String name);

}
