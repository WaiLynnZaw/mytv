package info.wailynnzaw.mytv;

import com.google.gson.JsonArray;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface ApiService {
    @GET("series")
    Call<List<Series>> getSeries();

    class Implementation {
        static ApiService get() {
            return getBuilder().build().create(ApiService.class);
        }
        static Retrofit.Builder getBuilder() {
            return new Retrofit.Builder()
                    .baseUrl("https://mytv-json.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create());
        }
    }
}

