package com.example.demo.domain;

import java.util.*;

import lombok.*;

@Data
public class SupplerView {
	private int supplierId;
	private String supplierName;
	private String contactName;
	private String address;
	private String city;
	private String postalCode;
	private String country;
	private String phone;
	private List<Product> products;
}
