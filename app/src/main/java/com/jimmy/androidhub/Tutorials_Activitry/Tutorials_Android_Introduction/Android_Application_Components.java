package com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/24/2018.
 */

public class Android_Application_Components extends AppCompatActivity {


    TextView t1,t3,t,t2,t4,t5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorials_application_components);
        setTitle("Android Application Components");

        t = findViewById(R.id.com4);
        t2 = findViewById(R.id.com6);
        t3 = findViewById(R.id.com8);
        t4 = findViewById(R.id.com10);
        t5 = findViewById(R.id.com12);


        t.setText("An activity represents a single screen with a user interface,in-short Activity performs actions on the screen. For example, an email application might have one activity that shows a list of new emails, another activity to compose an email, and another activity for reading emails. If an application has more than one activity, then one of them should be marked as the activity that is presented when the application is launched.");

        t2.setText("A service is a component that runs in the background to perform long-running operations. For example, a service might play music in the background while the user is in a different application, or it might fetch data over the network without blocking user interaction with an activity.");

        t3.setText("Broadcast Receivers simply respond to broadcast messages from other applications or from the system. For example, applications can also initiate broadcasts to let other applications know that some data has been downloaded to the device and is available for them to use, so this is broadcast receiver who will intercept this communication and will initiate appropriate action.");

        t4.setText("A content provider component supplies data from one application to others on request. Such requests are handled by the methods of the ContentResolver class. The data may be stored in the file system, the database or somewhere else entirely.");

        t5.setText("There are additional components which will be used in the construction of above mentioned entities, their logic, and wiring between them. These components are −\n" +
                    "\n" +"1. Fragments \n" +
                    "\n" +  "2. Views \n" +"3. Layouts"+
                    "\n" +  "4. Intents \n" +"5. Resources");
    }
}
