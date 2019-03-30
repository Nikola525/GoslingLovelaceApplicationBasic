package com.example.goslinglovelaceapplicationbasic;

import android.content.res.Configuration;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import java.util.Locale;
import java.util.Locale;
import java.util.Locale;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Locale currlocale = Locale.getDefault();
        if(currlocale.equals(Locale.SIMPLIFIED_CHINESE)){
            DisplayMetrics metrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                configuration.setLocale(Locale.SIMPLIFIED_CHINESE);
            } else {
                configuration.locale = Locale.SIMPLIFIED_CHINESE;
            }
            getResources().updateConfiguration(configuration, metrics);
        }



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
