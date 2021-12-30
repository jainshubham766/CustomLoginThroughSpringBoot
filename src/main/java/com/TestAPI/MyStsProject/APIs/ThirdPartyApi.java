package com.TestAPI.MyStsProject.APIs;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.TestAPI.MyStsProject.model.MediaListResponse;

@RestController
@RequestMapping(value = "/cdi")
public class ThirdPartyApi {

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(path = "/api1", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MediaListResponse> api1() {
        String cdiResourceUrl = "http://staging.connectingdotsinfotech.com:8080/firestixAPI_dev_2/api/ullu2/media/getActiveUpcomingMedia/cdiOpn";
        ResponseEntity<MediaListResponse> response = restTemplate.getForEntity(cdiResourceUrl, MediaListResponse.class);
        System.out.println(response.getStatusCode());
        return response;

    }

    @RequestMapping(path = "/api2", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> api2() {
        String cdiResourceUrl = "http://staging.connectingdotsinfotech.com:8080/firestixAPI_dev_2/api/ullu2/subscription/getApplicablePayPerViewTiers/cdiOpn";
        ResponseEntity<String> response = restTemplate.getForEntity(cdiResourceUrl, String.class);
        return response;
    }

}
