package com.maddie.myspringproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.maddie.myspringproject.model.Movie;
import com.maddie.myspringproject.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	MovieRepository movierepository;
	
	public Movie saveMovie(Movie movie)
	{
		return movierepository.save(movie);
	}
	public List<Movie> showMovie()
	{
		return movierepository.findAll();
	}
	public Movie updateMovie(Movie movie)
	{
		return movierepository.save(movie);
	}
	public String updateMoviebyId(int id, Movie movie)
	{
		movierepository.save(movie);
		if(movierepository.existsById(id))
		{
			return "The values are updated";
		}
		else
		{
			return "Please enter the valid id";
		}
	}
	public void deleteMovie(int id)
	{
		movierepository.deleteById(id);;
	}
	public List<Movie> sortinfo (String s)
	{
		return movierepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<Movie> getbypage (int pageno, int pagesize)
	{
		Page<Movie> p=movierepository.findAll(PageRequest.of(pageno,pagesize));
		return p.getContent();
	}
}
