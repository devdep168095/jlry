package com.invent.jim;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.dropbox.client2.DropboxAPI;
import com.dropbox.client2.DropboxAPI.Entry;
import com.dropbox.client2.android.AndroidAuthSession;
import com.dropbox.client2.exception.DropboxException;
import com.dropbox.client2.session.AppKeyPair;
import com.dropbox.client2.session.Session.AccessType;

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

		uiHandler.post(new Runnable() {
			
			@Override
			public void run() {

				callback.complete(true);				
			}
		});
	}
	
	public static void importDatabase() {
		Log.d(TAG, "importDatabase");
	}
	

	private boolean searchFile() {
		File file = new File("/data/data/com.invent.jim/databases/sugar_example.db");
		if(file.exists()) {
			Log.d(TAG, "It exists");
			return true;
		} else {
			Log.d(TAG, "Does not exist");
			return false;
		}
	}
	

	
}
