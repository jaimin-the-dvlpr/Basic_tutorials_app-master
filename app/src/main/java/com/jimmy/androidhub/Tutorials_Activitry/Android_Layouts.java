package com.jimmy.androidhub.Tutorials_Activitry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.jimmy.androidhub.R;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout.Frame;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout.Introduction_Layout;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout.Linear;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout.Relative;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout.Table;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jaimin_Patel on 2/23/2018.
 */

public class Android_Layouts  extends AppCompatActivity {
    String[] Name={"Introduction about layouts","Linear Layout","Relative Layout","Table Layout","Frame Layout"};
    int[] Images={R.drawable.project_structure,R.drawable.linearlayout,R.drawable.relative,R.drawable.tablelayout,R.drawable.framelayout};
    ListView simpleListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_android_introduction);
        setTitle("Android Layouts");
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

               if (i == 0) {

                   Intent intent = new Intent(Android_Layouts.this, Introduction_Layout.class);
                   startActivity(intent);

               }
                   if (i == 1){

                       Intent intent = new Intent(Android_Layouts.this, Linear.class);
                       startActivity(intent);

                   }
                if (i == 2) {

                    Intent intent = new Intent(Android_Layouts.this, Relative.class);
                    startActivity(intent);
                }

                if (i == 3) {

                    Intent intent = new Intent(Android_Layouts.this, Table.class);
                    startActivity(intent);
                }
                    if (i == 4){

                        Intent intent = new Intent(Android_Layouts.this, Frame.class);
                        startActivity(intent);


                    }else{
                      //  Toast.makeText(Android_Layouts.this, "Click Proper Way", Toast.LENGTH_SHORT).show();
               }
            }
        });

    }


    }
