package com.cashdesksystem.backoffice.rest.controller;

import com.cashdesksystem.backoffice.rest.model.Alcohol;
import com.cashdesksystem.backoffice.rest.service.CheckingAlcoholService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Controller that emulates store backoffice
 */
@RestController
@RequestMapping("/api")
@Profile("cloud")
public class BackofficeRestController {
    private CheckingAlcoholService checkingAlcoholService;

    @Autowired
    public BackofficeRestController(CheckingAlcoholService checkingAlcoholService) {
        this.checkingAlcoholService = checkingAlcoholService;
    }

    /**
     * Сheck mark of the old sample
     *
     * @param dataMatrix
     * @param pdf417
     * @return info about alcohol
     */
    @GetMapping("/check_old_mark")
    public Alcohol checkOldMark(@RequestParam(name = "DataMatrix") String dataMatrix,
                                @RequestParam String pdf417) throws IOException {
        return checkingAlcoholService.checkOldMark(dataMatrix, pdf417);
    }

    /**
     * Сheck mark of the new sample
     *
     * @param pdf417
     * @return info about alcohol
     */
    @GetMapping("/check_new_mark")
    public Alcohol checkNewMark(@RequestParam String pdf417) throws IOException {
        return checkingAlcoholService.checkNewMark(pdf417);
    }

    /**
     * Check QR code from the receipt
     *
     * @param qr
     * @return info about alcohol
     */
    @GetMapping("/check_qr")
    public Alcohol checkQrCode(@RequestParam String qr) throws IOException {
        return checkingAlcoholService.checkQrCode(qr);
    }

    @GetMapping("/get_ip")
    public final String getIp() throws UnknownHostException {
        return "Hello " + InetAddress.getLocalHost().getHostAddress();
    }

}
