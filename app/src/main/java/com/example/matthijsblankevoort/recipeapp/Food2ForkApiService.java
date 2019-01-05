package com.example.matthijsblankevoort.recipeapp;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface Food2ForkApiService {
    String BASE_URL = "http://www.food2fork.com/";

    /**
     * Create a retrofit client.
     */
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    /**
     * The string in the GET annotation is added to the BASE_URL.
     * It simply represents the designed layout of the URLs of the numbersapi.com website,
     * refer to it in a browser and try. This request will deliver a json stream based on month and
     * day of month. It will be put in a DayQuoteTime object by Retrofit.
     */
    @GET("/api/search?key=b6724c66c110ae6fcef60119ca520173&sort=r&count=10")
    /**
     * "DayQuoteTime" is the name of the helper class just defined, defining the datamodel, and given as argument.
     * "getTodaysQuote" is the name of the symbol get method. It can be chosen at wish, as long as it is invoked
     * with the same name.
     */
    Call<RecipeList> getTopRatedRecipes();
}
