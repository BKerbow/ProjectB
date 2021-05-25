package dev.kerbow.fixtures;

public class Door extends Fixtures implements Openable, Lockable {

	private boolean isLocked = false;
	private boolean isOpen = false;
	private Room room;

	public Door(String name, String shortDescription, String longDescription){
		super(name, shortDescription, longDescription);
		this.room  = room;
		this.isOpen = isOpen;
		this.isLocked = isLocked;
	}

	public Room getRoom() {
		if(this.isLocked) return this.room;
		return null;
	}

	@Override
	public boolean open() {
		if(!this.isLocked) {
			this.isOpen = true;
			return true;
		}
		return false;
	}

	@Override
	public void close() {
		this.isOpen = false;
	}

	@Override
	public boolean isOpen() {
		return this.isOpen;
	}

	@Override
	public void unlock() {
		this.isLocked = false;
	}

	@Override
	public boolean lock() {
		if(!this.isOpen) {
			this.isLocked = true;
			return true;
		}
		return false;
	}

	@Override
	public boolean isLocked() {
		return this.isLocked;
	}
}
