package com.example.DVDRental.service;


import com.example.DVDRental.domain.Film;
import com.example.DVDRental.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {


    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Film getFilmById(Long id) {
        return filmRepository.findFirstById(id);
    }

}
