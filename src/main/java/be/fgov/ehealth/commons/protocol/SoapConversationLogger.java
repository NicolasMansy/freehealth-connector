package be.fgov.ehealth.commons.protocol;

import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public interface SoapConversationLogger {
	SOAPMessage getSoapRequest();
	void setSoapRequest(SOAPMessage soapRequest);
	SOAPMessage getSoapResponse();
	void setSoapResponse(SOAPMessage soapResponse);
}
