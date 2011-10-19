package net.theoks.pcu.model;

import java.util.ArrayList;
import java.util.List;

public class CombatModifiers {
	public class Save {

	}

	public class NaturalWeapon {

	}

	private int dodge, parry, roll, attacks, initiative;

	private List<NaturalWeapon> naturalWeapons;
	private List<Save> saves;

	public CombatModifiers(int dodge, int parry, int roll, int attacks,
			int initiative, List<NaturalWeapon> naturalWeapons, List<Save> saves) {
		super();
		this.dodge = dodge;
		this.parry = parry;
		this.roll = roll;
		this.attacks = attacks;
		this.initiative = initiative;
		this.naturalWeapons = naturalWeapons;
		this.saves = saves;
	}

	public CombatModifiers() {
		super();
		this.dodge = 0;
		this.parry = 0;
		this.roll = 0;
		this.attacks = 0;
		this.initiative = 0;
		this.naturalWeapons = new ArrayList<NaturalWeapon>(2);
		this.saves = new ArrayList<Save>(2);
	}

	public int getDodge() {
		return dodge;
	}

	public int getParry() {
		return parry;
	}

	public int getRoll() {
		return roll;
	}

	public int getAttacks() {
		return attacks;
	}

	public int getInitiative() {
		return initiative;
	}

	public List<NaturalWeapon> getNaturalWeapons() {
		return naturalWeapons;
	}

	public List<Save> getSaves() {
		return saves;
	}

	public void setDodge(int dodge) {
		this.dodge = dodge;
	}

	public void setParry(int parry) {
		this.parry = parry;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setAttacks(int attacks) {
		this.attacks = attacks;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	public void setNaturalWeapons(List<NaturalWeapon> naturalWeapons) {
		this.naturalWeapons = naturalWeapons;
	}

	public void setSaves(List<Save> saves) {
		this.saves = saves;
	}

	@Override
	public String toString() {
		return "CombatModifiers [dodge=" + dodge + ", parry=" + parry
				+ ", roll=" + roll + ", attacks=" + attacks + ", initiative="
				+ initiative + ", naturalWeapons=" + naturalWeapons
				+ ", saves=" + saves + "]";
	}
}
