package ccd.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ClinicalDocument")
public class CCD {

    @XmlElement
    public final String hello = "world";

}
