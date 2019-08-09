package com.paxcel.mail.controller;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.paxcel.mail.model.ADomain;
import com.paxcel.mail.model.Customer;
import com.paxcel.mail.service.CustomerService;

@Controller
public class MvcController {
	
	private static Logger log = LoggerFactory.getLogger(MvcController.class);
	
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/email") 
	  public String email( Model model) {
	  log.info("In the Email page controller");
	  
	  return "/email"; 
	  }
	 
	@PostMapping("/addAd")
	 public String addAd(@ModelAttribute("customer") ADomain ad ,Model model) {
		 log.info("In add Customer");
		 //customerService.addCustomer(ad);
		 return "redirect:customer";
	 }
	
	
	  @GetMapping("/ad/{adId}") 
	  @ResponseStatus(HttpStatus.FOUND)
	  public void emailAd(@PathVariable("adId") String adId, HttpServletResponse httpServletResponse) {
			  log.info("In the AD click controller id is:- "+adId);
			  System.err.println("ad id is "+adId);
			  httpServletResponse.setHeader("Location", "https://www.flipkart.com/");
			  httpServletResponse.setStatus(302);
	 // return "/email"; 
	  }
	 
	
	
	
	
	 @GetMapping("/customer") 
	  public String customer( Model model) {
	  log.info("In the Customer controller");
	  Customer customer = new Customer();
	  model.addAttribute("customer", customer);
	  return "/customer"; 
	  
	  }
	 
	
	 @PostMapping("/addCustomer")
	 public String customerAdd(@ModelAttribute("customer") Customer customer,Model model) {
		 log.info("In add Customer");
		 customerService.addCustomer(customer);
		 return "redirect:customer";
	 }
	 

}
