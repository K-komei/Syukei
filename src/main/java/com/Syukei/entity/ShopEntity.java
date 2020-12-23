package com.Syukei.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Shop")


public class ShopEntity {
	@EmbeddedId
	private ShopKey shopkey;

	@Getter
	@Setter
	private String shopmaster;

}


