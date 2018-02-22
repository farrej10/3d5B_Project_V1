package com.example.farrej10.quickbites;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class detailedRestaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_restaurant);

        Intent i = getIntent();
        Restaurant Rest = (Restaurant)i.getSerializableExtra("rest");


        TextView bxTitle = (TextView)findViewById(R.id.TitleBox);
        TextView bxDescrip = (TextView)findViewById(R.id.DescripBox);
        TextView bxRatingHappy = (TextView)findViewById(R.id.happyNum);
        TextView bxRatingNeu = (TextView)findViewById(R.id.neutralNum);
        TextView bxRatingSad = (TextView)findViewById(R.id.sadNum);

        bxTitle.setText(Rest.getName(), TextView.BufferType.NORMAL);
        bxDescrip.setText(Rest.getDescrip(), TextView.BufferType.NORMAL);
        bxRatingHappy.setText(Integer.toString(Rest.getRating(0)), TextView.BufferType.NORMAL);
        bxRatingNeu.setText(Integer.toString(Rest.getRating(1)), TextView.BufferType.NORMAL);
        bxRatingSad.setText(Integer.toString(Rest.getRating(2)), TextView.BufferType.NORMAL);

        String a = getApplicationContext().getFilesDir().toString();


    }

    public void returnHome (View view)
    {
        Intent Home = new Intent(this, HomeActivity.class);
        startActivity(Home);
    }

}
