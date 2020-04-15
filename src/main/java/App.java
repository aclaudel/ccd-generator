import ccd.CCDGenerator;
import xml.XmlMarshaller;

import javax.xml.bind.JAXBException;

public class App {

    public static void main(String[] args) throws JAXBException {
        XmlMarshaller xmlMarshaller = new XmlMarshaller();
        CCDGenerator ccdGenerator = new CCDGenerator();
        String ccd = xmlMarshaller.marshall(ccdGenerator.getCcd());
        System.out.println(ccd);
    }

}
