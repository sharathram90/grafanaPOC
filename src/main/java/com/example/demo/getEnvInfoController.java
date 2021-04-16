package com.example.demo;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class getEnvInfoController extends buildResponseBody {
    private static final String environment = "dev1";
    //private static final String data1 = "1.2.0";
    //private static final String data2 = "2.1.0";
    //private static final String data3 = "3.1.0";
    private List<JSONObject> versionList = buildResponse(environment, "1.1.1", "2.2.2", "3.3.3");

    @GetMapping("/services")
    public getEnvInfo getEnvInfo() {
        return new getEnvInfo(environment,versionList);
    }
}
