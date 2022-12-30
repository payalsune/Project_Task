package com.infy.springbootrestapicrudapp.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer supplierId;
	private String supplierName;
	private Long supplierContact;
}
