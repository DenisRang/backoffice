package com.cashdesksystem.backoffice.rest.service;

import com.cashdesksystem.backoffice.rest.model.Alcohol;
import com.cashdesksystem.backoffice.rest.repository.FsrarRepository;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

import static com.cashdesksystem.backoffice.rest.service.APIConfiguration.API_BASE_URL;

@Service
public class CheckingAlcoholServiceImpl implements CheckingAlcoholService {
    private FsrarRepository repository;

    public CheckingAlcoholServiceImpl() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        repository = retrofit.create(FsrarRepository.class);
    }

    @Override
    public Alcohol checkOldMark(String dataMatrix, String pdf417) throws IOException {
        Response<Alcohol> response = null;
        response = repository.checkOldMark(dataMatrix, pdf417).execute();
        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body();
    }

    @Override
    public Alcohol checkNewMark(String pdf417) throws IOException {
        Response<Alcohol> response = null;
        response = repository.checkNewMark(pdf417).execute();
        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body();
    }

    @Override
    public Alcohol checkQrCode(String qr) throws IOException {
        Response<Alcohol> response = null;
        response = repository.checkQr(qr).execute();
        if (!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : "Unknown error");
        }
        return response.body();
    }
}
