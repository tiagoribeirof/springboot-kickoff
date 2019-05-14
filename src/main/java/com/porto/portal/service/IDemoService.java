package com.porto.portal.service;

import com.porto.portal.model.Demo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDemoService {
	
	void create(Demo e);
    
    Mono<Demo> findById(Long id);
 
    Flux<Demo> findByName(String name);
 
    Flux<Demo> findAll();
 
    Mono<Demo> update(Demo e);
 
    Mono<Void> delete(Long id);

}
