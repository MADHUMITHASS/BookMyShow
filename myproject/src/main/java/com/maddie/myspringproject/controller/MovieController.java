package com.maddie.myspringproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.maddie.myspringproject.model.Movie;
import com.maddie.myspringproject.service.MovieService;

public class MovieController {
	@Autowired
	MovieService movieservice;
	
	@PostMapping("/save")
	public Movie saveTheMovie(@RequestBody Movie movie)
	{
		return movieservice.saveMovie(movie);
	}
	
	@GetMapping("/get")
	public List<Movie> showTheMovie()
	{
		return movieservice.showMovie();
	}
	@PutMapping("/update")
	public Movie updateTheUser(@RequestBody Movie movie)
	{
		return movieservice.updateMovie(movie);
	}
	

	@DeleteMapping("delete/{id}")
	public void deleteById(@PathVariable int movieId)
	{
		movieservice.deleteMovie(movieId);
	}

	@PutMapping("update/{id}")
	public String changeById(@PathVariable int movieId, @RequestBody Movie movie)
	{
		return movieservice.updateMoviebyId(movieId, movie);
	}
	
	@GetMapping("sort/{name}")
    public List<Movie> getSort(@PathVariable String name)
    {
    	return movieservice.sortinfo(name);
    }
    @GetMapping("{pageno}/{pagesize}")
    public List<Movie> showpageinfo(@PathVariable int pageno, @PathVariable int pagesize)
    {
    	return movieservice.getbypage(pageno,pagesize);
    }
}

