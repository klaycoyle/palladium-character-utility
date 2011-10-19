package net.theoks.pcu.model.xml;

import net.theoks.pcu.model.Module;

public class XmlModule {
	private String folder, name, priority;

	public XmlModule(String folder, String name, String priority) {
		this.folder = folder;
		this.name = name;
		this.priority = priority;
	}

	public XmlModule() {
		this.folder = null;
		this.name = null;
		this.priority = null;
	}

	public Module generateModule() {
		Module toReturn = new Module();
		toReturn.setName(name);
		toReturn.setFolder(folder + "/");
		if (priority.toLowerCase().equals("maximum"))
			toReturn.setPriority(3);
		else if (priority.toLowerCase().equals("medium"))
			toReturn.setPriority(2);
		else if (priority.toLowerCase().equals("minimum"))
			toReturn.setPriority(1);
		return toReturn;
	}

	public String getFolder() {
		return folder;
	}

	public String getName() {
		return name;
	}

	public String getPriority() {
		return priority;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String toString() {
		return "XmlModule [folder=" + folder + ", name=" + name + ", priority="
				+ priority + "]";
	}
}