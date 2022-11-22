package com.productstore.storeBook01.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity	
@Data @NoArgsConstructor @AllArgsConstructor
public class Book {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String image;
	private String description;
	private String author;
	private String type;
	private Long price;
	private String detail;

}




	
	
	
	

