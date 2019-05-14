package com.porto.portal.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.porto.portal.model.Demo;

public interface IDemoRepository extends JpaRepository<Demo, Long> {
	
	@Cacheable(value = "demos")
	List<Demo> findAll();

}
