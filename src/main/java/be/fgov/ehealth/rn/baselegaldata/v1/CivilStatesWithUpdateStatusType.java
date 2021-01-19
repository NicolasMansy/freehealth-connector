package be.fgov.ehealth.rn.baselegaldata.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "CivilStatesWithUpdateStatusType",
   propOrder = {"civilStates"}
)
public class CivilStatesWithUpdateStatusType implements Serializable {
   private static final long serialVersionUID = 1L;
   @XmlElement(
      name = "CivilState"
   )
   protected List civilStates;
   @XmlAttribute(
      name = "Status"
   )
   protected UpdateDatagroupStatusType status;

   public List getCivilStates() {
      if (this.civilStates == null) {
         this.civilStates = new ArrayList();
      }

      return this.civilStates;
   }

   public UpdateDatagroupStatusType getStatus() {
      return this.status;
   }

   public void setStatus(UpdateDatagroupStatusType value) {
      this.status = value;
   }
}
