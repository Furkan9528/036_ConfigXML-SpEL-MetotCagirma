package com.furkankara;

import org.springframework.beans.factory.annotation.Value;

public class Kitap {
	
	private String eserAdi;
	private long eserISBN;
	private Yazar yazar;

	public Yazar getYazar() {
		return yazar;
	}
	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}
	public String getEserAdi() {
		return eserAdi;
	}
	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}
	public long getEserISBN() {
		return eserISBN;
	}
	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}
	
	public String kitapBilgisiniYaz(Yazar yazar,String eserAdi, Long eserISBN ) {
		
		this.eserAdi= eserAdi;
		this.eserISBN = eserISBN;
		this.yazar = yazar;
		
		return 	"\n\t YAZAR :" + getYazar().getAdi()+ " " + getYazar().getSoyadi()+
				"\n\t KITAP :"  + getEserAdi() + 
				"\n\t ISBN : "   + getEserISBN();
	
	}
}
