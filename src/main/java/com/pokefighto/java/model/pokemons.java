package com.pokefighto.java.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class pokemons {


    private Integer id;
    @Id
    @Column(name = "NOM_POKEMON_POK")
    private String nomPokemonPok;
    @Column(name="TYPE_POK")
    private String typePok;
    @Column(name="POINT_DE_VIE_POK")
    private Integer pointDeViePok;
    @Column(name="ATTAQUE_POK")
    private Integer attaquePok;
    @Column(name="DEFENSE_POK")
    private Integer defensePok;
    @Column(name="ATTAQUE_SPE_POK")
    private Integer attaqueSpePok;
    @Column(name="DEFENSE_SPE_POK")
    private Integer defenseSpePok;
    @Column(name="VITESSE_POK")
    private Integer vitessePok;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonManagedReference
    @JoinTable(name= "connaitre",
            joinColumns = @JoinColumn(name= "NOM_POKEMON_POK"),
            inverseJoinColumns = @JoinColumn (name= "NOM_ATTAQUE_AT")
    )
    private List<attaque> attaque;


    public pokemons(Integer id, String nomPokemonPok, String typePok, Integer pointDeViePok, Integer attaquePok, Integer defensePok, Integer attaqueSpePok, Integer defenseSpePok, Integer vitessePok, List<com.pokefighto.java.model.attaque> attaque) {
        this.id = id;
        this.nomPokemonPok = nomPokemonPok;
        this.typePok = typePok;
        this.pointDeViePok = pointDeViePok;
        this.attaquePok = attaquePok;
        this.defensePok = defensePok;
        this.attaqueSpePok = attaqueSpePok;
        this.defenseSpePok = defenseSpePok;
        this.vitessePok = vitessePok;
        this.attaque = attaque;
    }

    public pokemons() {
    }

    @Override
    public String toString() {
        return "pokemons{" +
                "id=" + id +
                ", nomPokemonPok='" + nomPokemonPok + '\'' +
                ", typePok='" + typePok + '\'' +
                ", pointDeViePok=" + pointDeViePok +
                ", attaquePok=" + attaquePok +
                ", defensePok=" + defensePok +
                ", attaqueSpePok=" + attaqueSpePok +
                ", defenseSpePok=" + defenseSpePok +
                ", vitessePok=" + vitessePok +
                ", attaque=" + attaque +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof pokemons)) return false;
        pokemons pokemons = (pokemons) o;
        return Objects.equals(id, pokemons.id) &&
                Objects.equals(nomPokemonPok, pokemons.nomPokemonPok) &&
                Objects.equals(typePok, pokemons.typePok) &&
                Objects.equals(pointDeViePok, pokemons.pointDeViePok) &&
                Objects.equals(attaquePok, pokemons.attaquePok) &&
                Objects.equals(defensePok, pokemons.defensePok) &&
                Objects.equals(attaqueSpePok, pokemons.attaqueSpePok) &&
                Objects.equals(defenseSpePok, pokemons.defenseSpePok) &&
                Objects.equals(vitessePok, pokemons.vitessePok) &&
                Objects.equals(attaque, pokemons.attaque);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nomPokemonPok, typePok, pointDeViePok, attaquePok, defensePok, attaqueSpePok, defenseSpePok, vitessePok, attaque);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomPokemonPok() {
        return nomPokemonPok;
    }

    public void setNomPokemonPok(String nomPokemonPok) {
        this.nomPokemonPok = nomPokemonPok;
    }

    public String getTypePok() {
        return typePok;
    }

    public void setTypePok(String typePok) {
        this.typePok = typePok;
    }

    public Integer getPointDeViePok() {
        return pointDeViePok;
    }

    public void setPointDeViePok(Integer pointDeViePok) {
        this.pointDeViePok = pointDeViePok;
    }

    public Integer getAttaquePok() {
        return attaquePok;
    }

    public void setAttaquePok(Integer attaquePok) {
        this.attaquePok = attaquePok;
    }

    public Integer getDefensePok() {
        return defensePok;
    }

    public void setDefensePok(Integer defensePok) {
        this.defensePok = defensePok;
    }

    public Integer getAttaqueSpePok() {
        return attaqueSpePok;
    }

    public void setAttaqueSpePok(Integer attaqueSpePok) {
        this.attaqueSpePok = attaqueSpePok;
    }

    public Integer getDefenseSpePok() {
        return defenseSpePok;
    }

    public void setDefenseSpePok(Integer defenseSpePok) {
        this.defenseSpePok = defenseSpePok;
    }

    public Integer getVitessePok() {
        return vitessePok;
    }

    public void setVitessePok(Integer vitessePok) {
        this.vitessePok = vitessePok;
    }

    public List<com.pokefighto.java.model.attaque> getAttaque() {
        return attaque;
    }

    public void setAttaque(List<com.pokefighto.java.model.attaque> attaque) {
        this.attaque = attaque;
    }
}
