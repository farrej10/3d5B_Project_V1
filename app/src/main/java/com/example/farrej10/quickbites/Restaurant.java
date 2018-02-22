package com.example.farrej10.quickbites;

import java.io.Serializable;

/**
 * Created by teoc on 09/02/18.
 */

public class Restaurant implements Serializable{
    private String name;
    private String descrip;
    private int    rating[] = new int[3];
    private double Latitude;
    private double Longitude;

    public String getName   () { return name; }
    public String getDescrip () { return descrip; }
    public int    getRating (int index) { return rating[index]; }
    public double getLatitude()  {return Latitude; }
    public double getLongitude()  {return Longitude; }
    public void setName     (String n) { name = n; }
    public void setDescrip   (String d) { descrip = d; }
    public void setRating   (int r, int index) { rating[index] = r; }
    public void setLatitude (double Lat) { Latitude = Lat ; }
    public void setLongitude(double Long) { Longitude = Long; }

    public Restaurant()
    {
        name = "";
        descrip = "";
        Latitude = 0.0;
        Longitude = 0.0;
        for (int i = 0; i < 3; i++)
        {
            rating[i] = 0;
        }

    }

    public Restaurant(String n, String d, int happy, int neutral, int sad, double Long, double Lat )
    {
        setName(n);
        setDescrip(d);
        setRating(happy, 0);
        setRating(neutral, 1);
        setRating(sad, 2);
        setLatitude(Lat);
        setLongitude(Long);

    }



}
