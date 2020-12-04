package com.javaproject.mentalillnessdetector.controller;





import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaproject.mentalillnessdetector.model.Professional;

import com.javaproject.mentalillnessdetector.repository.ProfessionalRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/apis/v1/")
public class ProfessionalController {
	@Autowired
	private ProfessionalRepository professionalRepository;

	
	@GetMapping("/professionals")
	public List<Professional> getAllProfessionals(){
		 

		return professionalRepository.findAll();
	}
	//creating professional API
	@PostMapping("/professionals")
	public Professional createProfessional(@RequestBody Professional professional) {
		return professionalRepository.save(professional);
	}

}
