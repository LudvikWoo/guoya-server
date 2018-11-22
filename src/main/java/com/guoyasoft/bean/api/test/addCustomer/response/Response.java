/*
 * This class was automatically generated with 
 * <a href="http://castor.exolab.org">Castor 0.9.4</a>, using an
 * XML Schema.
 * $Id$
 */

package com.guoyasoft.bean.api.test.addCustomer.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;

import org.exolab.castor.xml.*;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class Response implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _respCode;

    private java.lang.String _respDesc;

    private java.lang.String _customerId;


      //----------------/
     //- Constructors -/
    //----------------/

    public Response() {
        super();
    } //-- com.guoyasoft.bean.api.test.addCustomer.response.Response()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Returns the value of field 'respCode'.
     * 
     * @return the value of field 'respCode'.
    **/
    public java.lang.String getRespCode()
    {
        return this._respCode;
    } //-- java.lang.String getRespCode() 

    /**
     * Returns the value of field 'respDesc'.
     * 
     * @return the value of field 'respDesc'.
    **/
    public java.lang.String getRespDesc()
    {
        return this._respDesc;
    } //-- java.lang.String getRespDesc() 

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
     * Sets the value of field 'customerId'.
     * 
     * @param customerId the value of field 'customerId'.
    **/
    public void setCustomerId(java.lang.String customerId)
    {
        this._customerId = customerId;
    } //-- void setCustomerId(java.lang.String) 

    /**
     * Sets the value of field 'respCode'.
     * 
     * @param respCode the value of field 'respCode'.
    **/
    public void setRespCode(java.lang.String respCode)
    {
        this._respCode = respCode;
    } //-- void setRespCode(java.lang.String) 

    /**
     * Sets the value of field 'respDesc'.
     * 
     * @param respDesc the value of field 'respDesc'.
    **/
    public void setRespDesc(java.lang.String respDesc)
    {
        this._respDesc = respDesc;
    } //-- void setRespDesc(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.api.test.addCustomer.response.Response unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.test.addCustomer.response.Response) Unmarshaller.unmarshal(com.guoyasoft.bean.api.test.addCustomer.response.Response.class, reader);
    } //-- com.guoyasoft.bean.api.test.addCustomer.response.Response unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 
    public String toXMLString(){
 		try{
 	    	StringWriter out = new StringWriter();
 	    	this.marshal(out);
 			return out.toString(); 
 		}catch(Exception ex){
 			ex.printStackTrace();
 			return "";
 		}		
     } 
}
