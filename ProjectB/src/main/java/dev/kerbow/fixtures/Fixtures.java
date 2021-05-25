package dev.kerbow.fixtures;

public abstract class Fixtures {

	public String name, shortDescription, longDescription;
	
	public Fixtures(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public String getName() {
		return name;
	}
	
	public String getCapitalName() {
		return ("" + this.name.charAt(0)).toUpperCase() + this.name.substring(1, this.name.length());
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}	
}
