package by.andervyd.work_with_files.xml_file.dom;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomPrint {

    public static void printIndentation(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("   ");
        }
    }

    public static void print(Node node, int level) {
        if (level > 0) {
//            System.out.println("");
            printIndentation(level);
        }
        System.out.println(node.getNodeName() + ":");

        if (node.hasAttributes()) {
            NamedNodeMap attributes = node.getAttributes();

            if (attributes.getLength() > 0) {
                level++;

                for (int i = 0; i < attributes.getLength(); i++) {
                    Node attribute = attributes.item(i);
                    printIndentation(level);

                    String string = "." + attribute.getNodeName() + "=";
                    System.out.println(string + attribute.getNodeValue());
                }
                level--;
            }
        }

        String value = node.getNodeValue();
        value = (value == null ? "" : value.trim());

        if (value.length() > 0) {
            printIndentation(level);
            System.out.println(value);
        }

        if (node.hasChildNodes()) {
            level++;
            NodeList children = node.getChildNodes();

            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                print(child, level);
            }
        }
    }
}
