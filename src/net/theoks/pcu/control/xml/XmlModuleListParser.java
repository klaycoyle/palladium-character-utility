package net.theoks.pcu.control.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import net.theoks.pcu.model.Module;
import net.theoks.pcu.model.xml.XmlModule;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlModuleListParser {

	public static List<Module> loadModules(File f) {
		List<Module> toReturn = new ArrayList<Module>(1);
		try {
			File file = new File(System.getProperty("user.dir")
					+ "/dat/installed_modules.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();

			NodeList modList = doc.getElementsByTagName("Module");

			// Iterate through every race
			for (int modIndex = 0; modIndex < modList.getLength(); ++modIndex) {
				Node moduleNode = modList.item(modIndex);
				toReturn.add(handleNode(moduleNode, 0).generateModule());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return toReturn;
	}

	private static XmlModule handleNode(Node n, int depth) {
		// Handle the attributes for each race
		if (n.getNodeType() == Node.ELEMENT_NODE) {
			XmlModule xm = new XmlModule();
			NamedNodeMap attr = n.getAttributes();
			for (int i = 0; i < attr.getLength(); ++i) {
				if (attr.item(i).getNodeName().toLowerCase().equals("folder"))
					xm.setFolder(attr.item(i).getTextContent());
				else if (attr.item(i).getNodeName().toLowerCase()
						.equals("name"))
					xm.setName(attr.item(i).getTextContent());
				else if (attr.item(i).getNodeName().toLowerCase().equals(
						"priority"))
					xm.setPriority(attr.item(i).getTextContent());
			}
			return xm;
		}
		return null;
	}
}
