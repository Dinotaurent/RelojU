package com.dinotaurent.RelojU.controllers;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RelojController {
    private String url;
    private RestTemplate restTemplate = new RestTemplate();
    private JSONObject contenidoJson;
    private String horasJson;


    @GetMapping("/Alemania")
    public String getAlemania() {
        url = "https://timezone.abstractapi.com/v1/current_time/?api_key=0c8e5b12f4214aa1ade33c462dff2448&location=Alemania";
        contenidoJson = restTemplate.getForObject(url, JSONObject.class);
        horasJson = (String) contenidoJson.get("datetime");
        return horasJson;
    }

    @GetMapping("/Colombia")
    public String getColombia() {
        url = "https://timezone.abstractapi.com/v1/current_time/?api_key=0c8e5b12f4214aa1ade33c462dff2448&location=Colombia";
        contenidoJson = restTemplate.getForObject(url, JSONObject.class);
        horasJson = (String) contenidoJson.get("datetime");
        return horasJson;
    }

    @GetMapping("/Japon")
    public String getJapon() {
        url = "https://timezone.abstractapi.com/v1/current_time/?api_key=0c8e5b12f4214aa1ade33c462dff2448&location=Japon";
        contenidoJson = restTemplate.getForObject(url, JSONObject.class);
        horasJson = (String) contenidoJson.get("datetime");
        return horasJson;
    }

    @GetMapping("/Australia")
    public String getAustralia() {
        url = "https://timezone.abstractapi.com/v1/current_time/?api_key=0c8e5b12f4214aa1ade33c462dff2448&location=Australia";
        contenidoJson = restTemplate.getForObject(url, JSONObject.class);
        horasJson = (String) contenidoJson.get("datetime");
        return horasJson;
    }


}
