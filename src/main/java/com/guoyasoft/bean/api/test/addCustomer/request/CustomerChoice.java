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
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.*;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * 
 * 
 * @version $Revision$ $Date$
**/
public class CustomerChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.util.Vector _addrList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CustomerChoice() {
        super();
        _addrList = new Vector();
    } //-- com.guoyasoft.bean.api.test.addCustomer.request.CustomerChoice()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAddr
    **/
    public void addAddr(java.lang.String vAddr)
        throws java.lang.IndexOutOfBoundsException
    {
        _addrList.addElement(vAddr);
    } //-- void addAddr(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vAddr
    **/
    public void addAddr(int index, java.lang.String vAddr)
        throws java.lang.IndexOutOfBoundsException
    {
        _addrList.insertElementAt(vAddr, index);
    } //-- void addAddr(int, java.lang.String) 

    /**
    **/
    public java.util.Enumeration enumerateAddr()
    {
        return _addrList.elements();
    } //-- java.util.Enumeration enumerateAddr() 

    /**
     * 
     * 
     * @param index
    **/
    public java.lang.String getAddr(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _addrList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (String)_addrList.elementAt(index);
    } //-- java.lang.String getAddr(int) 

    /**
    **/
    public java.lang.String[] getAddr()
    {
        int size = _addrList.size();
        java.lang.String[] mArray = new java.lang.String[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (String)_addrList.elementAt(index);
        }
        return mArray;
    } //-- java.lang.String[] getAddr() 

    /**
    **/
    public int getAddrCount()
    {
        return _addrList.size();
    } //-- int getAddrCount() 

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
     * 
     * 
     * @param index
    **/
    public java.lang.String removeAddr(int index)
    {
        java.lang.Object obj = _addrList.elementAt(index);
        _addrList.removeElementAt(index);
        return (String)obj;
    } //-- java.lang.String removeAddr(int) 

    /**
    **/
    public void removeAllAddr()
    {
        _addrList.removeAllElements();
    } //-- void removeAllAddr() 

    /**
     * 
     * 
     * @param index
     * @param vAddr
    **/
    public void setAddr(int index, java.lang.String vAddr)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _addrList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _addrList.setElementAt(vAddr, index);
    } //-- void setAddr(int, java.lang.String) 

    /**
     * 
     * 
     * @param addrArray
    **/
    public void setAddr(java.lang.String[] addrArray)
    {
        //-- copy array
        _addrList.removeAllElements();
        for (int i = 0; i < addrArray.length; i++) {
            _addrList.addElement(addrArray[i]);
        }
    } //-- void setAddr(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.api.test.addCustomer.request.CustomerChoice unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.test.addCustomer.request.CustomerChoice) Unmarshaller.unmarshal(com.guoyasoft.bean.api.test.addCustomer.request.CustomerChoice.class, reader);
    } //-- com.guoyasoft.bean.api.test.addCustomer.request.CustomerChoice unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
