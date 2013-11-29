package com.invent.jim.models.Sale;

import java.util.ArrayList;
import java.util.List;

public class SaleGroup {
	String name;	
	List<DiamondSale> diamond = new ArrayList<DiamondSale>();
	List<GoldSale> gold = new ArrayList<GoldSale>();
	List<SilverSale> silver = new ArrayList<SilverSale>();
}
