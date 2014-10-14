
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Searchpersons_QNAME = new QName("http://ws/", "searchpersons");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _SearchpersonsResponse_QNAME = new QName("http://ws/", "searchpersonsResponse");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SearchpersonsResponse }
     * 
     */
    public SearchpersonsResponse createSearchpersonsResponse() {
        return new SearchpersonsResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Searchpersons }
     * 
     */
    public Searchpersons createSearchpersons() {
        return new Searchpersons();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Searchpersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "searchpersons")
    public JAXBElement<Searchpersons> createSearchpersons(Searchpersons value) {
        return new JAXBElement<Searchpersons>(_Searchpersons_QNAME, Searchpersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchpersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "searchpersonsResponse")
    public JAXBElement<SearchpersonsResponse> createSearchpersonsResponse(SearchpersonsResponse value) {
        return new JAXBElement<SearchpersonsResponse>(_SearchpersonsResponse_QNAME, SearchpersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
