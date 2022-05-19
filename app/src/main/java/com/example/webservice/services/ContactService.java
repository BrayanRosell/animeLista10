package com.example.webservice.services;

import com.example.webservice.entities.Contacto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ContactService {
    @GET("bb2efcd8-0c6b-4e5c-ad2d-85d2c897cad9")
    Call<List<Contacto>> GetContacts();
}
