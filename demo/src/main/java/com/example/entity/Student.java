package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection  = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private String id;
//	MongoDB does NOT auto-generate numeric IDs (like Long) the way SQL databases do.
//	Let MongoDB auto-generate ID using String or ObjectId
	private String name;
	
}
