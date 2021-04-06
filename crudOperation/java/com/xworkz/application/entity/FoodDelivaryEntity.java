package com.xworkz.application.entity;

import com.xworkz.application.constant.FoodType;

public class FoodDelivaryEntity {

	private String name;
	private float price;
	private FoodType foodType;
	private int qunatity;

	public FoodDelivaryEntity() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public FoodDelivaryEntity(String name, float price, FoodType foodType, int qunatity) {
		super();
		this.name = name;
		this.price = price;
		this.foodType = foodType;
		this.qunatity = qunatity;
	}

	@Override
	public String toString() {
		return "FoodDelivaryEntity [name=" + name + ", price=" + price + ", foodType=" + foodType + ", qunatity="
				+ qunatity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + qunatity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodDelivaryEntity other = (FoodDelivaryEntity) obj;
		if (foodType != other.foodType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (qunatity != other.qunatity)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

	public int getQunatity() {
		return qunatity;
	}

	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}

}
