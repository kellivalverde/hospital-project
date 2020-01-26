package org.wecancodeit;

public class Patient {

	private static final int DEFAULT_HEALTH_LEVEL = 10;
	private static final int DEFAULT_BLOOD_LEVEL = 20;

	private int healthLevel = DEFAULT_HEALTH_LEVEL;
	private int bloodLevel = DEFAULT_BLOOD_LEVEL;

	// accessors
	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	// methods
	public void removeBlood(int amount) {
		bloodLevel -= amount;
	}

	public void receiveHealth(int amount) {
		healthLevel += amount;

	}

}
