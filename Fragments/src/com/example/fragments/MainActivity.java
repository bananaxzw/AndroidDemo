package com.example.fragments;

import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	 Fragment1 fragment1 = new Fragment1(); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		  FragmentTransaction transaction=getFragmentManager().beginTransaction();
	Button s=	(Button)findViewById(R.id.btn_remove);
	  
	s.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			 Fragment2 fragment2 = new Fragment2();  
			 //getFragmentManager().beginTransaction().remove(MainActivity.this.fragment1).commit();
			// Fragment s=getFragmentManager().findFragmentByTag("xxx");
			 //getFragmentManager().beginTransaction().remove(s).commit();
			 
			 getFragmentManager().beginTransaction().replace(R.id.main_layout, fragment2).commit(); 
		}
	});
	
	        Display display = getWindowManager().getDefaultDisplay();  
	      
	       // if (display.getWidth() > display.getHeight()) {  
	          
	           // getFragmentManager().beginTransaction().replace(R.id.main_layout, fragment1).commit();  
	            transaction.add(R.id.main_layout, fragment1,"xxx").commit();
	            
	       // } else {  
	         //   Fragment2 fragment2 = new Fragment2();  
	         //   getFragmentManager().beginTransaction().replace(R.id.main_layout, fragment2).commit();  
	       // }  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
