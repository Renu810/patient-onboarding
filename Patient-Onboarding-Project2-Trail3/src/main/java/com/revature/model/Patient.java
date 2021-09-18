package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "patient")
public class Patient {

	//	@SequenceGenerator(name="seq", initialValue=950, allocationSize=999)
	//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Id
	private int patientId;
	
	@Column
	private String patientName;
	@Column
	private String phoneNumber;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String confirmPassword;
	@Column
	private int invoice = 0;
}
