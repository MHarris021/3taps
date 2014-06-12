package com.darcstarsolutions.apis.threetaps.reference;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mharris021 on 6/11/14.
 */
public class ReferenceService {

    private RestTemplate restTemplate;
    private String apiKey;

    public ReferenceService(String apiKey) {
        setApiKey(apiKey);
        setRestTemplate(new RestTemplate());
    }

    public ReferenceService(RestTemplate restTemplate, String apiKey) {
        setRestTemplate(restTemplate);
        setApiKey(apiKey);
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    protected void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getDataSources() {
        Map<String, String> map = new HashMap<>();
        map.put("auth_token", getApiKey());
        ResponseEntity<DataSources> response = restTemplate.getForEntity("http://reference.3taps.com/sources?auth_token={auth_token}", DataSources.class, map);
        return response.getBody().toString();
    }
}
