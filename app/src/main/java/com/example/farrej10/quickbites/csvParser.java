package com.example.farrej10.quickbites;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.support.annotation.RawRes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by teoc on 21/02/18.
 */

public class csvParser {

    public void parseToList(List<Restaurant> List, Context act)
    {
        //String file = "res/raw/test.csv";
        try {
            InputStream input = act.getResources().openRawResource(R.raw.test);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;
            String restDetail[];

            try {
                line = reader.readLine(); //Get rid of first title
                line = reader.readLine();
                while ( line != null )
                {
                    restDetail = line.split(",");
                    Restaurant toAdd = new Restaurant( restDetail[0], restDetail[1], Integer.parseInt(restDetail[2]),
                            Integer.parseInt(restDetail[3]), Integer.parseInt(restDetail[4]),
                            Double.parseDouble(restDetail[5]), Double.parseDouble(restDetail[6]));
                    List.add(toAdd);
                    line = reader.readLine();
                }



            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }



    }
}
