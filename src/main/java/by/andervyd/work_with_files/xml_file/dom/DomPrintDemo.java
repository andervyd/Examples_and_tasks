package by.andervyd.work_with_files.xml_file.dom;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DomPrintDemo {
    public static void main(String[] args) {

        File file = new File
                ("src/main/java/by/andervyd/work_with_files/xml_file/temp/catalog.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(file);
            DomPrint.print(document, 0);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
