//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.20 at 03:33:43 PM PDT 
//


package parsers.PMC;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}day"/>
 *         &lt;element ref="{}month"/>
 *         &lt;element ref="{}season"/>
 *         &lt;element ref="{}year"/>
 *         &lt;element ref="{}x"/>
 *       &lt;/choice>
 *       &lt;attribute name="iso-8601-date" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="calendar" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "conf-date")
public class ConfDate {

    @XmlElementRefs({
        @XmlElementRef(name = "day", type = Day.class, required = false),
        @XmlElementRef(name = "x", type = X.class, required = false),
        @XmlElementRef(name = "month", type = Month.class, required = false),
        @XmlElementRef(name = "year", type = Year.class, required = false),
        @XmlElementRef(name = "season", type = Season.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "iso-8601-date")
    @XmlSchemaType(name = "anySimpleType")
    protected String iso8601Date;
    @XmlAttribute(name = "calendar")
    @XmlSchemaType(name = "anySimpleType")
    protected String calendar;
    @XmlAttribute(name = "content-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String contentType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Month }
     * {@link Day }
     * {@link Year }
     * {@link X }
     * {@link String }
     * {@link Season }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the iso8601Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso8601Date() {
        return iso8601Date;
    }

    /**
     * Sets the value of the iso8601Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso8601Date(String value) {
        this.iso8601Date = value;
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendar(String value) {
        this.calendar = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
