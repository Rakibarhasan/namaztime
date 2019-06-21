package com.example.namaztime;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class sura extends AppCompatActivity {

    private static String TAG = "sura";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura);

        Button button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

        //eklas


        Button eklas = (Button) findViewById(R.id.eklas);
        eklas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog2();
            }
        });


        //nasor

        Button nasor = (Button) findViewById(R.id.nasor);
        nasor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog3();
            }
        });
            //kawsar

        Button kawsar = (Button) findViewById(R.id.kawsar);
        kawsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog4();
            }
        });

        //asor

        Button asor = (Button) findViewById(R.id.asor);
        asor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog5();
            }
        });

        //falak

        Button falak = (Button) findViewById(R.id.falak);
        falak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog6();
            }
        });

        // lahab

        Button labib = (Button) findViewById(R.id.lahab);
        labib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog7();
            }
        });


        //kafirun

        Button kafi = (Button) findViewById(R.id.kafirun);
        kafi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog8();
            }
        });

        //kusis

        Button kuris = (Button) findViewById(R.id.kurais);
        kuris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog9();
            }
        });


        Button btn = (Button) findViewById(R.id.button10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog1();
            }
        });
    }


    void showDialog() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();
    }

    void showDialog1() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog_1, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();


    }


    //eklas

    void showDialog2() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog_2, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();


    }

    //nasor

    void showDialog3() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog_3, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();


    }


    //kawsar

    void showDialog4() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog_4, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();


    }

    //Asor

    void showDialog5() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog_5, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();

    }


    //falak

    void showDialog6() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog_6, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();


    }

    //
    void showDialog7() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog_7, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();


    }

    //karifun

    void showDialog8() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog_8, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();


    }

    //kuris
    void showDialog9() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.alart_dialog_9, null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(view)
                .create();
        alertDialog.show();


    }
}