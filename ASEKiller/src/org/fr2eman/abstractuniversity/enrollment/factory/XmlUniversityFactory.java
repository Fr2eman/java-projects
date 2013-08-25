package org.fr2eman.abstractuniversity.enrollment.factory;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.fr2eman.abstractuniversity.enrollment.domain.Faculty;
import org.fr2eman.abstractuniversity.enrollment.domain.Specialty;
import org.fr2eman.abstractuniversity.enrollment.domain.University;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlUniversityFactory implements UniversityFactory {

	private static XmlUniversityFactory instance;

	public University getUniversity(Universities u) {
		University univer = null;
		if (u == Universities.BSUIR) {
			try {
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(getClass().getResourceAsStream("/xml/bsuir.xml"));
			 
				// optional, but recommended
				// read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
				doc.getDocumentElement().normalize();
			 
				univer = new University("BSUIR");
			
				NodeList fNodes = doc.getElementsByTagName("faculty");
				for (int fIndex = 0; fIndex < fNodes.getLength(); fIndex++) {
					Node fNode = fNodes.item(fIndex);
					String fName = fNode.getAttributes().getNamedItem("name").getTextContent();
						
					Faculty f = new Faculty(fName);
					
					NodeList sNodes = ((Element)fNode).getElementsByTagName("specialty");
					for (int sIndex = 0; sIndex < sNodes.getLength(); sIndex++) {
						Node sNode = sNodes.item(sIndex);
						String sName = sNode.getAttributes().getNamedItem("name").getTextContent();
						String sPlaceCount = sNode.getAttributes().getNamedItem("place").getTextContent();
						
						Specialty s = new Specialty(sName);
						s.setPlaceCount(Integer.parseInt(sPlaceCount));
						s.setFaculty(f);
						
						f.getSpecialities().add(s);
					}
					
					univer.getListFaculty().add(f);
				}

			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return univer;
	}

	public static XmlUniversityFactory getFactory() {
		return instance;
	}
}
