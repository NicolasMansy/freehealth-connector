//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.11.10 à 11:53:46 AM CET 
//


package org.taktik.connector.business.domain.kmehr.v20150901.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CD-IMPLANTATION-DEVICEvalues.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-IMPLANTATION-DEVICEvalues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="spacer"/>
 *     &lt;enumeration value="hipprosthesis"/>
 *     &lt;enumeration value="kneeprosthesis"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-IMPLANTATION-DEVICEvalues")
@XmlEnum
public enum CDIMPLANTATIONDEVICEvalues {

    @XmlEnumValue("spacer")
    SPACER("spacer"),
    @XmlEnumValue("hipprosthesis")
    HIPPROSTHESIS("hipprosthesis"),
    @XmlEnumValue("kneeprosthesis")
    KNEEPROSTHESIS("kneeprosthesis");
    private final String value;

    CDIMPLANTATIONDEVICEvalues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CDIMPLANTATIONDEVICEvalues fromValue(String v) {
        for (CDIMPLANTATIONDEVICEvalues c: CDIMPLANTATIONDEVICEvalues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
