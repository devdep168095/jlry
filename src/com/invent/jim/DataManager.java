package com.invent.jim;

import java.util.HashMap;

import android.util.Log;

import com.invent.jim.models.Purchase.DiamondPurchase;
import com.invent.jim.models.Purchase.GoldPurchase;
import com.invent.jim.models.Purchase.SilverPurchase;
import com.invent.jim.models.Sale.SaleGroup;

public class DataManager {
	private final static String TAG = "DataManager";
	private static DataManager instance;
	
	private int currentGoldRate;
	private int currentSilverRate;
	private int currentDiamondRate;
	
	private HashMap<OrnamentType, Integer> makingChargesMap = new HashMap<OrnamentType, Integer>();
	
	private DataManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static DataManager instance() {
		if(instance == null) {
			instance = new DataManager();
		}
		return instance;
	}

	/**
	 * @return the currentGoldRate
	 */
	public int getCurrentGoldRate() {
		return currentGoldRate;
	}

	/**
	 * @param currentGoldRate the currentGoldRate to set
	 */
	public void setCurrentGoldRate(int currentGoldRate) {
		this.currentGoldRate = currentGoldRate;
	}

	/**
	 * @return the currentSilverRate
	 */
	public int getCurrentSilverRate() {
		return currentSilverRate;
	}

	/**
	 * @param currentSilverRate the currentSilverRate to set
	 */
	public void setCurrentSilverRate(int currentSilverRate) {
		this.currentSilverRate = currentSilverRate;
	}

	/**
	 * @return the currentDiamondRate
	 */
	public int getCurrentDiamondRate() {
		return currentDiamondRate;
	}

	/**
	 * @param currentDiamondRate the currentDiamondRate to set
	 */
	public void setCurrentDiamondRate(int currentDiamondRate) {
		this.currentDiamondRate = currentDiamondRate;
	}

	/**
	 * Save making charges of an ornament
	 * @param ornament
	 * @param makingCharges
	 */
	public void saveMakingChargesForOrnament(OrnamentType ornament, int makingCharges) {
		Log.d(TAG, "saveMakingChargesForOrnament");
		this.makingChargesMap.put(ornament, makingCharges);
	}
	
	/**
	 * Get making charges of an ornament if saved previously
	 * @param ornament
	 * @return int making charges if previously saved else -1
	 */
	public int getMakingChargesForOrnament(OrnamentType ornament) {
		Log.d(TAG, "getMakingChargesForOrnament");
		if (this.makingChargesMap.containsKey(ornament))
			return this.makingChargesMap.get(ornament);
		return -1;
	}
	
	public void saveDiamondPurchase(DiamondPurchase purchase) {
		Log.d(TAG, "saveDiamondPurchase");
	}
	
	public void saveGoldPurchase(GoldPurchase purchase) {
		Log.d(TAG, "saveGoldPurchase");
	}
	
	public void saveSilverPurchase(SilverPurchase purchase) {
		Log.d(TAG, "saveSilverPurchase");
	}
	
	public void saveSale(SaleGroup sale) {
		Log.d(TAG, "saveSale");
	}	
}
