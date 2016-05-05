/**
 *
 */
package _java._se._09_XML._task02;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * @author Lartsev
 *
 */
public class MunuReaderBy_SAX_STAX_DOM {

	public void makeSAX() {}

	public void makeSTaX() {}
	/**
	 *
	 */
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


}
