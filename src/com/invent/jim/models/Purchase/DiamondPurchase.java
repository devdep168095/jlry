package com.invent.jim.models.Purchase;

import java.util.Date;

import android.content.Context;

import com.orm.SugarRecord;

public class DiamondPurchase extends SugarRecord<DiamondPurchase>{
	long date;
	int weight;
	int rate;
	
	public DiamondPurchase(Context arg0) {
		super(arg0);
	}

	public DiamondPurchase(Context arg0, int weight, int rate) {
		super(arg0);
		this.weight = weight;
		this.rate = rate;
		this.date = new Date().getTime();
	}
	
	@Override
	public String toString() {
		String str = getClass().getName() + ": DATE: " + date + " :WEIGHT: " + weight + " :RATE: " + rate; 
		return str;
	}
	
}
