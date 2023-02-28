package intern.project2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import intern.project2.Model.Item;
import intern.project2.adapter.CustomListAdapter;
import intern.project2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());


        b.imgBtnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setMessage("Are you sure you want to exit the app?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                MainActivity.super.finishAndRemoveTask();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();


            }
        });

        b.btnScreenOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScreenOneActivity.class));
                Toast.makeText(MainActivity.this, "This is Screen One", Toast.LENGTH_SHORT).show();;
            }
        });

        b.btnScreenTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScreenTwoActivity.class));
                Toast.makeText(MainActivity.this, "This is Screen Two", Toast.LENGTH_SHORT).show();
            }

        });

        b.btnScreenThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScreenThreeActivity.class));
                Toast.makeText(MainActivity.this, "This is Screen Three", Toast.LENGTH_SHORT).show();
            }
        });
        
        b.btnScreenFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScreenFourActivity.class));
                Toast.makeText(MainActivity.this, "This is Screen Four", Toast.LENGTH_SHORT).show();
            }
        });
        
        b.btnScreenFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScreenFiveActivity.class));
                Toast.makeText(MainActivity.this, "This is Screen Five", Toast.LENGTH_SHORT).show();
            }
        });
    }


}