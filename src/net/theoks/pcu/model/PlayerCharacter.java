package net.theoks.pcu.model;

import java.util.List;
import java.util.Map;

public class PlayerCharacter {
	private Race race;
	private Occ occ;
	// Integer is level of skill. From that, extrapolates current percent
	private Map<Skill, Integer> classSkills;
	private Map<Skill, Integer> relatedSkills;
	private Map<Skill, Integer> secondarySkills;
	private int hp = 0, sdc = 0, exp = 0, expLevel = 0;
	private Attributes attributes;
	// Integer is number of that item you have.
	private Map<Item, Integer> items;
}
