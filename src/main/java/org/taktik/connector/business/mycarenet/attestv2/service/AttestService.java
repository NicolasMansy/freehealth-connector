package org.taktik.connector.business.mycarenet.attestv2.service;

import org.taktik.connector.technical.exception.TechnicalConnectorException;
import org.taktik.connector.technical.service.sts.security.SAMLToken;
import be.fgov.ehealth.mycarenet.attest.protocol.v2.CancelAttestationResponse;
import be.fgov.ehealth.mycarenet.attest.protocol.v2.SendAttestationResponse;
import be.fgov.ehealth.mycarenet.commons.protocol.v3.SendRequestType;

public interface AttestService {
   SendAttestationResponse sendAttestion(SAMLToken var1, SendRequestType var2) throws TechnicalConnectorException;

   CancelAttestationResponse cancelAttestion(SAMLToken var1, SendRequestType var2) throws TechnicalConnectorException;
}
