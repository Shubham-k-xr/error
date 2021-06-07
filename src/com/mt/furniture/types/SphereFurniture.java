package com.mt.furniture.types;

import com.mt.furniture.Furniture;

public class SphereFurniture implements Furniture {

	
	private Double radius;

	public SphereFurniture() {
		super();
	}

	

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public SphereFurniture( Double radius) {
		super();
		
		this.radius = radius;
	}

	@Override
	public String furnitureType() {
		// TODO Auto-generated method stub
		return "Sphere";
	}

	



	



	@Override
	public String toString() {
		return "SphereFurniture [radius=" + radius + ", furniture type=" + furnitureType() + ", volume =" + volume()
				+ "]";
	}



	@Override
	public Double volume() {
		// TODO Auto-generated method stub
		Double v = (4 * 3.14 * radius*radius*radius )/3; 
		return v;
	}

}
