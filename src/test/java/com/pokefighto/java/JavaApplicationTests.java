package com.pokefighto.java;

import com.pokefighto.java.model.attaque;
import com.pokefighto.java.model.pokemons;
import com.pokefighto.java.repository.AttaqueRepository;
import com.pokefighto.java.repository.PokemonRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

import static com.pokefighto.java.repository.PokemonRepository.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaApplicationTests {
	@Autowired
	private PokemonRepository pokemonRepository;
	@Autowired
	private AttaqueRepository attaqueRepository;

	@Test
	public void testConnexionBdd() {
		//Given

		//When
		long nbPokemon = pokemonRepository.count();
		long nbAttaque = attaqueRepository.count();

		//Then
		Assert.assertTrue(nbPokemon > 0 && nbAttaque > 0);

	}

	@Test
	public void testTablesExistent() {
		Iterable<pokemons> listPokemons = pokemonRepository.findAll();
		Iterable<attaque> listAttaque = attaqueRepository.findAll();
		for (pokemons p : listPokemons)
		{
			System.out.println((p));

		}

	}

	@Test
    public void testJointures()throws Exception{
         //given
        String nomPokemonPok = "Aéromite";
        //String nomAttaqueAt = "Vampirisme";

        //when
        pokemons p = pokemonRepository.findOne(nomPokemonPok);
        //attaque a = attaqueRepository.findOne(nomAttaqueAt);

        //then
        Assert.assertTrue(p != null); System.out.println(p);
        System.out.println(p.getAttaque().size());
    }

}