package be.fgov.ehealth.recipe.protocol.v4;

import be.fgov.ehealth.recipe.core.v4.SecuredContentType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "ListNotificationsRequestType",
   propOrder = {"securedListNotificationsRequest"}
)
@XmlRootElement(
   name = "ListNotificationsRequest"
)
public class ListNotificationsRequest extends RequestType {
   @XmlElement(
      name = "SecuredListNotificationsRequest",
      required = true
   )
   protected SecuredContentType securedListNotificationsRequest;

   public SecuredContentType getSecuredListNotificationsRequest() {
      return this.securedListNotificationsRequest;
   }

   public void setSecuredListNotificationsRequest(SecuredContentType value) {
      this.securedListNotificationsRequest = value;
   }
}
