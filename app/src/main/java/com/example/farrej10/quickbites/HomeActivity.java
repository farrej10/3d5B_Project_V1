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

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Restaurant burger = new Restaurant("Burger Place ", "This Burger place is the home of the burger" , 10);

        TextView title = findViewById(R.id.Title);
        title.setText(burger.getName(), TextView.BufferType.NORMAL);

        TextView description = findViewById(R.id.description);
        description.setText(burger.getDescipt(), TextView.BufferType.NORMAL);

        TextView happyRate = findViewById(R.id.happyNum);
        happyRate.setText(Integer.toString(burger.getRating()), TextView.BufferType.NORMAL);
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
        String restHappyR = ratingHappy.getText().toString();
        String restNeuR = ratingNeutral.getText().toString();
        String restSadR = ratingSad.getText().toString();


        startActivity(restuarantDetailed);

    }


}
