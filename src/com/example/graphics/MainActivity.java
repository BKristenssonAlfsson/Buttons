package com.example.graphics;

import android.widget.*;
import android.app.Activity;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends Activity implements View.OnClickListener {

	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private TextView message; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		message = (TextView) findViewById(R.id.editText1);
		
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			changeText(1);
		break;
		case R.id.button2:
			changeText(2);
		break;
		case R.id.button3:
			changeText(3);
		break;
		case R.id.button4:
			changeText(4);
		break;
		}
	}
	
	private void changeText( int i ) {
		switch (i){
		case 1 : message.setText("Hello");
		break;
		case 2 : message.setText("World");
		break;
		case 3 : message.setText("Android");
		break;
		case 4 : message.setText("Here");
		break;
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
