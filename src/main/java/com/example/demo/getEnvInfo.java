package com.example.demo;

import org.json.simple.JSONObject;

import java.util.List;

public class getEnvInfo {
    private final String env;
    //private final String data1;
    //private final String data2;
    //private final String data3;
    private final List<JSONObject> versionList;

    public getEnvInfo(String env, List<JSONObject> versionList) {
        this.env = env;
        //this.data1 = data1;
        //this.data2 = data2;
        //this.data3 = data3;
        this.versionList = versionList;
    }

    public String getEnv() {
        return env;
    }

    public List<JSONObject> getversionList() {
        return versionList;
    }

//    public String getData2() {
//        return data2;
//    }
//
//    public String getData3() {
//        return data3;
//    }
}
