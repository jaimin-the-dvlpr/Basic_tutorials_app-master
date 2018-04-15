package com.jimmy.androidhub.Tutorials_Activitry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/19/2018.
 */

public class Android_Interview_Quetions extends AppCompatActivity {

    TextView q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18,q19,q20,q21,q22,q23,q24,q25,q26,q27,q28,q29,q30,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_interview_quetions);
        setTitle("Android Interview Quetions");

        q1 = findViewById(R.id.que1);       a1 =findViewById(R.id.ans1);
        q2 = findViewById(R.id.que2);       a2 =findViewById(R.id.ans2);
        q3 = findViewById(R.id.que3);       a3 =findViewById(R.id.ans3);
        q4 = findViewById(R.id.que4);       a4 =findViewById(R.id.ans4);
        q5 = findViewById(R.id.que5);       a5 =findViewById(R.id.ans5);
        q6 = findViewById(R.id.que6);       a6 =findViewById(R.id.ans6);
        q7 = findViewById(R.id.que7);       a7 =findViewById(R.id.ans7);
        q8 = findViewById(R.id.que8);       a8 =findViewById(R.id.ans8);
        q9 = findViewById(R.id.que9);       a9 =findViewById(R.id.ans9);
        q10 = findViewById(R.id.que10);     a10 =findViewById(R.id.ans10);
        q11 = findViewById(R.id.que11);     a11 =findViewById(R.id.ans11);
        q12 = findViewById(R.id.que12);     a12 =findViewById(R.id.ans12);
        q13 = findViewById(R.id.que13);     a13=findViewById(R.id.ans13);
        q14 = findViewById(R.id.que14);     a14 =findViewById(R.id.ans14);
        q15 = findViewById(R.id.que15);     a15 =findViewById(R.id.ans15);
        q16 = findViewById(R.id.que16);     a16 =findViewById(R.id.ans16);
        q17 = findViewById(R.id.que17);     a17 =findViewById(R.id.ans17);
        q18 = findViewById(R.id.que18);     a18 =findViewById(R.id.ans18);
        q19 = findViewById(R.id.que19);     a19 =findViewById(R.id.ans19);
        q20 = findViewById(R.id.que20);     a20 =findViewById(R.id.ans20);
        q21 = findViewById(R.id.que21);     a21 =findViewById(R.id.ans21);
        q22 = findViewById(R.id.que22);     a22 =findViewById(R.id.ans22);
        q23 = findViewById(R.id.que23);     a23 =findViewById(R.id.ans23);
        q24 = findViewById(R.id.que24);     a24 =findViewById(R.id.ans24);
        q25 = findViewById(R.id.que25);     a25 =findViewById(R.id.ans25);
        q26 = findViewById(R.id.que26);     a26 =findViewById(R.id.ans26);
        q27 = findViewById(R.id.que27);     a27 =findViewById(R.id.ans27);
        q28 = findViewById(R.id.que28);     a28 =findViewById(R.id.ans28);
        q29 = findViewById(R.id.que29);     a29 =findViewById(R.id.ans29);
        q30 = findViewById(R.id.que30);     a30 =findViewById(R.id.ans30);


        q1.setText("1. What is Android?");
        a1.setText("=> Android is a stack of software for mobile devices which includes an Operating System, middleware and some key applications. The application executes within its own process and its own instance of Dalvik Virtual Machine. Many Virtual Machines run efficiently by a DVM device. DVM executes Java languages byte code which later transforms into .dex format files.");

        q2.setText("2. What are the advantages of Android?");
        a2.setText("=> It is simple and powerful SDK.\n" +
                "\n" +
                "=> Licensing, Distribution or Development fee is not required.\n" +
                "\n" +
                "=> Easy to Import third party Java library.\n" +
                "\n" +
                "=> Supporting platforms are – Linux, Mac Os, Windows.\n" +
                "\n" +
                "=> Innovative products like the location-aware services, location of a nearby convenience store etc., are some of the additive facilities in Android. \n" +
                "\n" +
                "=> Components can be reused and replaced by the application framework. \n" +
                "\n" +
                "=> Optimized DVM for mobile devices. \n" +
                "\n" +
                "=> SQLite enables to store the data in a structured manner.");

        q3.setText("3. Describe Android application Architecture?");
        a3.setText("=> Android application architecture has the following components.They are as follows −\n" +
                "\n" +
                "=> Services − It will perform background functionalities\n" +
                "\n" +
                "=> Intent − It will perform the inter connection between activities and the data passing mechanism\n" +
                "\n" +
                "=> Resource Externalization − strings and graphics\n" +
                "\n" +
                "=> Notification − light,sound,icon,notification,dialog box,and toast\n" +
                "\n" +
                "=> Content Providers − It will share the data between applications");

        q4.setText("4. What is An Activity?");
        a4.setText("=> Activity performs actions on the screen.If you want to do any operations, we can do with activity");

        q5.setText("5. What is the APK format?");
        a5.setText("=> The Android packaging key is compressed with classes,UI's, supportive assets and manifest.All files are compressed to a single file is called APK.");

        q6.setText("6. What are the different phases of the Activity life cycle?");
        a6.setText("=> As an activity transitions from state to state, it is notified of the change by calls to the following protected methods: \n" +
                "1) void onCreate(Bundle savedInstanceState) \n" +
                "2) void onStart() \n" +
                "3) void onRestart() \n" +
                "4) void onResume() \n" +
                "5) void onPause() \n" +
                "6) void onStop() \n" +
                "7) void onDestroy() \n" +
                "=> these seven methods define the entire lifecycle of an activity.");

        q7.setText("7. What is intent?");
        a7.setText("=> A class (Intent) describes what a caller desires to do. The caller sends this intent to Android’s intent resolver, which finds the most suitable activity for the intent. E.g. opening a PDF file is an intent, and the Adobe Reader is the suitable activity for this intent."
                    );

        q8.setText("8. What is an Explicit And  Implicit Intent?");
        a8.setText("=> Android Explicit intent specifies the component to be invoked from activity. In other words, we can call another activity in android by explicit intent.\n" +
                "=> Implicit Intent doesn't specifiy the component. In such case, intent provides information of available components provided by the system that is to be invoked.");

        q9.setText("9. What is An android manifest file?");
        a9.setText("=> Every application must have an AndroidManifest.xml file (with precisely that name) in its root directory. The manifest file presents essential information about your app to the Android system, information the system must have before it can run any of the app's code.");

        q10.setText("10. What language does android support to develop an application?");
        a10.setText("=> Android applications has written using the java(Android SDK) and C/C++(Android NDK).");

        q11.setText("11. What's the difference between a file, a class and an activity in android?");
        a11.setText("1. File - It is a block of arbitrary information, or resource for storing information. It can be of any type. \n" +
                "2. Class - Its a compiled form of .Java file . Android finally used this .class files to produce an executable apk \n" +
                "3. Activity - An activity is the equivalent of a Frame/Window in GUI toolkits. It is not a file or a file type it is just a class that can be extended in Android for loading UI elements on view.");

        q12.setText("12. What is Dalvik Virtual Machine?");
        a12.setText("=> The name of Android's virtual machine. The Dalvik VM is an interpreter-only virtual machine that executes files in the Dalvik Executable (.dex) format, a format that is optimized for efficient storage and memory-mappable execution. The virtual machine is register-based, and it can run classes compiled by a Java language compiler that have been transformed into its native format using the included \"dx\" tool. The VM runs on top of Posix-compliant operating systems, which it relies on for underlying functionality (such as threading and low level memory management). The Dalvik core class library is intended to provide a familiar development base for those used to programming with Java Standard Edition, but it is geared specifically to the needs of a small mobile device.");

        q13.setText("13. What is Android Runtime?");
        a13.setText("=> Android includes a set of core libraries that provides most of the functionality available in the core libraries of the Java programming language. Every Android application runs in its own process, with its own instance of the Dalvik virtual machine. Dalvik has been written so that a device can run multiple VMs efficiently. The Dalvik VM executes files in the Dalvik Executable (.dex) format which is optimized for minimal memory footprint. The VM is register-based, and runs classes compiled by a Java language compiler that have been transformed into the .dex format by the included \"dx\" tool.");

        q14.setText("14. What is the Open Handset Alliance?");
        a14.setText("=> The OHA is a consortium of 84 technology and mobile companies that have joined hands to accelerate innovation in mobile technology and at the same time offer the end users a better, cost-effective and richer mobile experience. Members of this include Google, HTC, Sony, Dell, Intel, Motorola, Qualcomm, Texas Instruments, Samsung, LG, T-Mobile, Nvidia. The OHA was started on 5 November 2007 by Google and 34 other companies. Android is the main software of the alliance.");

        q15.setText("15. What is viewGroup in android?");
        a15.setText("=> View group is a collection of views and other child views, it is an invisible part and the base class for layouts.");

        q16.setText("16. What is a service in android?");
        a16.setText("=> The Service is like as an activity to do background functionalities without UI interaction.");

        q17.setText("17. What is container in android?");
        a17.setText("=> The container holds objects,widgets,labels,fields,icons,buttons.etc.");

        q18.setText("18. What is ADB in android?");
        a18.setText("=> It is acts as bridge between emulator and IDE, it executes remote shell commands to run applications on an emulator");

        q19.setText("19. What is an Adapter in android?");
        a19.setText("=> Android’s Adapter is a bridge between an AdapterView and the underlying data for that view");

        q20.setText("20. What data types are supported by AIDL?");
        a20.setText("=> AIDL has support for the following data types: \n" +
                "1. string \n" +
                "2. charSequence \n" +
                "3. List \n" +
                "4. Map \n" +
                "=> all native Java data types like int, long, char and Boolean");

        q21.setText("21. What is a Fragment?");
        a21.setText("=> A fragment is a part or portion of an activity. It is modular in a sense that you can move around or combine with other fragments in a single activity. Fragments are also reusable.");
        q22.setText("22. Is it possible to use or add a fragment without using a user interface?");
        a22.setText("=> Yes, it is possible to do that, such as when you want to create a background behavior for a particular activity. You can do this by using add(Fragment, string) method to add a fragment from the activity.");
        q23.setText("23. How to Translate in Android?");
        a23.setText("=> Android uses Google translator to translate data from one language into another language and placed as a string while development");
        q24.setText("24. How to change application name after its deployment?");
        a24.setText("=> It's not truly recommended to change application name after it's deployment, if we change, it will impact on all other internal components.");
        q25.setText("25. What is singleton class in android?");
        a25.setText("=> A class which can create only an object, that object can be share able to all other classes.");
        q26.setText("26. What are application Widgets in android?");
        a26.setText("=> App Widgets are miniature application views that can embedded in other applications (such as the Home screen) and receive periodic updates. These views has referred to as Widgets in the user interface, and you can publish one with an App Widget provider.");
        q27.setText("27. What is a Sticky Intent in android?");
        a27.setText("=> Sticky Intent is also a type of intent which allows the communication between a function and a service for example,sendStickyBroadcast() is perform the operations after completion of intent also.");
        q28.setText("28. How to update UI from a service in android?");
        a28.setText("=> Use a dynamic broadcast receiver in the activity, and send a broadcast from the service. Once the dynamic receiver is triggered update UI from that receiver.");
        q29.setText("29. What is drawable folder in android?");
        a29.setText("=> A compiled visual resource that can used as a backgrounds,banners, icons,splash screen etc.");
        q30.setText("30. What are the type of flags to run an application in android?");
        a30.setText("1. FLAG_ACTIVITY_NEW_TASK\n" +
           "\n" +
           "2. FLAG_ACTIVITY_CLEAR_TOP.");

    }
}