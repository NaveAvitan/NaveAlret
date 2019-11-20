package com.example.navealret;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

/**
 * this activity offer you 5 buttons for diffrent actions in the screen
 */
public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder adb,adb2,adb3,adb4,adb5;
    LinearLayout lin;

    /**
     * this act create the option menu
     * @param menu
     * @return
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    /**
     * here you move to credit activity
     * @param menu
     * @return
     */
    public boolean onOptionsItemSelected(MenuItem menu) {
        String st= menu.getTitle().toString();
        if ((st.equals("credits"))){
            Intent si = new Intent(this, Credits.class);
            startActivity(si);
        }


        return true;
    }


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lin=findViewById(R.id.lin);
    }

    /**
     * first button- show youa massage
     * @param view
     */
    public void first(View view) {
    adb= new AlertDialog.Builder(this);

    adb.setTitle("click the screen to close");
    adb.setMessage("hello user");
    AlertDialog ad= adb.create();
    ad.show();
    }

    /**
     * secend button- massage with icon
     * @param view
     */
    public void secend(View view) {
        adb2= new AlertDialog.Builder(this);
        adb2.setIcon(R.drawable.myicon);
        adb2.setTitle("click the screen to close");
        adb2.setMessage("have a nice day");
        AlertDialog ad= adb2.create();
        ad.show();
    }

    /**
     * three button- close option
     * @param view
     */
    public void three(View view) {
        adb3= new AlertDialog.Builder(this);
        adb3.setIcon(R.drawable.myicon);
        adb3.setTitle("click the close button to close");
        adb3.setMessage("you doing well");
        adb3.setPositiveButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad= adb3.create();
        ad.show();
    }

    /**
     * fourth button- switch the background color
     * @param view
     */
    public void four(View view) {
        adb4= new AlertDialog.Builder(this);
        adb4.setIcon(R.drawable.myicon);
        adb4.setTitle("click the close button to close");
        adb4.setMessage("you are the best");
        adb4.setPositiveButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb4.setNeutralButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                lin.setBackgroundColor(color);
            }
        });
        AlertDialog ad= adb4.create();
        ad.show();
    }

    /**
     * fifth button- random color or white
     * @param view
     */
    public void five(View view) {
        adb5= new AlertDialog.Builder(this);
        adb5.setIcon(R.drawable.myicon);
        adb5.setTitle("click the close button to close");
        adb5.setMessage("you are the best");
        adb5.setPositiveButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        adb5.setNeutralButton("color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                lin.setBackgroundColor(color);
            }
        });
        adb5.setNegativeButton("white", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                lin.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad= adb5.create();
        ad.show();
    }
}

