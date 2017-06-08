package com.example.jirayu.jirayu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jirayu on 8/6/2560.
 */

public class Second extends Activity {
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_form2);
         Button button =(Button)findViewById(R.id.button3);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i = new Intent(getApplicationContext(),Tip.class);
                 startActivity(i);

             }
         });

     }
}
