package com.cashdesksystem.backoffice.rest.service;

import com.cashdesksystem.backoffice.rest.model.Alcohol;

import java.io.IOException;

public interface CheckingAlcoholService {
    Alcohol checkOldMark(String dataMatrix, String pdf417) throws IOException;

    Alcohol checkNewMark(String pdf417) throws IOException;

    Alcohol checkQrCode(String qr) throws IOException;
}
