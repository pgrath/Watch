package com.example.pat.watch;

/**
 * Created by Pat on 10/29/2015.
 */
    class Watch {
        private String brand, mvmt, serial, urlLoc;
        private int wr, year;
        private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMvmt() {
        return mvmt;
    }

    public void setMvmt(String mvmt) {
        this.mvmt = mvmt;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getUrlLoc() {
        return urlLoc;
    }

    public void setUrlLoc(String urlLoc) {
        this.urlLoc = urlLoc;
    }

    public int getWr() {
        return wr;
    }

    public void setWr(int wr) {
        this.wr = wr;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
