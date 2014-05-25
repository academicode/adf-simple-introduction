package com.marcjmcdougall.simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {

	private Button toast;
	private Button nextActivity;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        toast = (Button) findViewById(R.id.button2);
        nextActivity = (Button) findViewById(R.id.button1);
        
        toast.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Toast toast = Toast.makeText(Main.this, "This is a toast notification!", Toast.LENGTH_LONG);
				
				toast.setGravity(0, 0, 300);
				
				toast.show();
			}
		});
        
        nextActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(Main.this, NextActivity.class));
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
    	// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
