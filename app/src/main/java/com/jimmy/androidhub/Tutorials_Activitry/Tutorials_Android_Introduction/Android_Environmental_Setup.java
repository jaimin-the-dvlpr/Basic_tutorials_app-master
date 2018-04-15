package com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/24/2018.
 */

public class Android_Environmental_Setup extends AppCompatActivity {


    TextView a,a1,a3,a4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorials_android_environmental_setup);
        setTitle("Environmental Setup");

        a = findViewById(R.id.a2);
        a1 = findViewById(R.id.a4);
        a3 = findViewById(R.id.a5);
        a4 = findViewById(R.id.a6);

        a.setText("=> You will be delighted, to know that you can start your Android application development on either of the following operating systems −\n" +
                "\n" +
                "1. Microsoft® Windows® 10/8/7/Vista/2003 (32 or 64-bit)\n" +
                "\n" +
                "2. Mac® OS X® 10.8.5 or higher, up to 10.9 (Mavericks)\n" +
                "\n" +
                "3. GNOME or KDE desktop\n" +
                "\n" +
                "=> Second point is that all the required tools to develop Android applications are open source and can be downloaded from the Web. Following is the list of software's you will need before you start your Android application programming.\n" +
                "\n" +
                "1. Java JDK5 or later version\n" +
                "\n" +
                "2. Java Runtime Environment (JRE) 6\n" +
                "\n" +
                "3. Android Studio");

        a1.setText("Overview\n" +
                "\n" +
                "\n" +
                "=> Android Studio is the official IDE for android application development.It works based on IntelliJ IDEA, You can download the latest version of android studio from Android Studio 2.2 Download, If you are new to installing Android Studio on windows,you will find a file, which is named as android-studio-bundle-143.3101438-windows.exe.So just download and run on windows machine according to android studio wizard guideline.\n" +
                "\n" +
                "=> If you are installing Android Studio on Mac or Linux, You can download the latest version from Android Studio Mac Download,or Android Studio Linux Download, check the instructions provided along with the downloaded file for Mac OS and Linux. This tutorial will consider that you are going to setup your environment on Windows machine having Windows 8.1 operating system.\n" +
                "\n" +
                "Installation\n" +
                "\n" +
                "\n" +
                "=> So let's launch Android Studio.exe,Make sure before launch Android Studio, Our Machine should required installed Java JDK. To install Java JDK,take a references of Android environment setup");


   a3.setText("If the JDK is not detected automatically you need to mention its path explicitly. proceed further to include all the components.");
   a4.setText("Click Next. Until you Complate the Installation");
    }
}
