package com.example.repository;

import androidx.lifecycle.LiveData;

import com.example.DB.PokemonDao;
import com.example.pokemonapp.Model.Pokemon;
import com.example.pokemonapp.Model.PokemonResponse;
import com.example.pokemonapp.Network.PokemonApiService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

public class Repository {
    private final PokemonApiService pokemonApiService;
    private PokemonDao pokemonDao;

    @Inject
    public Repository(PokemonApiService pokemonApiService ,  PokemonDao pokemonDao) {
        this.pokemonApiService = pokemonApiService;
        this.pokemonDao = pokemonDao;
    }

    public Observable<PokemonResponse> getPokemons(){
        return pokemonApiService.getPokemons();
    }

    public void insertPokemon(Pokemon pokemon){pokemonDao.insertPokemon(pokemon);}

    public void deletePokemon(String pokemonName){pokemonDao.deletePokemon(pokemonName);}

    public LiveData<List<Pokemon>> getFavPokemon(){
        return pokemonDao.getPokemons();
    }
}
