package net.theoks.pcu.control.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import net.theoks.pcu.control.PCU;
import net.theoks.pcu.model.Race;
import net.theoks.pcu.model.xml.XmlRace;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlRaceListParser {

	public static List<Race> parseFile(File f) {
		List<Race> toReturn = new ArrayList<Race>(4);
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(f);
			doc.getDocumentElement().normalize();

			NodeList raceList = doc.getElementsByTagName("Race");

			// Iterate through every XMLRace
			for (int raceIndex = 0; raceIndex < raceList.getLength(); ++raceIndex) {
				XmlRace xmlRace = new XmlRace();
				Node raceNode = raceList.item(raceIndex);
				handleNode(xmlRace, raceNode);
				toReturn.add(xmlRace.generateRace());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return toReturn;
	}

	private static void handleNode(XmlRace r, Node n) {
		if (n.getNodeType() == Node.ELEMENT_NODE) {

			NamedNodeMap attrMap = n.getAttributes();
			// Handle each element differently
			if (n.getNodeName().toLowerCase().equals("race")) {
				for (int i = 0; i < attrMap.getLength(); ++i) {
					Node attr = attrMap.item(i);
					String name = attr.getNodeName().toLowerCase(), text = attr
							.getTextContent();
					if (name.equals("name"))
						r.setName(text);
					else if (name.equals("ppe"))
						r.setPpe(text);
					else if (name.equals("sdc"))
						r.setSdc(text);
					else if (name.equals("iq"))
						r.setIq(text);
					else if (name.equals("me"))
						r.setMe(text);
					else if (name.equals("ma"))
						r.setMa(text);
					else if (name.equals("ps"))
						r.setPs(text);
					else if (name.equals("pp"))
						r.setPp(text);
					else if (name.equals("pe"))
						r.setPe(text);
					else if (name.equals("pb"))
						r.setPb(text);
					else if (name.equals("spd"))
						r.setSpd(text);
					else if (name.equals("diggingspd"))
						r.setDiggingSpd(text);
					else if (name.equals("nightvision"))
						r.setNightvision(text);
					else if (name.equals("dayvision"))
						r.setDayvision(text);
					else if (name.equals("horrorfactor"))
						r.setHorrorFactor(text);
					else if (name.equals("giant"))
						r.setGiant(text);
					else if (name.equals("psionics"))
						r.setPsionics(text);
				}
			} else if (n.getNodeName().toLowerCase().equals("occ")) {
				XmlRace.Occ occ = r.new Occ();
				for (int i = 0; i < attrMap.getLength(); ++i) {
					Node attr = attrMap.item(i);
					String name = attr.getNodeName().toLowerCase();
					String text = attr.getTextContent();
					if (name.equals("priority"))
						occ.setPriority(text);
					else if (name.equals("special"))
						occ.setSpecial(text);
					else if (name.equals("category"))
						occ.setCategory(text);
					else if (name.equals("classname"))
						occ.setClassName(text);
					else if (name.equals("rccname"))
						occ.setRcc(text);
					else if (name.equals("allowed"))
						occ.setAllowed(text);
				}
				r.getOccs().add(occ);
			} else if (n.getNodeName().toLowerCase().equals("skillbonuses")) {
				// TODO
			} else if (n.getNodeName().toLowerCase().equals("automaticSkill")) {
				// TODO
			} else if (n.getNodeName().toLowerCase().equals("savemodifier")) {
				// TODO
			} else if (n.getNodeName().toLowerCase().equals("combat")) {
				// TODO
			} else if (n.getNodeName().toLowerCase().equals("naturalattack")) {
				// TODO
			} else if (n.getNodeName().toLowerCase().equals("Special")) {
				// TODO
			}

			// Handle any children.
			NodeList kids = n.getChildNodes();

			for (int kidIndex = 0; kidIndex < kids.getLength(); ++kidIndex) {
				handleNode(r, kids.item(kidIndex));
			}
		}
	}
}