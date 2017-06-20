package com.example.logonrm.carroretrofit;

/**
 * Created by logonrm on 19/06/2017.
 */

public class ApiUtils {

    private ApiUtils() {
    }

    public static final String BASE_URL = "http://10.3.1.37:3000";

    public static CarroApi getCarroAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(CarroApi.class);
    }
}
