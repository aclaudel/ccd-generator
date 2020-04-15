package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;

public class TemplateId {

  @XmlAttribute
  public final String root;
  @XmlAttribute
  public final String extension;

  public TemplateId(String root, String extension) {
    this.root = root;
    this.extension = extension;
  }

  public TemplateId(String root) {
    this(root, null);
  }
}
