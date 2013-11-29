package com.invent.jim.models.Purchase;

import com.invent.jim.OrnamentType;

public class SilverPurchase {

	public int weight;
	public int finalPrice;
	public enum SilverPurchaseType{
		ORNAMENT, ROUGH, FINE
	}
	public SilverPurchaseType purchaseType;
	public OrnamentType type;
	public int tunch;
	public int goldRate;
	public int quantity;
}
