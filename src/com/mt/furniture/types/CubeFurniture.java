package com.mt.furniture.types;

import com.mt.furniture.Furniture;

public class CubeFurniture implements Furniture {
	
	private Double side;
	
	
	public CubeFurniture(Double side) {
		super();
		this.side = side;
	}

	@Override
	public String furnitureType() {
		// TODO Auto-generated method stub
		return "Cubicle";
	}

	@Override
	public String toString() {
		return "CubeFurniture [furniture type=" + furnitureType() + ", volume =" + volume() + "]";
	}

	@Override
	public Double volume() {
		// TODO Auto-generated method stub
		Double volume = Math.pow(side, 3);
		return volume;
	}

}
