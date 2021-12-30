package com.TestAPI.MyStsProject.APIs;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Including File name of LoginApi
import com.TestAPI.MyStsProject.Message.LoginApi;
import com.TestAPI.MyStsProject.Message.postOutputApi;


@RestController
@RequestMapping(value = "/selfMade")
public class SampleApiController {

    // 1st Api -->GET
    @RequestMapping(path = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginApi> get() {
        return new ResponseEntity<LoginApi>(new LoginApi("SpringBoot", "sts4"), HttpStatus.OK);
    }


    // 2nd Api -->POST
    @RequestMapping(path = "/post", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginApi> post(@RequestBody LoginApi loginApi) {
        System.out.println(loginApi);
        return new ResponseEntity<LoginApi>(loginApi,HttpStatus.ACCEPTED);
        
    }

    //3rd Api -->PUT this with only update the adminLogin userId

    LoginApi adminLogin = new LoginApi("admin", "123");

    @RequestMapping(path = "/put", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<LoginApi> update(@RequestBody LoginApi loginApi) {
        System.out.println(adminLogin);
        System.out.println("+++++++++++++++++++++++++");
        adminLogin.updateUserId(loginApi.getUserId());
        System.out.println(adminLogin);
        return new ResponseEntity<LoginApi>(adminLogin,HttpStatus.ACCEPTED);
    }
}
