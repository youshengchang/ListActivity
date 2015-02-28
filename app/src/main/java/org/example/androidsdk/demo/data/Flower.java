package org.example.androidsdk.demo.data;

public class Flower {
	public String flowerName;
	public int imageResource;
	public String instructions;

	public Flower(String id, int imageResource, String instructions) {
		this.flowerName = id;
		this.imageResource = imageResource;
		this.instructions = instructions;
	}

	@Override
	public String toString() {
		return flowerName;
	}
}

