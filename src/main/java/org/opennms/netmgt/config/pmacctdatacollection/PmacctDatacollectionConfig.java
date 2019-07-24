package org.opennms.netmgt.config.pmacctdatacollection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.opennms.core.xml.ValidateUsing;
import org.opennms.netmgt.config.utils.ConfigUtils;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlns.opennms.org/xsd/config/pmacct-datacollection}pmacct-collection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="rrdRepository" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "m_pmacctCollection"
})
@XmlRootElement(name = "pmacct-datacollection-config")
@ValidateUsing("pmacct-datacollection-config.xsd")
public class PmacctDatacollectionConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "http-collection")
    protected List<PmacctCollection> m_pmacctCollection = new ArrayList<>();
    @XmlAttribute(name = "rrdRepository", required = true)
    protected String m_rrdRepository;

    /**
     * Gets the value of the httpCollection property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmacctCollection property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmacctCollection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmacctCollection }
     *
     *
     */
    public List<PmacctCollection> getPmacctCollection() {
        return m_pmacctCollection;
    }

    public String getRrdRepository() {
        return m_rrdRepository;
    }

    void setRrdRepository(final String value) {
        m_rrdRepository = ConfigUtils.assertNotEmpty(value, "value");
    }

    @Override
    public boolean equals(final Object other) {
        if (!(other instanceof PmacctDatacollectionConfig)) {
            return false;
        }
        final PmacctDatacollectionConfig that = (PmacctDatacollectionConfig) other;
        return Objects.equals(this.m_pmacctCollection, that.m_pmacctCollection)
                && Objects.equals(this.m_rrdRepository, that.m_rrdRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(m_pmacctCollection, m_rrdRepository);
    }

}

