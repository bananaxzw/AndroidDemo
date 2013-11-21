package com.example.controls;

import java.util.List;

import android.R.string;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;;

public class UserListAdapter extends ArrayAdapter<User> {
	private int resourceId;
	public UserListAdapter(Context context, int textViewResourceId,	List<User> objects) {
		super(context, textViewResourceId, objects);
		this.resourceId = textViewResourceId;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		User user = getItem(position);
		LinearLayout userListItem = new LinearLayout(getContext());
		String inflater = Context.LAYOUT_INFLATER_SERVICE; 
        LayoutInflater vi = (LayoutInflater)getContext().getSystemService(inflater); 
        vi.inflate(resourceId, userListItem, true);
        TextView tvUsername = (TextView)userListItem.findViewById(R.id.tv_user_list_username);
        TextView tvAskedNum = (TextView)userListItem.findViewById(R.id.tv_user_list_askednum);
        TextView tvLastMsg = (TextView)userListItem.findViewById(R.id.tv_user_list_lastmsg);
        tvUsername.setText(user.getUsername());
        tvAskedNum.setText(String.valueOf(user.GetAskedNum()));
        tvLastMsg.setText(user.getLastMsg());
		return userListItem;
	}
}