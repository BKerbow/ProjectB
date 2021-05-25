package dev.kerbow.fixtures;

public interface Lockable {
	void unlock();
	boolean lock();
	boolean isLocked();
}
