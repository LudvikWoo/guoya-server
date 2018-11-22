/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.bean.api.test.addCustomer.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Customer implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _customerId;

    private java.lang.String _customerName;

    private java.lang.String _cstType;

    private java.lang.String _headPortrait;

    private java.lang.String _cert;

    private java.lang.String _addr;

    private ContactInfo _contactInfo;


      //----------------/
     //- Constructors -/
    //----------------/

    public Customer() {
        super();
    } //-- com.guoyasoft.bean.api.test.addCustomer.request.Customer()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'addr'.
     * 
     * @return the value of field 'addr'.
    **/
    public java.lang.String getAddr()
    {
        return this._addr;
    } //-- java.lang.String getAddr() 

    /**
     * Returns the value of field 'cert'.
     * 
     * @return the value of field 'cert'.
    **/
    public java.lang.String getCert()
    {
        return this._cert;
    } //-- java.lang.String getCert() 

    /**
     * Returns the value of field 'contactInfo'.
     * 
     * @return the value of field 'contactInfo'.
    **/
    public ContactInfo getContactInfo()
    {
        return this._contactInfo;
    } //-- ContactInfo getContactInfo() 

    /**
     * Returns the value of field 'cstType'.
     * 
     * @return the value of field 'cstType'.
    **/
    public java.lang.String getCstType()
    {
        return this._cstType;
    } //-- java.lang.String getCstType() 

    /**
     * Returns the value of field 'customerId'.
     * 
     * @return the value of field 'customerId'.
    **/
    public java.lang.String getCustomerId()
    {
        return this._customerId;
    } //-- java.lang.String getCustomerId() 

    /**
     * Returns the value of field 'customerName'.
     * 
     * @return the value of field 'customerName'.
    **/
    public java.lang.String getCustomerName()
    {
        return this._customerName;
    } //-- java.lang.String getCustomerName() 

    /**
     * Returns the value of field 'headPortrait'.
     * 
     * @return the value of field 'headPortrait'.
    **/
    public java.lang.String getHeadPortrait()
    {
        return this._headPortrait;
    } //-- java.lang.String getHeadPortrait() 

    /**
    **/
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * 
     * 
     * @param out
    **/
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * 
     * 
     * @param handler
    **/
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'addr'.
     * 
     * @param addr the value of field 'addr'.
    **/
    public void setAddr(java.lang.String addr)
    {
        this._addr = addr;
    } //-- void setAddr(java.lang.String) 

    /**
     * Sets the value of field 'cert'.
     * 
     * @param cert the value of field 'cert'.
    **/
    public void setCert(java.lang.String cert)
    {
        this._cert = cert;
    } //-- void setCert(java.lang.String) 

    /**
     * Sets the value of field 'contactInfo'.
     * 
     * @param contactInfo the value of field 'contactInfo'.
    **/
    public void setContactInfo(ContactInfo contactInfo)
    {
        this._contactInfo = contactInfo;
    } //-- void setContactInfo(ContactInfo) 

    /**
     * Sets the value of field 'cstType'.
     * 
     * @param cstType the value of field 'cstType'.
    **/
    public void setCstType(java.lang.String cstType)
    {
        this._cstType = cstType;
    } //-- void setCstType(java.lang.String) 

    /**
     * Sets the value of field 'customerId'.
     * 
     * @param customerId the value of field 'customerId'.
    **/
    public void setCustomerId(java.lang.String customerId)
    {
        this._customerId = customerId;
    } //-- void setCustomerId(java.lang.String) 

    /**
     * Sets the value of field 'customerName'.
     * 
     * @param customerName the value of field 'customerName'.
    **/
    public void setCustomerName(java.lang.String customerName)
    {
        this._customerName = customerName;
    } //-- void setCustomerName(java.lang.String) 

    /**
     * Sets the value of field 'headPortrait'.
     * 
     * @param headPortrait the value of field 'headPortrait'.
    **/
    public void setHeadPortrait(java.lang.String headPortrait)
    {
        this._headPortrait = headPortrait;
    } //-- void setHeadPortrait(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.api.test.addCustomer.request.Customer unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.test.addCustomer.request.Customer) Unmarshaller.unmarshal(com.guoyasoft.bean.api.test.addCustomer.request.Customer.class, reader);
    } //-- com.guoyasoft.bean.api.test.addCustomer.request.Customer unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
