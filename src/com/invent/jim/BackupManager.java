package com.invent.jim;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class BackupManager {
	private static final String TAG = "BackupManager";
	
	private static Handler uiHandler = new Handler(Looper.getMainLooper());
	
	
	public interface TaskCompleteCallback {
		void complete(boolean success);
	}
	
	public BackupManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isDatabasePresent() {
		Log.d(TAG, "isDatabasePresent");
		return true;
	}
	
	/**
	 * starts backing up database async. When backup is complete,
	 * It sends status through callback
	 * @param callback
	 */
	public static void backupDatabase(final TaskCompleteCallback callback) {
		Log.d(TAG, "backupDatabase");
		//TODO for now, it just returns success after 2 seconds
		uiHandler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				callback.complete(true);				
			}
		}, 2000);
	}
	
	public static void importDatabase() {
		Log.d(TAG, "importDatabase");
	}
}
