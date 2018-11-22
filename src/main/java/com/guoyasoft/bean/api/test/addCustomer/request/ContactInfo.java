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
public class ContactInfo implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    private java.lang.String _phone;

    private java.lang.String _weichat;

    private java.lang.String _qq;

    private java.lang.String _email;

    private java.util.Vector _spareContactList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ContactInfo() {
        super();
        _spareContactList = new Vector();
    } //-- com.guoyasoft.bean.api.test.addCustomer.request.ContactInfo()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vSpareContact
    **/
    public void addSpareContact(SpareContact vSpareContact)
        throws java.lang.IndexOutOfBoundsException
    {
        _spareContactList.addElement(vSpareContact);
    } //-- void addSpareContact(SpareContact) 

    /**
     * 
     * 
     * @param index
     * @param vSpareContact
    **/
    public void addSpareContact(int index, SpareContact vSpareContact)
        throws java.lang.IndexOutOfBoundsException
    {
        _spareContactList.insertElementAt(vSpareContact, index);
    } //-- void addSpareContact(int, SpareContact) 

    /**
    **/
    public java.util.Enumeration enumerateSpareContact()
    {
        return _spareContactList.elements();
    } //-- java.util.Enumeration enumerateSpareContact() 

    /**
     * Returns the value of field 'email'.
     * 
     * @return the value of field 'email'.
    **/
    public java.lang.String getEmail()
    {
        return this._email;
    } //-- java.lang.String getEmail() 

    /**
     * Returns the value of field 'phone'.
     * 
     * @return the value of field 'phone'.
    **/
    public java.lang.String getPhone()
    {
        return this._phone;
    } //-- java.lang.String getPhone() 

    /**
     * Returns the value of field 'qq'.
     * 
     * @return the value of field 'qq'.
    **/
    public java.lang.String getQq()
    {
        return this._qq;
    } //-- java.lang.String getQq() 

    /**
     * 
     * 
     * @param index
    **/
    public SpareContact getSpareContact(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _spareContactList.size())) {
            throw new IndexOutOfBoundsException();
        }
        
        return (SpareContact) _spareContactList.elementAt(index);
    } //-- SpareContact getSpareContact(int) 

    /**
    **/
    public SpareContact[] getSpareContact()
    {
        int size = _spareContactList.size();
        SpareContact[] mArray = new SpareContact[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (SpareContact) _spareContactList.elementAt(index);
        }
        return mArray;
    } //-- SpareContact[] getSpareContact() 

    /**
    **/
    public int getSpareContactCount()
    {
        return _spareContactList.size();
    } //-- int getSpareContactCount() 

    /**
     * Returns the value of field 'weichat'.
     * 
     * @return the value of field 'weichat'.
    **/
    public java.lang.String getWeichat()
    {
        return this._weichat;
    } //-- java.lang.String getWeichat() 

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
    **/
    public void removeAllSpareContact()
    {
        _spareContactList.removeAllElements();
    } //-- void removeAllSpareContact() 

    /**
     * 
     * 
     * @param index
    **/
    public SpareContact removeSpareContact(int index)
    {
        java.lang.Object obj = _spareContactList.elementAt(index);
        _spareContactList.removeElementAt(index);
        return (SpareContact) obj;
    } //-- SpareContact removeSpareContact(int) 

    /**
     * Sets the value of field 'email'.
     * 
     * @param email the value of field 'email'.
    **/
    public void setEmail(java.lang.String email)
    {
        this._email = email;
    } //-- void setEmail(java.lang.String) 

    /**
     * Sets the value of field 'phone'.
     * 
     * @param phone the value of field 'phone'.
    **/
    public void setPhone(java.lang.String phone)
    {
        this._phone = phone;
    } //-- void setPhone(java.lang.String) 

    /**
     * Sets the value of field 'qq'.
     * 
     * @param qq the value of field 'qq'.
    **/
    public void setQq(java.lang.String qq)
    {
        this._qq = qq;
    } //-- void setQq(java.lang.String) 

    /**
     * 
     * 
     * @param index
     * @param vSpareContact
    **/
    public void setSpareContact(int index, SpareContact vSpareContact)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index > _spareContactList.size())) {
            throw new IndexOutOfBoundsException();
        }
        _spareContactList.setElementAt(vSpareContact, index);
    } //-- void setSpareContact(int, SpareContact) 

    /**
     * 
     * 
     * @param spareContactArray
    **/
    public void setSpareContact(SpareContact[] spareContactArray)
    {
        //-- copy array
        _spareContactList.removeAllElements();
        for (int i = 0; i < spareContactArray.length; i++) {
            _spareContactList.addElement(spareContactArray[i]);
        }
    } //-- void setSpareContact(SpareContact) 

    /**
     * Sets the value of field 'weichat'.
     * 
     * @param weichat the value of field 'weichat'.
    **/
    public void setWeichat(java.lang.String weichat)
    {
        this._weichat = weichat;
    } //-- void setWeichat(java.lang.String) 

    /**
     * 
     * 
     * @param reader
    **/
    public static com.guoyasoft.bean.api.test.addCustomer.request.ContactInfo unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (com.guoyasoft.bean.api.test.addCustomer.request.ContactInfo) Unmarshaller.unmarshal(com.guoyasoft.bean.api.test.addCustomer.request.ContactInfo.class, reader);
    } //-- com.guoyasoft.bean.api.test.addCustomer.request.ContactInfo unmarshal(java.io.Reader) 

    /**
    **/
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
