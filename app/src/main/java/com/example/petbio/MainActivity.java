package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView) findViewById(R.id.catID);
        dogView = (ImageView) findViewById(R.id.dogID);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.catID:
                //go to second activity
                Intent catIntent = new Intent (MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Ruby");
                catIntent.putExtra("bio", "Ruby is sleek and pretty! With soft white fur, brown tabby markings, bright eyes, and gorgeous long whiskers. Ruby is lovely, sweet and friendly. She enjoys having her fur stroked and giving you head bonks.");
                startActivity(catIntent);
                break;

            case R.id.dogID:
                //go to second activity
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Sapphire");
                dogIntent.putExtra("bio", "Sapphire, 3 years' old, from the suburbs but pretends she lives in the city, snapchats herself driving her mercedes to work everyday, worships martinis and everything they stand for.");
                startActivity(dogIntent);
                break;
        }
    }


}