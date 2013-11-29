package com.invent.jim;

public class DataManager {
	private final static String TAG = "DataManager";
	private static DataManager instance;
	
	
	private DataManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static DataManager instance() {
		if(instance == null) {
			instance = new DataManager();
		}
		return instance;
	}

}
