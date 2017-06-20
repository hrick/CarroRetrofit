package com.example.logonrm.carroretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarroApi carroApi = ApiUtils.getCarroAPIService();
        carroApi.listarTodos().enqueue(new Callback<List<Carro>>() {
            @Override
            public void onResponse(Call<List<Carro>> call, Response<List<Carro>> response) {
                for (Carro carro : response.body()) {
                    if (carro.getMarca() != null)
                        Log.i("CARRO", carro.getMarca());
                }
            }

            @Override
            public void onFailure(Call<List<Carro>> call, Throwable t) {

            }
        });

    }
}
