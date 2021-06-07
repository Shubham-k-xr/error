package com.mt.furniture.types;

import com.mt.furniture.Furniture;

public class CuboidFurniture implements Furniture {

	private Double length;
	private Double breadth;
	private Double height;

	public CuboidFurniture() {
		super();
	}

	public CuboidFurniture( Double length, Double breadth, Double height) {
		super();
		
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getBreadth() {
		return breadth;
	}

	public void setBreadth(Double breadth) {
		this.breadth = breadth;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public String furnitureType() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

	@Override
	public Double volume() {
		// TODO Auto-generated method stub
		return this.length * this.breadth * this.height;

	}
	

	@Override
	public String toString() {
		return "CuboidFurniture [furniture type=" + furnitureType() + ", volume =" + volume() + "]";
	}

}
