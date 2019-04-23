package com.cashdesksystem.backoffice.rest.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Controller that emulates store backoffice
 */
@RestController
@Profile("offline")
@RequestMapping("/api")
public class OptionalRestController {

    @GetMapping("/get_ip")
    public final String getIp() throws UnknownHostException {
        return "Hello " + InetAddress.getLocalHost().getHostAddress();
    }
}
