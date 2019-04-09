package com.example.administrator.mobliesafe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class BootCompleteReciever extends BroadcastReceiver{
	private  static  final  String TAG=BootCompleteReciever.class.getSimpleName();
	@Override
	public void onReceive(Context context, Intent intent) {
		((App)context.getApplicationContext()).correctSIM();

		}
	}

