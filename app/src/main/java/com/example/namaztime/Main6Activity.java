package com.example.namaztime;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        Button facebook = (Button) findViewById(R.id.facebook);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = openFacebook(Main6Activity.this);
                startActivity(facebookIntent);
            }
        });
    }
    public static Intent openFacebook(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://page/100007858273468"));
        } catch (Exception e){

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/rakibarhasan"));
        }


    }


    //email

    public void onEmailBtnClick(View view) {

        // Create the Intent
        final Intent emailIntent = new Intent(Intent.ACTION_SEND);

        // Fill it with Data
        emailIntent.setType("plain/text");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"rakibhasancity38@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, " Iam Namaz Time Apps user :");

        // Send it off to the Activity-Chooser
        this.startActivity(Intent.createChooser(emailIntent, "Send mail..."));

    }







}

