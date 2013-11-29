package com.invent.jim;

public enum OrnamentType {
	PAYAL (0, "PAYAL"),
    BICHIA   (1, "BICHIA"),
    KHADUA   (2, "KHADUA"),
    KUNDANI    (3, "KUNDANI"),
    LACHHE (4,  "LACHHE"),
    JHUMKI  (5, "JHUMKI"),
	CHAIN  (6, "CHAIN"),
	RING  (7, "RING"),
	TOP  (8, "TOP");
	
	private final int id;   // in kilograms
    private final String name; // in meters
    OrnamentType(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    String getName() {
    	return this.name;    	
    }
    
    int getId() {
    	return this.id;  	
    }
}
