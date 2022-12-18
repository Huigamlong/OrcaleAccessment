package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Element;
import com.example.demo.model.Result;
import com.example.demo.service.Fibonacii;

// @CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FibonacciController {

	@Autowired
	private Fibonacii fabo;

	@GetMapping("/fibonacci")
	public Result getRequest(@RequestBody Element element) {

		Result result = new Result();
		result.setFibonacci(fabo.fibonacii(element.getElement()));
		
		result.setSorted(fabo.sorted(fabo.fibonacii(element.getElement())));
		return result;
	}

	

}
