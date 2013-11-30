package com.invent.jim.models.Purchase;

import android.content.Context;

import com.invent.jim.OrnamentType;
import com.orm.SugarRecord;

public class GoldPurchase extends SugarRecord<GoldPurchase> {

	long date;
	public int weight;
	public int finalPrice;
	public enum GoldPurchaseType{
		ORNAMENT, ROUGH, FINE
	}
	public int purchaseType;
	public OrnamentType type;
	public int tunch;
	public int goldRate;
	public int quantity;	
	
	public GoldPurchase(Context arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public GoldPurchase(Context arg0, GoldPurchaseType purchaseType, int weight, int tunch, int goldRate, OrnamentType ornamentType, int quantity) {
		super(arg0);
	}
	
}
