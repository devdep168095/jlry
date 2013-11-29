package com.invent.jim.models.Purchase;

import com.invent.jim.OrnamentType;

public class GoldPurchase {

	public int weight;
	public int finalPrice;
	public enum GoldPurchaseType{
		ORNAMENT, ROUGH, FINE
	}
	public GoldPurchaseType purchaseType;
	public OrnamentType type;
	public int tunch;
	public int goldRate;
	public int quantity;
}
