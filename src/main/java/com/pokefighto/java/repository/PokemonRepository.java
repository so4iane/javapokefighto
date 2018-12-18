package com.pokefighto.java.repository;

import com.pokefighto.java.model.pokemons;
import org.springframework.data.repository.CrudRepository;


public interface PokemonRepository extends CrudRepository <pokemons, String>{

}
