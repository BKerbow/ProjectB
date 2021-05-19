package dev.kerbow.fixtures;

public abstract class Fixtures {

	public String name, shortDescription, longDescription;
	
	public Fixtures(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
}
