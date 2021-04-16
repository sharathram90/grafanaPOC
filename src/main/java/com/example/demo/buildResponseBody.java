package com.example.demo;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class buildResponseBody {

    public List<JSONObject> buildResponse(String env, String data1, String data2, String data3) {
        JSONObject jsonRow = new JSONObject();
        List<JSONObject> rowArray = new ArrayList<>();

        jsonRow.put("v1", data1);
        jsonRow.put("v2", data2);
        jsonRow.put("v3", data3);
        rowArray.add(jsonRow);
//        rowArray.add(data2);
//        rowArray.add(data3);

        //jsonRow.put(env, rowArray);

        return rowArray;

    }

}
