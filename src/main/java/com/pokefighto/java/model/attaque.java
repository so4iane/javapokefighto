package com.pokefighto.java.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class attaque {

    @Column(name="ID_AT")
    private Integer id;
    @Id
    @Column(name = "NOM_ATTAQUE_AT")
    private String nomAttaqueAt;
    @Column(name="PUISSANCE_AT")
    private Integer puissanceAt;
    @Column(name="PRECISION_AT")
    private Integer precisionAt;
    @Column(name="TYPE_AT")
    private String typeAt;
    @Column(name="GENRE_AT")
    private String genreAt;


    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "attaque")
    @JsonBackReference
    private List<pokemons> pokemons;

    public attaque(Integer id, String nomAttaqueAt, Integer puissanceAt, Integer precisionAt, String typeAt, String genreAt, List<com.pokefighto.java.model.pokemons> pokemons) {
        this.id = id;
        this.nomAttaqueAt = nomAttaqueAt;
        this.puissanceAt = puissanceAt;
        this.precisionAt = precisionAt;
        this.typeAt = typeAt;
        this.genreAt = genreAt;
        this.pokemons = pokemons;
    }

    public attaque() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomAttaqueAt() {
        return nomAttaqueAt;
    }

    public void setNomAttaqueAt(String nomAttaqueAt) {
        this.nomAttaqueAt = nomAttaqueAt;
    }

    public Integer getPuissanceAt() {
        return puissanceAt;
    }

    public void setPuissanceAt(Integer puissanceAt) {
        this.puissanceAt = puissanceAt;
    }

    public Integer getPrecisionAt() {
        return precisionAt;
    }

    public void setPrecisionAt(Integer precisionAt) {
        this.precisionAt = precisionAt;
    }

    public String getTypeAt() {
        return typeAt;
    }

    public void setTypeAt(String typeAt) {
        this.typeAt = typeAt;
    }

    public String getGenreAt() {
        return genreAt;
    }

    public void setGenreAt(String genreAt) {
        this.genreAt = genreAt;
    }

    public List<com.pokefighto.java.model.pokemons> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<com.pokefighto.java.model.pokemons> pokemons) {
        this.pokemons = pokemons;
    }
}
