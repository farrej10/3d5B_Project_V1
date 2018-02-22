package com.example.farrej10.quickbites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maherc7 on 22/02/18.
 */

public class ListofRestaurant implements Serializable{
    public List<Restaurant> list;

    public ListofRestaurant()
    {
        list = new ArrayList<>();
    }

}
