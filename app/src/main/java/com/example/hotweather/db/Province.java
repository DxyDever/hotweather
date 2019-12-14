package com.example.hotweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    private String provinceName;
    private int provinceCode;


    public void setId(int id) {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }




}
