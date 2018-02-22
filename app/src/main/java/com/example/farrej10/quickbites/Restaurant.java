package com.example.farrej10.quickbites;

/**
 * Created by teoc on 09/02/18.
 */

public class Restaurant {
    private String name;
    private String descript;
    private int    rating;

    public String getName   () { return name; }
    public String getDescipt () { return descript; }
    public int    getRating () { return rating; }
    public void setName     (String n) { name = n; }
    public void setDescip   (String d) { descript = d; }
    public void setRating   (int r) { rating = r; }

    public Restaurant(String n, String d, int r)
    {
        name = n;
        descript = d;
        rating = r;

    }

}
