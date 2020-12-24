package info.wailynnzaw.mytv;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TMDBService {
    @GET("/search/tv")
    Call<List<Series>> getSeries(@Query("api_key") String apiKey, @Query("query") String query);

    class Implementation {
        static ApiService get() {
            return getBuilder().build().create(ApiService.class);
        }
        static Retrofit.Builder getBuilder() {
            return new Retrofit.Builder()
                    .baseUrl("https://api.themoviedb.org/3/")
                    .addConverterFactory(GsonConverterFactory.create());
        }
    }
}
