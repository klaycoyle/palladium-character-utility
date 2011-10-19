package net.theoks.pcu.model;

public class Skill {
	private String name;
	private String description;
	private int[] base;
	private int[] ppl;

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int[] getBase() {
		return base;
	}

	public int[] getPpl() {
		return ppl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBase(int[] base) {
		this.base = base;
	}

	public void setPpl(int[] ppl) {
		this.ppl = ppl;
	}

}
