package com.invent.jim.models.Purchase;

import java.util.Date;

import android.content.Context;

import com.invent.jim.OrnamentType;
import com.orm.SugarRecord;

public class SilverPurchase extends SugarRecord<SilverPurchase>{

	public long date;
	public int weight;
	public int finalPrice;
	public enum SilverPurchaseType{
		ORNAMENT, ROUGH, FINE
	}
	public int purchaseType;
	public int ornamentType;
	public int tunch;
	public int goldRate;
	public int quantity;
	
	public SilverPurchase(Context arg0, int weight, int tunch, int goldRate,
			SilverPurchaseType purchaseType, int finalPrice,
			OrnamentType ornamentType, int quantity) {
		super(arg0);
		this.date = new Date().getTime();
		this.weight = weight;
		this.tunch = tunch;
		this.goldRate = goldRate;
		this.purchaseType = purchaseType.ordinal();
		this.ornamentType = ornamentType.ordinal();
		this.quantity = quantity;
		this.finalPrice = finalPrice;
	}
	
}
