/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.bean.api.test.updateCustomer.request;

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
public class Request implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _operateType;

    private Customer _customer;


      //----------------/
     //- Constructors -/
    //----------------/

    public Request() {
        super();
    } //-- com.guoyasoft.bean.api.test.updateCustomer.request.Request()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'customer'.
     * 
     * @return the value of field 'customer'.
    **/
    public Customer getCustomer()
    {
        return this._customer;
    } //-- Customer getCustomer() 

    /**
     * Returns the value of field 'operateType'.
     * 
     * @return the value of field 'operateType'.
    **/
    public java.lang.String getOperateType()
    {
        return this._operateType;
    } //-- java.lang.String getOperateType() 

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
     * Sets the value of field 'customer'.
     * 
     * @param customer the value of field 'customer'.
    **/
    public void setCustomer(Customer customer)
    {
        this._customer = customer;
    } //-- void setCustomer(Customer) 

    /**
     * Sets the value of field 'operateType'.
     * 
     * @param operateType the value of field 'operateType'.
    **/
    public void setOperateType(java.lang.String operateType)
    {
        this._operateType = operateType;
    } //-- void setOperateType(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.api.test.updateCustomer.request.Request unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.test.updateCustomer.request.Request) Unmarshaller.unmarshal(com.guoyasoft.bean.api.test.updateCustomer.request.Request.class, reader);
    } //-- com.guoyasoft.bean.api.test.updateCustomer.request.Request unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
