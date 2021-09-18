package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "receptionist")
public class Receptionist {
	
	@Id
	private int receptionistId;
	@Column
	private String receptionistName;
	@Column
	private String phoneNumber;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String confirmPassword;
}