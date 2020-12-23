package com.Syukei.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Syukei_SalesMan")

public class SalesManEntity{
	@Id
	@Getter
	@Setter
	private int e_no;

	@Getter
	@Setter
	private String e_name;

	@Getter
	@Setter
	private String shopcode;

	@Getter
	@Setter
	private String position;

}
