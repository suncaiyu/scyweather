package com.example.a59762.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 59762 on 2018-08-26.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
