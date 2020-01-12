package com.example.DVDRental.controller;

import com.example.DVDRental.DvdRentalApplication;
import com.example.DVDRental.domain.Film;
import com.example.DVDRental.domain.Responses;
import com.example.DVDRental.domain.RestResponse;
import com.example.DVDRental.service.FilmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/api")

public class FilmController {

    private static final Logger LOG = LoggerFactory.getLogger(DvdRentalApplication.class);

    @Autowired
    private FilmService filmService;

    @GetMapping(value = "/films")
    public ResponseEntity<?> getAllFilms(final HttpServletRequest request) {

        try {
            List<Film> films = filmService.getAllFilms();
            return Responses.createResponse(RequestMethod.GET, HttpStatus.OK, new RestResponse<>(films));

        } catch (Exception e) {
            LOG.error("Exception while fetching Clients.Please check the logs for more details.", e);
            return Responses.createResponse(RequestMethod.GET, HttpStatus.INTERNAL_SERVER_ERROR,
                    new RestResponse<String>("Failed to load the Clients!."));
        }

    }

    @GetMapping(value = "/films/{id}")
    public Film getFilm(@PathVariable Long id) {
        return filmService.getFilmById(id);
    }
}
