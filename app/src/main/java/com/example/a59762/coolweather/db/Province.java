package com.example.a59762.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 59762 on 2018-08-25.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    private int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String Name){
        provinceName=Name;
    }
    public int getProvinceCode(){
        return getProvinceCode();
    }
    public void setProvinceCode(int Code){
        provinceCode=Code;
    }

}
