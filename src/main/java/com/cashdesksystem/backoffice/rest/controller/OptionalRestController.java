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
public class OptionalRestController {

    @GetMapping("/opt")
    public final String home() throws UnknownHostException {
        return "Optional Bean";
    }
}
