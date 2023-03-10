package com.example.pokemonapp.Network;

import com.example.pokemonapp.Model.PokemonResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface PokemonApiService {
    @GET("pokemon")
    Observable<PokemonResponse> getPokemons();
}
