package com.example.actionbardemo;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

@SuppressLint("NewApi")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@SuppressLint("NewApi")
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		MenuItem add = menu.add(0, 1, 0, "Save");  
        MenuItem open = menu.add(0, 2, 1, "Open");  
        MenuItem close = menu.add(0, 3, 2, "Close");  
        add.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);  
        open.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);  
        close.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);  
		return true;
	}

}
