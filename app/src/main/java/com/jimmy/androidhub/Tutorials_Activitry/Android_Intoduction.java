package com.jimmy.androidhub.Tutorials_Activitry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.jimmy.androidhub.R;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction.Android_Application_Components;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction.Android_Environmental_Setup;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction.Android_History_Versions;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction.Android_introduction2;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction.Build_First_app;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction.Why_Android;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jaimin_Patel on 2/23/2018.
 */

public class Android_Intoduction extends AppCompatActivity {

    String[] Name={"Android Introducton","Android History and Versions","Why Android?","Android Application Components","Android environmental Setup","Building your First App"};//animal names array
    int[] Images={R.drawable.intro,R.drawable.historyandversion,R.drawable.whyandroid,R.drawable.components,R.drawable.environmentalsetup,R.drawable.buildapp};//animal images array
    ListView simpleListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_android_introduction);
        setTitle("Android Introduction");
        simpleListView=(ListView)findViewById(R.id.simpleListView);

        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for (int i=0;i<Name.length;i++)
        {

            HashMap<String,String> hashMap=new HashMap<>();
            hashMap.put("name",Name[i]);
            hashMap.put("image",Images[i]+"");
            arrayList.add(hashMap);
        }

        String[] from={"name","image"};
        int[] to={R.id.textView,R.id.imageView};
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,arrayList,R.layout.tutorial_design_introductions,from,to);
        simpleListView.setAdapter(simpleAdapter);
        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

              if (i == 0){
                  Intent intent=new Intent(Android_Intoduction.this,Android_introduction2.class);
                  startActivity(intent);
              }
             else if (i == 1){
                  Intent intent=new Intent(Android_Intoduction.this,Android_History_Versions.class);
                  startActivity(intent);
              }

              else if (i == 2){
                  Intent intent=new Intent(Android_Intoduction.this,Why_Android.class);
                  startActivity(intent);
              }

              else if (i == 3) {
                  Intent intent = new Intent(Android_Intoduction.this, Android_Application_Components.class);
                  startActivity(intent);
              }
                   else if (i == 4) {
                  Intent intent = new Intent(Android_Intoduction.this, Android_Environmental_Setup.class);
                  startActivity(intent);
              }
                       else if (i == 5){
                      Intent intent=new Intent(Android_Intoduction.this,Build_First_app.class);
                      startActivity(intent);
              }
              else {
                  Toast.makeText(Android_Intoduction.this, "cancle", Toast.LENGTH_SHORT).show();
              }
            }
        });

    }
}
