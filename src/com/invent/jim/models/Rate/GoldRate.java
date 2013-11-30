package com.invent.jim.models.Rate;

import java.util.Date;

import android.content.Context;

import com.orm.SugarRecord;

public class GoldRate extends SugarRecord<GoldRate> {

	long date;
	int rate;

	public GoldRate(Context arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public GoldRate(Context arg0, int rate) {
		super(arg0);
		this.date = new Date().getTime();
		this.rate = rate;
	}

	@Override
	public String toString() {
		String str = getClass().getName() + ": date" + date
				+ " :rate: " + rate;
		return str;
	}

}
