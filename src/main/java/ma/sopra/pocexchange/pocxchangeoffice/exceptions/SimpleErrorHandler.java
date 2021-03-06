package ma.sopra.pocexchange.pocxchangeoffice.exceptions;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SimpleErrorHandler implements ErrorHandler{

	@Override
	public void error(SAXParseException e) throws SAXException {
		System.out.println(e.getMessage());
		
	}

	@Override
	public void fatalError(SAXParseException e) throws SAXException {
		System.out.println(e.getMessage());
		
	}

	@Override
	public void warning(SAXParseException e) throws SAXException {
		System.out.println(e.getMessage());
		
	}

}
