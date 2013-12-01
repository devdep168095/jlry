package com.invent.jim.models.Purchase;

import java.util.Date;

import android.content.Context;

import com.invent.jim.OrnamentType;
import com.orm.SugarRecord;

public class GoldPurchase extends SugarRecord<GoldPurchase> {

	long date;
	public int weight;
	public int finalPrice;

	public enum GoldPurchaseType {
		ORNAMENT, ROUGH, FINE
	}

	public int purchaseType;
	public int ornamentType;
	public int tunch;
	public int goldRate;
	public int quantity;

	public GoldPurchase(Context arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public GoldPurchase(Context arg0, int weight, int tunch, int goldRate,
			GoldPurchaseType purchaseType, int finalPrice,
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
