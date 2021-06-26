package com.appointment;
import java.io.Serializable;

public class Passer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String _name;			
	String _address;		
	String _phone;			
	String _email;			

	public void setName(String name)
	{
		_name = name;
	}
	public String Name()
	{
		return _name;
	}
	

	public void setPhone(String phone)
	{
	
		_phone = phone;
	}
	public String Phone()
	{

		return _phone;
	}
	public void setEmail(String email)
	{

		_email = email;
	}
	public String Email()
	{

		return _email;
	}
public void setDocName(String docName)
	{
		_docname = Docname;
	}
	public String docName()
	{
		return _docname;
	}
	
	public void docSpe(String docSpe)
	{
		_docspe = docspe;
	}
	public String Name()
	{
		return _docSpe;
	}

	public void setaddress(String address)
	{
		_add = add;
	}
	public String setaddress()
	{
		return _add;
	}
	
	
}