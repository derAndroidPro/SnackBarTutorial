package de.derandroidpro.snackbartutorial;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(findViewById(R.id.activity_main_layout), "Das hier ist die SnackBar", Snackbar.LENGTH_LONG)
                        .setAction("ActionBar färben", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                int color = Color.argb(255, new Random().nextInt(255), new Random().nextInt(255),new Random().nextInt(255));
                                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(color));
                            }
                        })
                        .show();



            }
        });

    }


}
