package com.jyn.aidldemoservice;

import com.jyn.aidl.Demo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

public class DemoService extends Service{

	private Binder myBinder = new MyBinder();
	
	@Override
	public IBinder onBind(Intent arg0) {
		return myBinder;
	}
	
	private final class MyBinder extends Demo.Stub{

		@Override
		public String getDemo() throws RemoteException {
			return "Demo";
		}
		
	}
	
}
