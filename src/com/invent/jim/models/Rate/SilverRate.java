package com.invent.jim.models.Rate;

import java.util.Date;

import com.orm.SugarRecord;

import android.content.Context;

public class SilverRate extends SugarRecord<SilverRate>{

	long date;
	int rate;
	
	public SilverRate(Context arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public SilverRate(Context arg0, int rate) {
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
