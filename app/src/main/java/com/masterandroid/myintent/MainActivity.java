package com.masterandroid.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edt);

        findViewById(R.id.btnNext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);*/
               startActivity( new Intent(MainActivity.this,Activity2.class));
            }
        });

        findViewById(R.id.btnDetails).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String str= editText.getText().toString();
               if (str.length()==0){
                   editText.setError("Insert value");
                   Toast.makeText(MainActivity.this, "Insert value", Toast.LENGTH_SHORT).show();
                   Log.e("Main","put some value");
                   return;
               }
                try {

                    Intent intent = new Intent(MainActivity.this, Details.class);
                    intent.putExtra("str_key",str);
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {

                    Log.e("Main", "Activity is not mention in Manifest " + e.getMessage());
                    Toast.makeText(MainActivity.this, "Check Manifaest", Toast.LENGTH_SHORT).show();
                } finally {

                }
            }
        });
    }
}
