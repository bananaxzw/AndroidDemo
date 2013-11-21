package com.example.layout;

import android.os.Bundle;
import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity  implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button1=(Button)findViewById(R.id.button1);
		Button button2=(Button)findViewById(R.id.button2);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public void onClick(View view)
	{
		
		int id=view.getId();
		switch(id)
		{
		 case R.id.button1:
			Intent tnIntent=new Intent(this,FrameLayout.class);
			startActivity(tnIntent);
		case R.id.button2:
			Intent tnIntent2=new Intent(this,reusablelayout.class);
			startActivity(tnIntent2);
		}
	}
	

}
