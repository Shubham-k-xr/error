package com.mt.furniture.application;


import com.mt.furniture.Furniture;
import com.mt.furniture.types.CubeFurniture;
import com.mt.furniture.types.CuboidFurniture;
import com.mt.furniture.types.SphereFurniture;

public class FurnitureApp {

	static Furniture[] furnitures = new Furniture[9];
	
	static void addFurnitures() {
		CuboidFurniture c1 = new CuboidFurniture(10.0,10.0,10.0);
		furnitures[0] = c1;
		CuboidFurniture c2 = new CuboidFurniture(13.0,10.5,10.0);
		furnitures[1] = c2;
		CuboidFurniture c3 = new CuboidFurniture(40.0,20.4,19.9);
		furnitures[2] = c3;
		
		SphereFurniture s1 = new SphereFurniture(10.0);
		furnitures[3] = s1;
		SphereFurniture s2 = new SphereFurniture(19.20);
		furnitures[4] = s2;
		SphereFurniture s3 = new SphereFurniture(40.0);
		furnitures[5] = s3;
		
		CubeFurniture cu1 = new CubeFurniture(11.0);
		furnitures[6] = cu1;
		CubeFurniture cu2 = new CubeFurniture(11.0);
		furnitures[7] = cu2;
		CubeFurniture cu3 = new CubeFurniture(11.0);
		furnitures[8] = cu3;		
		
	}
	
	static double maxVolume() {
		double maxVolume = 0;
		for(int i = 0; i<furnitures.length;i++) {
			if(furnitures[i].volume() > maxVolume ) {
				maxVolume = furnitures[i].volume();
			}
		}
		return maxVolume;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addFurnitures();
		
		Double maximumVolume = 0.0;
		
		for(int i = 0; i<furnitures.length;i++) {
			System.out.println("type : " + furnitures[i].furnitureType() + 
					" volume : " + furnitures[i].volume());
			
			System.out.println();
		}
		
		maximumVolume = maxVolume();
		
		System.out.println("maximum volume : " + maximumVolume);
		
	}

}
