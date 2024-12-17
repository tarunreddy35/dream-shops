package com.dailywork.dreamshops.repository;

 import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailywork.dreamshops.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
	  

	List<Image> findByProductId(Long id);
}
