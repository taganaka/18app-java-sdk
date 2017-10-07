
package it.mibact.bonus.verificavoucher;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.soap.SOAPFaultException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VerificaVoucher", targetNamespace = "http://bonus.mibact.it/VerificaVoucher/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VerificaVoucher {


    /**
     * 
     * @param parameters
     * @return
     *     returns it.mibact.bonus.verificavoucher.CheckResponseObj
     */
    @WebMethod(operationName = "Check", action = "http://bonus.mibact.it/VerificaVoucher/Check")
    @WebResult(name = "CheckResponseObj", targetNamespace = "http://bonus.mibact.it/VerificaVoucher/", partName = "parameters")
    public CheckResponseObj check(
            @WebParam(name = "CheckRequestObj", targetNamespace = "http://bonus.mibact.it/VerificaVoucher/", partName = "parameters")
                    CheckRequestObj parameters) throws SOAPFaultException;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.mibact.bonus.verificavoucher.ConfirmResponseObj
     */
    @WebMethod(operationName = "Confirm", action = "http://bonus.mibact.it/VerificaVoucher/Confirm")
    @WebResult(name = "ConfirmResponseObj", targetNamespace = "http://bonus.mibact.it/VerificaVoucher/", partName = "parameters")
    public ConfirmResponseObj confirm(
            @WebParam(name = "ConfirmRequestObj", targetNamespace = "http://bonus.mibact.it/VerificaVoucher/", partName = "parameters")
                    ConfirmRequestObj parameters) throws SOAPFaultException;

}
