package com.icicibank.apimgmt.model;

public class RequestModel
{
    private Validate validate;

    public Validate getValidate ()
    {
        return validate;
    }

    public void setValidate (Validate validate)
    {
        this.validate = validate;
    }

    @Override
    public String toString()
    {
        return "RequestModel [validate = "+validate+"]";
    }
}
	
