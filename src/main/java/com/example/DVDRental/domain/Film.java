package com.example.DVDRental.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "film")
@Entity
public class Film implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="film_id")
    private Long id;
    private String title;
    private String description;
    @Column(name="release_year")
    private Integer releaseYear;
    @Column(name="language_id")
    private Integer languageId;
    @Column(name="rental_duration")
    private Integer rentalDuration;
    @Column(name="rental_rate")
    private Float rentalRate;
    private Integer length;
    @Column(name="replacement_cost")
    private Float replacementCost;
    private String rating;
    @Column(name="last_update")
    private Timestamp lastUpdate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public Float getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(Float rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Float getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(Float replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}


