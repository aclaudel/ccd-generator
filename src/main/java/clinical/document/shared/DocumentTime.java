package clinical.document.shared;

import javax.xml.bind.annotation.XmlAttribute;
import java.time.LocalDate;

public class DocumentTime {
    @XmlAttribute
    public final String value;

    public DocumentTime(LocalDate date) {
        value = String.format("%02d%02d%02d", date.getYear(), date.getMonthValue(), date.getDayOfMonth());
    }
}
