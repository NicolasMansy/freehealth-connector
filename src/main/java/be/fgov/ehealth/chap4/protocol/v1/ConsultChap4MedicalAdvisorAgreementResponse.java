package be.fgov.ehealth.chap4.protocol.v1;

import be.fgov.ehealth.commons.protocol.SoapConversationLogger;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.soap.SOAPMessage;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
   name = "ConsultChap4MedicalAdvisorAgreementResponseType"
)
@XmlRootElement(
   name = "ConsultChap4MedicalAdvisorAgreementResponse"
)
public class ConsultChap4MedicalAdvisorAgreementResponse extends AbstractChap4MedicalAdvisorAgreementResponseType implements Serializable, SoapConversationLogger {
   private static final long serialVersionUID = 1L;

   private SOAPMessage soapRequest;
   private SOAPMessage soapResponse;

   @Override
   public SOAPMessage getSoapRequest() {
      return soapRequest;
   }

   @Override
   public void setSoapRequest(SOAPMessage soapRequest) {
      this.soapRequest = soapRequest;
   }

   @Override
   public SOAPMessage getSoapResponse() {
      return soapResponse;
   }

   @Override
   public void setSoapResponse(SOAPMessage soapResponse) {
      this.soapResponse = soapResponse;
   }
}
