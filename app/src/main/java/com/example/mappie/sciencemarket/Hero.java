package com.example.mappie.sciencemarket;

public class Hero {



    String qstn_titl;
    String qstn_desc;




    public Hero(String qstn_titl, String qstn_desc) {
       this.qstn_titl=qstn_titl;
       this.qstn_desc=qstn_desc;
    }
    public String getQstn_titl() {
        return qstn_titl;
    }

    public String getQstn_desc() {
        return qstn_desc;
    }


}
