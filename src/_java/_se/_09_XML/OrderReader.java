/**
 *
 */
package _java._se._09_XML;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 * @author Lartsev
 *
 *This example from book
 *Core Java, Volume II--Advanced Features (9th Edition) (Core Series)
 *Paperback – March 6, 2013
 *by Cay S. Horstmann
 */
public class OrderReader {

	public void makeDOM(){
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    String fileName = "src/_java/_se/_09_XML/PurchaseOrder.xml";

	    try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			File f = new File(fileName);
			Document doc = builder.parse(f);
			Element root = doc.getDocumentElement();

			for (Node childNode = root.getFirstChild();
					childNode != null;
					childNode = childNode.getNextSibling()) {
						if (childNode instanceof Element) {
							System.out.println("childNode" + "\t" + childNode.getNodeName()
							+ "\t" + childNode.getNodeType());
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OrderReader or = new OrderReader();
		or.makeDOM();
	}

}
