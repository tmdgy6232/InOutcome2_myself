package com.biz.InOutVO;

public class InOutVO {

	
	private String date;
	private String name;
	private String inout;
	private String price;
	private String volume;
	private int intTotal;
	private int outTotal;
	
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInout() {
		return inout;
	}
	public void setInout(String inout) {
		this.inout = inout;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public int getOutTotal() {
		return outTotal;
	}
	public void setOutTotal(int outTotal) {
		this.outTotal = outTotal;
	}
	@Override
	public String toString() {
		return "InOutVO [date=" + date + ", name=" + name + ", inout=" + inout + ", price=" + price + ", volume="
				+ volume + ", intTotal=" + intTotal + ", outTotal=" + outTotal + "]";
	}
	
}
