package org.semenenya.searchemailandphonenumber.controller;

import org.semenenya.searchemailandphonenumber.model.Logic;
import org.semenenya.searchemailandphonenumber.viev.Response;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value = "/Search", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response restMethod(String text) {
        Response result = new Response();

        result.setEmail(Logic.searchEmailOrTelephoneNumber(text,0));
        result.setPhoneNumber(Logic.searchEmailOrTelephoneNumber(text,1));

        return result;
    }
}
