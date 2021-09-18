package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "doctor")
public class Doctor {

//		@SequenceGenerator(name="seq", initialValue=950, allocationSize=1)
//		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Id
	private int doctorId;
	
	@Column
	private String doctorName;
	@Column
	private String phoneNumber;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String confirmPassword;
	@Column
	private String specialisation;
}
