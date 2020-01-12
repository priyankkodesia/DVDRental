package com.example.DVDRental.repository;

import java.util.Collection;
import java.util.List;

import com.example.DVDRental.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface FilmRepository extends JpaRepository<Film, Long> {

    public List<Film> findAll();

    public Film findFirstById(Long filmId);
}
