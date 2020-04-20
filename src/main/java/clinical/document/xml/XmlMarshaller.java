package clinical.document.xml;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlMarshaller {

  public <T> String marshall(T content) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(content.getClass());
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    marshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
    final StringWriter writer = new StringWriter();
    marshaller.marshal(content, writer);
    return writer.getBuffer().toString();
  }

  public <T> String marshallFragment(T content, Class<T> tClass, String name) throws JAXBException{
    JAXBContext context = JAXBContext.newInstance(content.getClass());
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
    JAXBElement<T> jaxbElement =
            new JAXBElement<>( new QName("", name),
                    tClass,
                    content);
    final StringWriter writer = new StringWriter();
    marshaller.marshal(jaxbElement, writer);
    return writer.getBuffer().toString();
  }


  public <T> T unmarshal(String xml, Class<T> targetClass) throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(targetClass);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    Object unmarshalled = unmarshaller.unmarshal(new StringReader(xml));
    return targetClass.cast(unmarshalled);
  }
}
