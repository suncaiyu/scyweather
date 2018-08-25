package com.example.a59762.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 59762 on 2018-08-26.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
