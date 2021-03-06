package script;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class kuir {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws ParserConfigurationException, IOException, TransformerException, SAXException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		String command = args[0];
		String path = args[1];
		
		if(command.equals("-c")) {
			makeCollection collection = new makeCollection("./data");
			collection.makeXml();
		}
		else if(command.equals("-k")) {
			makeKeyword keyword = new makeKeyword("./collection.xml");
			keyword.convertXml();
		}
		else if(command.equals("-i")) {
			indexer index = new indexer("./index.xml");
			index.invertedXml();
		}
		
		
		
	}
	
}
	
	
