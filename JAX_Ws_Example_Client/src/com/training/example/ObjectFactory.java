
package com.training.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.training.example package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetRating_QNAME = new QName("http://ifaces.training.com/", "getRating");
    private final static QName _GetRatingResponse_QNAME = new QName("http://ifaces.training.com/", "getRatingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.training.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRatingResponse }
     * 
     */
    public GetRatingResponse createGetRatingResponse() {
        return new GetRatingResponse();
    }

    /**
     * Create an instance of {@link GetRating }
     * 
     */
    public GetRating createGetRating() {
        return new GetRating();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "getRating")
    public JAXBElement<GetRating> createGetRating(GetRating value) {
        return new JAXBElement<GetRating>(_GetRating_QNAME, GetRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "getRatingResponse")
    public JAXBElement<GetRatingResponse> createGetRatingResponse(GetRatingResponse value) {
        return new JAXBElement<GetRatingResponse>(_GetRatingResponse_QNAME, GetRatingResponse.class, null, value);
    }

}
