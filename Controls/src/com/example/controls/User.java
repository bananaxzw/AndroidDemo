package com.example.controls;

import android.R.integer;
import android.R.string;

public class User {

	int AskedNum = 0;
	String LastMsg;
	String Username;

	public void SetAskedNum(int num) {
		this.AskedNum = num;
	}

	public int GetAskedNum() {
		return this.AskedNum;
	}

	public String getLastMsg() {
		return LastMsg;
	}

	public void setLastMsg(String lastMsg) {
		LastMsg = lastMsg;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}


}
