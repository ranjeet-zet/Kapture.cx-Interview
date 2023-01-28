package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CallsDao;

@RestController
public class MyController {
	
	
	@Autowired
	private CallsDao cDao;
	
	@GetMapping("/question1")
	public ResponseEntity<String> hourOftheDayVloume() {
		return new ResponseEntity<String>(cDao.HourOfTheDayWhenCallVolumeIsHights(),HttpStatus.OK);
	}
	
	
	
	@GetMapping("/question2")
	public ResponseEntity<String> hourOftheDayLongestCall() {
		return new ResponseEntity<String>(cDao.HourOfTheDayWhenCallareLongest(),HttpStatus.OK);
	}
	
	@GetMapping("/question3")
	public ResponseEntity<String> dayOftheWeakVloume() {
		return new ResponseEntity<String>(cDao.DayOfTheWeakWhenTheCallVolumeIsHighest(),HttpStatus.OK);
	}
	
	@GetMapping("/question4")
	public ResponseEntity<String> dayOftheweakLongestCall() {
		return new ResponseEntity<String>(cDao.DayOfTheWeakWhenTheCallAreLongest(),HttpStatus.OK);
	}
	

}
