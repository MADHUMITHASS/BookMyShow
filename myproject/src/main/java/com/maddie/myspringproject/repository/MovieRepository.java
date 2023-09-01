	
package com.maddie.myspringproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maddie.myspringproject.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
