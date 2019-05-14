package com.porto.portal.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.porto.portal.model.Demo;
import com.porto.portal.repository.IDemoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DemoService implements IDemoService {
	
	@Autowired
	private IDemoRepository demoRepository;
	
	private static Logger log = LogManager.getLogger(DemoService.class);	
	
	@Override
	public void create(Demo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mono<Demo> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Demo> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Demo> findAll() {
		log.info("Service");
		return Flux.fromIterable(demoRepository.findAll());
	}

	@Override
	public Mono<Demo> update(Demo e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
