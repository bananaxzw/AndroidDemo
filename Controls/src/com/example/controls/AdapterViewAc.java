package com.example.controls;

import java.util.*;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class AdapterViewAc extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		List<User> users = new ArrayList<User>();
    	User user = new User();
    	user.SetAskedNum(8);
    	user.setLastMsg("hello");
    	user.setUsername("pxx");
    	users.add(user);
    	users.add(user);
    	users.add(user);
    	ListView listview = new ListView(this);  
    	UserListAdapter adapter = new UserListAdapter(this,R.layout.online_user_list_item,users);
    	listview.setAdapter(adapter);
    	setContentView(listview);
	}

}
