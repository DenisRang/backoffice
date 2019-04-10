package com.cashdesksystem.backoffice.rest.repository;

import com.cashdesksystem.backoffice.rest.model.Alcohol;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FsrarRepository {
    @GET("api/mark")
    Call<Alcohol> checkOldMark(@Query("DataMatrix") String dataMatrix,
                               @Query("pdf417") String pdf417);

    @GET("api/marklong")
    Call<Alcohol> checkNewMark(@Query("pdf417") String pdf417);

    @GET("api/qr")
    Call<Alcohol> checkQr(@Query("qr") String qr);
}
