package com.icicibank.apimgmt.model;

public class Validate
{
    private String transfer_unique_no;

    private String rmtr_account_no;

    private String transfer_ccy;

    private String bene_account_no;

    private String bene_account_ifsc;

    private String bene_full_name;

    private String rmtr_address;

    private String rmtr_to_bene_note;

    private String van_account ;

    private String transfer_amt;

    private String Signature;

    private String transfer_timestamp;

    private String rmtr_full_name;

    private String transfer_type;

    private String customer_code;

    private String rmtr_account_ifsc;

    public String getTransfer_unique_no ()
    {
        return transfer_unique_no;
    }

    public void setTransfer_unique_no (String transfer_unique_no)
    {
        this.transfer_unique_no = transfer_unique_no;
    }

    public String getRmtr_account_no ()
    {
        return rmtr_account_no;
    }

    public void setRmtr_account_no (String rmtr_account_no)
    {
        this.rmtr_account_no = rmtr_account_no;
    }

    public String getTransfer_ccy ()
    {
        return transfer_ccy;
    }

    public void setTransfer_ccy (String transfer_ccy)
    {
        this.transfer_ccy = transfer_ccy;
    }

    public String getBene_account_no ()
    {
        return bene_account_no;
    }

    public void setBene_account_no (String bene_account_no)
    {
        this.bene_account_no = bene_account_no;
    }

    public String getBene_account_ifsc ()
    {
        return bene_account_ifsc;
    }

    public void setBene_account_ifsc (String bene_account_ifsc)
    {
        this.bene_account_ifsc = bene_account_ifsc;
    }

    public String getBene_full_name ()
    {
        return bene_full_name;
    }

    public void setBene_full_name (String bene_full_name)
    {
        this.bene_full_name = bene_full_name;
    }

    public String getRmtr_address ()
    {
        return rmtr_address;
    }

    public void setRmtr_address (String rmtr_address)
    {
        this.rmtr_address = rmtr_address;
    }

    public String getRmtr_to_bene_note ()
    {
        return rmtr_to_bene_note;
    }

    public void setRmtr_to_bene_note (String rmtr_to_bene_note)
    {
        this.rmtr_to_bene_note = rmtr_to_bene_note;
    }

    public String getVan_account  ()
    {
        return van_account ;
    }

    public void setVan_account  (String van_account )
    {
        this.van_account  = van_account ;
    }

    public String getTransfer_amt ()
    {
        return transfer_amt;
    }

    public void setTransfer_amt (String transfer_amt)
    {
        this.transfer_amt = transfer_amt;
    }

    public String getSignature ()
    {
        return Signature;
    }

    public void setSignature (String Signature)
    {
        this.Signature = Signature;
    }

    public String getTransfer_timestamp ()
    {
        return transfer_timestamp;
    }

    public void setTransfer_timestamp (String transfer_timestamp)
    {
        this.transfer_timestamp = transfer_timestamp;
    }

    public String getRmtr_full_name ()
    {
        return rmtr_full_name;
    }

    public void setRmtr_full_name (String rmtr_full_name)
    {
        this.rmtr_full_name = rmtr_full_name;
    }

    public String getTransfer_type ()
    {
        return transfer_type;
    }

    public void setTransfer_type (String transfer_type)
    {
        this.transfer_type = transfer_type;
    }

    public String getCustomer_code ()
    {
        return customer_code;
    }

    public void setCustomer_code (String customer_code)
    {
        this.customer_code = customer_code;
    }

    public String getRmtr_account_ifsc ()
    {
        return rmtr_account_ifsc;
    }

    public void setRmtr_account_ifsc (String rmtr_account_ifsc)
    {
        this.rmtr_account_ifsc = rmtr_account_ifsc;
    }

    @Override
    public String toString()
    {
        return "Validate [transfer_unique_no = "+transfer_unique_no+", rmtr_account_no = "+rmtr_account_no+", transfer_ccy = "+transfer_ccy+", bene_account_no = "+bene_account_no+", bene_account_ifsc = "+bene_account_ifsc+", bene_full_name = "+bene_full_name+", rmtr_address = "+rmtr_address+", rmtr_to_bene_note = "+rmtr_to_bene_note+", van_account  = "+van_account +", transfer_amt = "+transfer_amt+", Signature = "+Signature+", transfer_timestamp = "+transfer_timestamp+", rmtr_full_name = "+rmtr_full_name+", transfer_type = "+transfer_type+", customer_code = "+customer_code+", rmtr_account_ifsc = "+rmtr_account_ifsc+"]";
    }
}
