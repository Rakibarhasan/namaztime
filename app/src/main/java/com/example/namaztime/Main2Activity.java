package com.example.namaztime;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG ="tag" ;
    String url = "https://muslimsalat.com/bangladesh/savar/daily.json?key=api_key";
    // Tag used to cancel the request
    String tag_json_obj = "json_obj_req";
    ProgressDialog pDialog;

    TextView mFajrTV,mDhuhrTv,mAsrTv,mMaghribTv,mIshaTV,mSunTv,mLocationTv,mdates;
    float x1, x2, y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);







        mFajrTV=findViewById(R.id.fajrTv);
        mDhuhrTv=findViewById(R.id.dhuhr);
        mAsrTv=findViewById(R.id.asrTV);
        mMaghribTv=findViewById(R.id.magribTV);
        mIshaTV=findViewById(R.id.ishaTV);
        mSunTv=findViewById(R.id.msun);



        //country

        mLocationTv=findViewById(R.id.locationTv);
        mdates=findViewById(R.id.mdates);



        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                url, null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            // get location

                            String country=response.get("country").toString();
                            String state=response.get("state").toString();
                            String city=response.get("city").toString();
                            String location = country+","+state+","+city;

                            //date



                            String mFajr=response.getJSONArray("items").getJSONObject(0).get("fajr").toString();
                            String mDhuhr=response.getJSONArray("items").getJSONObject(0).get("dhuhr").toString();
                            String mAsr=response.getJSONArray("items").getJSONObject(0).get("asr").toString();
                            String mMaghrib=response.getJSONArray("items").getJSONObject(0).get("maghrib").toString();
                            String mIsha=response.getJSONArray("items").getJSONObject(0).get("isha").toString();
                            String mSun=response.getJSONArray("items").getJSONObject(0).get("shurooq").toString();

                            String date=response.getJSONArray("items").getJSONObject(0).get("date_for").toString();







                            mFajrTV.setText(mFajr);
                            mDhuhrTv.setText(mDhuhr);
                            mAsrTv.setText(mAsr);
                            mMaghribTv.setText(mMaghrib);
                            mIshaTV.setText(mIsha);
                            mSunTv.setText(mSun);


                            mLocationTv.setText(location);
                            mdates.setText(date);


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        pDialog.hide();
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                View customView = Main2Activity.this.getLayoutInflater().inflate(R.layout.customtoast,null);
                Toast toast = new Toast(getApplicationContext());
                toast.setView(customView);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL,0,200);
                toast.show();
                // hide the progress dialog
                pDialog.hide();
            }
        });

        AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);
    }

    // slide


    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 < x2){
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    startActivity(i);

                }


                break;
        }
        return false;
    }


}
