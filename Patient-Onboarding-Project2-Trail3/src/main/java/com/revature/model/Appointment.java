package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "appointment")
public class Appointment {
	@Id
	private int patientId;
	@Column
	private String patientName;
	@Column
	private String phoneNumber;
	@Column
	private String email;
}
