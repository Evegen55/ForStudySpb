/**
 *
 */
package _java._se._09_XML._task02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.helpers.DefaultHandler;

import jdk.internal.org.xml.sax.Attributes;

/**
 * @author Lartsev
 *
 */
public class MunuReaderBy_SAX_STAX_DOM {

	private String fileName = "src/_java/_se/_09_XML/_task02/menuWithId.xml";

	//just for my purpose
	private String fileNameLibrary =
			"src/_java/_se/_09_XML/_task01/LibraryByXMLSchema_with_occurs_idicator.xml";
	private String fileNameLibrarySh =
			"src/_java/_se/_09_XML/_task01/LibraryXMLSchema.xsd";
	/**
	 * analyze XML document using SAX-parser
	 */
	public void makeSAX() {
		System.out.println("=====================================================================");
		try(FileInputStream inFile= new FileInputStream(fileName);) {
			DefaultHandler handler = new DefaultHandler() {

				/* (non-Javadoc)
				 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
				 */
				@Override
				public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) {
					if (localName.equals("food") && attributes != null){
						System.out.print(localName + " ");
		                for (int i = 0; i < attributes.getLength(); i++){
		                   String aname = attributes.getLocalName(i);
		                   if (aname.equals("id")) {
		                    	 System.out.println(attributes.getValue(i));
		                   }
		                }
					}
				}
			};
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setNamespaceAware(true);
			factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
			SAXParser saxParser = factory.newSAXParser();
			saxParser.parse(inFile, handler);
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXNotRecognizedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * analyze XML document using StAX-parser
	 */
	public void makeStAX() {
		System.out.println("=====================================================================");
		try(FileInputStream inFile= new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(inFile, "UTF-8");) {
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLStreamReader parser = factory.createXMLStreamReader(isr);
			while (parser.hasNext()) {
				int event = parser.next();
				if (event == XMLStreamConstants.START_ELEMENT){
					String id = parser.getAttributeValue(parser.getNamespaceURI(), "id");
					//String text = parser.getElementText();
					System.out.print(parser.getLocalName()+ " ");
					if (id != null) {
						System.out.print(id);
					}
					System.out.println();

				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * analyze XML document using DOM-parser
	 */
	public void makeDOM(){
		System.out.println("=====================================================================");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	    try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			File f = new File(fileName);
			Document doc = builder.parse(f);
			Element root = doc.getDocumentElement();
			System.out.println(root.getNodeName()+ ":");
			//first loop
			for (Node childNode = root.getFirstChild();
					childNode != null;
					childNode = childNode.getNextSibling()) {
						if (childNode instanceof Element) {
							System.out.println("  " + childNode.getNodeName() + " " + childNode.getAttributes().getNamedItem("id"));

							//second loop
							for (Node childTwoNode = childNode.getFirstChild();
									childTwoNode != null;
									childTwoNode = childTwoNode.getNextSibling()) {
										if (childTwoNode instanceof Element) {
											System.out.println("\t" + "--" + childTwoNode.getNodeName()
											+ ":"
											+ "\t" + childTwoNode.getTextContent().trim());
										}
							}
						}
			}


	    } catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//just for my purpose
	//TODO
	public void validateXML_BySchema(){
		File f = new File(fileNameLibrary);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		factory.setNamespaceAware(true);

		final String JAXP_SCHEMA_LANGUAGE =
	               "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
	    final String W3C_XML_SCHEMA = "http://www.w3.org/2001/XMLSchema";

	    factory.setAttribute(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);
	    try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(f);

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		MunuReaderBy_SAX_STAX_DOM or = new MunuReaderBy_SAX_STAX_DOM();
		or.makeDOM();
		or.makeStAX();
		or.makeSAX();
	}

}
