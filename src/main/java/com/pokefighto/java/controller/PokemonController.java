package com.pokefighto.java.controller;
import java.util.ArrayList;

import com.pokefighto.java.model.pokemons;
import com.pokefighto.java.repository.PokemonRepository;
import com.pokefighto.java.repository.AttaqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    @Autowired
    PokemonRepository pokemonRepository;
    @Autowired
    AttaqueRepository attaqueRepository;

    //Test RequestMapping en affichant tous les pokemons
    @RequestMapping("/listePokemons")
    public ArrayList<pokemons> pokeList(){
        ArrayList a = new ArrayList();
        a = (ArrayList) pokemonRepository.findAll();
        return a;
    }

    @RequestMapping ("/pokemonAttaque")
    //Recherche pokémon par URL et afficher son attaque
    public pokemons pokeAttaque(@RequestParam(value="nomPokemon", defaultValue="Mew") String nomPokemonPok){
        pokemons p = pokemonRepository.findOne(nomPokemonPok);
        return p;
    }

}
