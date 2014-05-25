package com.marcjmcdougall.simple;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NextActivity extends Activity {

	private Button previousActivity; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next);
		
		previousActivity = (Button) findViewById(R.id.button1);
		
		previousActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				NextActivity.this.finish();
			}
		});
	}
	
}
