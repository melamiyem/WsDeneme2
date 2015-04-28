
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * AlisWS v2.32
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AlisWS", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://78.187.210.116/AlisWS/AlisWS.asmx?WSDL")
public class AlisWS
    extends Service
{

    private final static URL ALİSWS_WSDL_LOCATION;
    private final static WebServiceException ALİSWS_EXCEPTION;
    private final static QName ALİSWS_QNAME = new QName("http://tempuri.org/", "AlisWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://78.187.210.116/AlisWS/AlisWS.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ALİSWS_WSDL_LOCATION = url;
        ALİSWS_EXCEPTION = e;
    }

    public AlisWS() {
        super(__getWsdlLocation(), ALİSWS_QNAME);
    }

    public AlisWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), ALİSWS_QNAME, features);
    }

    public AlisWS(URL wsdlLocation) {
        super(wsdlLocation, ALİSWS_QNAME);
    }

    public AlisWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ALİSWS_QNAME, features);
    }

    public AlisWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AlisWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AlisWSSoap
     */
    @WebEndpoint(name = "AlisWSSoap")
    public AlisWSSoap getAlisWSSoap() {
        return super.getPort(new QName("http://tempuri.org/", "AlisWSSoap"), AlisWSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlisWSSoap
     */
    @WebEndpoint(name = "AlisWSSoap")
    public AlisWSSoap getAlisWSSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "AlisWSSoap"), AlisWSSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns AlisWSSoap
     */
    @WebEndpoint(name = "AlisWSSoap12")
    public AlisWSSoap getAlisWSSoap12() {
        return super.getPort(new QName("http://tempuri.org/", "AlisWSSoap12"), AlisWSSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlisWSSoap
     */
    @WebEndpoint(name = "AlisWSSoap12")
    public AlisWSSoap getAlisWSSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "AlisWSSoap12"), AlisWSSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ALİSWS_EXCEPTION!= null) {
            throw ALİSWS_EXCEPTION;
        }
        return ALİSWS_WSDL_LOCATION;
    }

}
