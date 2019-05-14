package com.porto.portal.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.porto.portal.model.Demo;
import com.porto.portal.service.IDemoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import reactor.core.publisher.Flux;

@Controller
@RequestMapping("/demo")
@Api(value = "Demo Controller", description = "This Controller was built to be a example only")
public class DemoController {
	
	@Autowired
	private IDemoService service;
	
	static Logger log = LogManager.getLogger(DemoController.class);	
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	@ApiOperation(value = "Retrieve a list of Demo Object")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	    })
	public @ResponseBody Flux<Demo> index(){
		log.info("Controller find All");
		return service.findAll();
	}

	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ApiOperation(value = "Add an Demo Object")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource")
	 })
	public @ResponseBody Flux<Demo> salvarDemo(@ApiParam(value = "Demo object store in database table", required = true)
	@RequestBody Demo demo){
		log.info("save");
		return service.findAll();
	}
}
