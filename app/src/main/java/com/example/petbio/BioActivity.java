package com.example.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petImageView;
    private TextView petName;
    private TextView petBio;
    private Bundle extras;
    private Button backToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView = (ImageView) findViewById(R.id.bioImageID);
        petName = (TextView) findViewById(R.id.nameID);
        petBio = (TextView) findViewById(R.id.bioID);
        backToMain = (Button) findViewById(R.id.backToMainID);

        extras = getIntent().getExtras();

        if(extras != null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name, bio);
        }

        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent petsProfile = new Intent(BioActivity.this, MainActivity.class);
                startActivity(petsProfile);
            }
        });


    }

    public void setUp(String name, String bio){
        if (name.equals("Sapphire")) {
            //show dog bio
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.dog_icon));
            petName.setText(name);
            petBio.setText(bio);
        } else if (name.equals("Ruby")){
            //show cat bio
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.cat_icon));
            petName.setText(name);
            petBio.setText(bio);
        }
    }
}