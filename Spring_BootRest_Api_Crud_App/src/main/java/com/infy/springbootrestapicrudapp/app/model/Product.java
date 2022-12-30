package com.infy.springbootrestapicrudapp.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@XmlRootElement
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private Double productPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Supplier supplier;
	
}
