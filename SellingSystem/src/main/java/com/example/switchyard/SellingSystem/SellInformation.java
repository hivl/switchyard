package com.example.switchyard.SellingSystem;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SellInformation")
public class SellInformation implements Serializable{
	
	private static final long serialVersionUID = -5315404493352518745L;
	
	private Integer id;
	private String name;
	private Integer count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "SellInformation [id=" + id + ", name=" + name + ", count="
				+ count + "]";
	}
	
	

}
