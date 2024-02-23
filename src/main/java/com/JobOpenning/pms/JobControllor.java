package com.JobOpenning.pms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class JobControllor {
	
	@Autowired
	JobRepository repo;
	
	@GetMapping("/sh")
	public  String job()
	{
		return("hello Job Seekers!");
	}
	
	@PostMapping("/job")
	public JobOpenning addJob(@RequestBody JobOpenning job) {
		
		return repo.save(job);
			
	}
	
	@GetMapping("/job")
	public List<JobOpenning> getJob()
	{
		return repo.findAll();
	}
	@DeleteMapping("/job/{id}")
	public void deleteJob(@PathVariable int id)
	{
		repo.deleteById(id);
	}
	
	@PutMapping("/job/{id}")
	public JobOpenning  updateProduct(@PathVariable int id, @RequestBody JobOpenning job)
	{
		job.setJobId(id);
		return repo.save(job);
	}
	

}
