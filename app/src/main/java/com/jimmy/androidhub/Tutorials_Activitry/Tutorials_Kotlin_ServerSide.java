package com.jimmy.androidhub.Tutorials_Activitry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 3/3/2018.
 */

public class Tutorials_Kotlin_ServerSide  extends AppCompatActivity {

TextView k1,k2,k3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorials_kotlin_serverside);


       Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        k1 = findViewById(R.id.k1);
        k2 = findViewById(R.id.k2);


        k1.setText("Kotlin is a great fit for developing server-side applications, allowing to write concise and expressive code while maintaining full compatibility with existing Java-based technology stacks and a smooth learning curve:\n" +
                "\n" +
                "=> Expressiveness: Kotlin's innovative language features, such as its support for type-safe builders and delegated properties, help build powerful and easy-to-use abstractions.\n" +
                "=> Scalability: Kotlin's support for coroutines helps build server-side applications that scale to massive numbers of clients with modest hardware requirements.\n" +
                "=> Interoperability: Kotlin is fully compatible with all Java-based frameworks, which lets you stay on your familiar technology stack while reaping the benefits of a more modern language.\n" +
                "=> Migration: Kotlin supports gradual, step by step migration of large codebases from Java to Kotlin. You can start writing new code in Kotlin while keeping older parts of your system in Java.\n" +
                "=> Tooling: In addition to great IDE support in general, Kotlin offers framework-specific tooling (for example, for Spring) in the plugin for IntelliJ IDEA Ultimate.\n" +
                "=> Learning Curve: For a Java developer, getting started with Kotlin is very easy. The automated Java to Kotlin converter included in the Kotlin plugin helps with the first steps. Kotlin Koans offer a guide through the key features of the language with a series of interactive exercises.");

        k2.setText("=> Spring makes use of Kotlin's language features to offer more concise APIs, starting with version 5.0. The online project generator allows to quickly generate a new project in Kotlin.\n" +
                "\n" +
                "=> Vert.x, a framework for building reactive Web applications on the JVM, offers dedicated support for Kotlin, including full documentation.\n" +
                "\n" +
                "=> Ktor is a Kotlin-native Web framework built by JetBrains, making use of coroutines for high scalability and offering an easy-to-use and idiomatic API.\n" +
                "\n" +
                "=> kotlinx.html is a DSL that can be used to build HTML in a Web application. It serves as an alternative to traditional templating systems such as JSP and FreeMarker.\n" +
                "\n" +
                "=> The available options for persistence include direct JDBC access, JPA, as well as using NoSQL databases through their Java drivers. For JPA, the kotlin-jpa compiler plugin adapts Kotlin-compiled classes to the requirements of the framework.");


    }
}