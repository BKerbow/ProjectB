package dev.kerbow.fixtures;

public class ItemBox extends Fixtures implements Openable {
	
	private Item item;
	private boolean isOpen = false;
	private boolean hasItem = false;
	
	public ItemBox(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	public ItemBox(String name, String shortDescription, String longDescription, Item item) {
		this(name, shortDescription, longDescription);
		this.item = item;
		this.hasItem = (item != null);
	}
	
	public Item getItem() {
		if(!this.isOpen || this.hasItem) return null;
		this.hasItem = false;
		return this.item;
	}
	
	public boolean hasItem() {
		return this.hasItem;
	}
	
	@Override
	public boolean open() {
		this.isOpen = true;
		return true;
	}
	
	@Override
	public void close() {
		this.isOpen = false;
	}
	
	@Override
	public boolean isOpen() {
		return this.isOpen;
	}

}
