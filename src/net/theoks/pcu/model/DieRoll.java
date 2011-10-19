package net.theoks.pcu.model;

public class DieRoll {
	private String dice;

	public DieRoll(String dice) {
		super();
		this.dice = dice;
	}

	public String getDice() {
		return dice;
	}

	public void setDice(String dice) {
		this.dice = dice;
	}

	public int roll() {
		// TODO This
		return 0;
	}

	public static DieRoll parseDieRoll(String roll) {
		if (roll != null)
			return new DieRoll(roll);
		else
			return null;
	}

	public String toString() {
		return "DieRoll[" + dice + "]";
	}
}
