package com.jimmy.androidhub.Tutorials_Activitry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 3/3/2018.
 */

public class Tutorials_Android_Kotlin extends AppCompatActivity {

        TextView k1,k2,k3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorials_android_kotlin);
        Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        k1 = findViewById(R.id.k1);
        k2 = findViewById(R.id.k2);


                k1.setText("Kotlin is a great fit for developing Android applications, bringing all of the advantages of a modern language to the Android platform without introducing any new restrictions:\n" +
                "\n" +
                "=> Compatibility: Kotlin is fully compatible with JDK 6, ensuring that Kotlin applications can run on older Android devices with no issues. The Kotlin tooling is fully supported in Android Studio and compatible with the Android build system.\n" +
                "=> Performance: A Kotlin application runs as fast as an equivalent Java one, thanks to very similar bytecode structure. With Kotlin's support for inline functions, code using lambdas often runs even faster than the same code written in Java.\n" +
                "=> Interoperability: Kotlin is 100% interoperable with Java, allowing to use all existing Android libraries in a Kotlin application. This includes annotation processing, so databinding and Dagger work too.\n" +
                "=> Footprint: Kotlin has a very compact runtime library, which can be further reduced through the use of ProGuard. In a real application, the Kotlin runtime adds only a few hundred methods and less than 100K to the size of the .apk file.\n" +
                "=> Compilation Time: Kotlin supports efficient incremental compilation, so while there's some additional overhead for clean builds, incremental builds are usually as fast or faster than with Java.\n" +
                "=> Learning Curve: For a Java developer, getting started with Kotlin is very easy. The automated Java to Kotlin converter included in the Kotlin plugin helps with the first steps. Kotlin Koans offer a guide through the key features of the language with a series of interactive exercises.");

    k2.setText("Kotlin has been successfully adopted by major companies, and a few of them have shared their experiences:\n" +
            "\n" +
            "=> Pinterest has successfully introduced Kotlin into their application, used by 150M people every month.\n" +
            "=> Basecamp's Android app is 100% Kotlin code, and they report a huge difference in programmer happiness and great improvements in work quality and speed.\n" +
            "=> Keepsafe's App Lock app has also been converted to 100% Kotlin, leading to a 30% decrease in source line count and 10% decrease in method count.");
    }
}