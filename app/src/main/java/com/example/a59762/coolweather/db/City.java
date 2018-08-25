package com.example.a59762.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 59762 on 2018-08-25.
 */

public class City extends DataSupport{
    private int id;
    private int cityCode;
    private String cityName;
    private int provinceId;
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String Name){
        cityName=Name;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int Code){
        cityCode=Code;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int id){
        provinceId=id;
    }
}
