package by.andervyd.work_with_files.xml_file.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxPrint extends DefaultHandler {

    @Override
    public void startDocument()
            throws SAXException {
        System.out.println("Start document");
    }

    @Override
    public void endDocument()
            throws SAXException {
        System.out.println("End document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        System.out.println("");
        System.out.println("  Start  " + qName);

        if (attributes.getLength() > 0) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.println("   ." + attributes.getQName(i) + "=" + attributes.getValue(i));
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        System.out.println("  End  " + qName);
    }

    @Override
    public void characters(char[] data, int start, int length)
            throws SAXException {
        StringBuffer buffer = new StringBuffer(length);
        buffer.append(data, start, length);

        if (buffer.toString().trim().length() > 0) {
            System.out.println(" " + buffer);
        }
    }
}