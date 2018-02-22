package com.example.farrej10.quickbites;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import static java.sql.Types.NULL;

public class HomeActivity extends AppCompatActivity {

    Restaurant burger = new Restaurant("Burger Place ", "This Burger place is the home of the burger" , 10, 5, 1, 53.343247, -6.254476);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<Restaurant> listofRestaurants = new ArrayList<>();
        csvParser parser = new csvParser();
        parser.parseToList(listofRestaurants, this);



        TextView title = findViewById(R.id.Title);
        title.setText(listofRestaurants.get(0).getName(), TextView.BufferType.NORMAL);

        TextView description = findViewById(R.id.description);
        description.setText(listofRestaurants.get(0).getDescrip(), TextView.BufferType.NORMAL);

        TextView happyRate = findViewById(R.id.happyNum);
        String Happyrating = Integer.toString(listofRestaurants.get(0).getRating(0));
        happyRate.setText(Happyrating, TextView.BufferType.NORMAL);

        TextView neutralRate = findViewById(R.id.neutralNum);
        String Neurating = Integer.toString(listofRestaurants.get(0).getRating(1));
        neutralRate.setText(Neurating, TextView.BufferType.NORMAL);

        TextView sadRate = findViewById(R.id.sadNum);
        String Sadrating = Integer.toString(listofRestaurants.get(0).getRating(2));
        sadRate.setText(Sadrating, TextView.BufferType.NORMAL);

        title = findViewById(R.id.Title2);
        title.setText(listofRestaurants.get(1).getName(), TextView.BufferType.NORMAL);

        description = findViewById(R.id.description2);
        description.setText(listofRestaurants.get(1).getDescrip(), TextView.BufferType.NORMAL);

        happyRate = findViewById(R.id.happyNum2);
        Happyrating = Integer.toString(listofRestaurants.get(1).getRating(0));
        happyRate.setText(Happyrating, TextView.BufferType.NORMAL);

        neutralRate = findViewById(R.id.neutralNum2);
        Neurating = Integer.toString(listofRestaurants.get(1).getRating(1));
        neutralRate.setText(Neurating, TextView.BufferType.NORMAL);

        sadRate = findViewById(R.id.sadNum2);
        Sadrating = Integer.toString(listofRestaurants.get(1).getRating(2));
        sadRate.setText(Sadrating, TextView.BufferType.NORMAL);

        title = findViewById(R.id.Title3);
        title.setText(listofRestaurants.get(2).getName(), TextView.BufferType.NORMAL);

        description = findViewById(R.id.description3);
        description.setText(listofRestaurants.get(2).getDescrip(), TextView.BufferType.NORMAL);

        happyRate = findViewById(R.id.happyNum3);
        Happyrating = Integer.toString(listofRestaurants.get(2).getRating(0));
        happyRate.setText(Happyrating, TextView.BufferType.NORMAL);

        neutralRate = findViewById(R.id.neutralNum3);
        Neurating = Integer.toString(listofRestaurants.get(2).getRating(1));
        neutralRate.setText(Neurating, TextView.BufferType.NORMAL);

        sadRate = findViewById(R.id.sadNum3);
        Sadrating = Integer.toString(listofRestaurants.get(2).getRating(2));
        sadRate.setText(Sadrating, TextView.BufferType.NORMAL);

    }

    public void startMap(View view)
    {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }



    public void openDetailed(View view)
    {

        Intent restuarantDetailed = new Intent(this, detailedRestaurant.class);
        TextView title = findViewById(R.id.Title);
        TextView description = findViewById(R.id.description);
        TextView ratingHappy = findViewById(R.id.happyNum);
        TextView ratingNeutral = findViewById(R.id.neutralNum);
        TextView ratingSad = findViewById(R.id.sadNum);

        String restTitle = title.getText().toString();
        String restDescription = description.getText().toString();
        String ratingString = ratingHappy.getText().toString();
        int intHappyR = Integer.parseInt(ratingString);
        if( intHappyR == NULL)
        {
            intHappyR = -1;
        }
        ratingString = ratingNeutral.getText().toString();
        int intNeuR = Integer.parseInt(ratingString);
        if( intNeuR == NULL)
        {
            intNeuR = -1;
        }
        ratingString = ratingSad.getText().toString();
        int intSadR = Integer.parseInt(ratingString);
        if( intSadR == NULL)
        {
            intSadR = -1;
        }

        Restaurant test = new Restaurant(restTitle, restDescription, intHappyR, intNeuR, intSadR, 53.343247, -6.254476);
        restuarantDetailed.putExtra("rest", test);

        startActivity(restuarantDetailed);

    }


}
