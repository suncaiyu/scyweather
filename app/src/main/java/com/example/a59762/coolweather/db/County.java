package com.example.a59762.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 59762 on 2018-08-25.
 */

public class County extends DataSupport{
    private int id;
    private String countName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCountName(){
        return countName;
    }
    public void setCountName(String Name){
        countName=Name;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String id){
        weatherId=id;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int id){
        cityId=id;
    }
}
