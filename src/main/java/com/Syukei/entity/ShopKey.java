package com.Syukei.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;


	@Embeddable
	public class ShopKey implements Serializable {

		@Getter
		@Setter
		private int shopcode;

		@Getter
		@Setter
		private String shopname;

		@Override
		public boolean equals(Object obj) {
			// TODO 自動生成されたメソッド・スタブ
			return super.equals(obj);
		}

		@Override
		public int hashCode() {
			// TODO 自動生成されたメソッド・スタブ
			return super.hashCode();
		}





}
