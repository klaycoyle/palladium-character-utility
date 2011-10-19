package net.theoks.pcu.model;

import java.util.List;

public class Module {
	private String folder, name;
	private int priority;
	private List<Race> races;
	private List<Skill> skills;
	private List<Occ> classes;

	public Module() {
		this.folder = null;
		this.name = null;
		this.priority = 0;
		races = null;
		skills = null;
		classes = null;
	}

	public String getFolder() {
		return folder;
	}

	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public List<Race> getRaces() {
		return races;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public List<Occ> getClasses() {
		return classes;
	}

	public void setRaces(List<Race> races) {
		this.races = races;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public void setClasses(List<Occ> classes) {
		this.classes = classes;
	}

	public String toString() {
		return "Module [folder=" + folder + ", name=" + name + ", priority="
				+ priority + ", races=" + races + ", skills=" + skills
				+ ", classes=" + classes + "]";
	}
}