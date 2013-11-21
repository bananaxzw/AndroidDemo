package com.example.controls;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import  android.widget.ListView;
public class ArrayAdapterSimple  extends Activity{

	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
    	ListView listview = new ListView(this);
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1);
    	adapter.add("string1");
    	adapter.add("haha");
    	adapter.add("heihei");    	
    	listview.setAdapter(adapter);
    	setContentView(listview);  
	}
}
