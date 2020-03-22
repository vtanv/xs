package com.xskt.pph.models;
import java.util.*;
import com.xskt.pph.*;
import android.view.*;
import android.app.*;
import android.content.*;
import android.widget.*;


public class Customer{ 
	private String name;
	private String address;

	public Customer(String name){
		this.name = name;
	}

	public Customer(String name, String address){
		this.name = name;
		this.address = address;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}
	
}
