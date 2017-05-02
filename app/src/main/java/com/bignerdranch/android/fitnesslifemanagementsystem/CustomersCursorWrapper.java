package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.UUID;
/*
/**
 * Created by Colle on 4/30/2017.
 */
/*
public class CustomersCursorWrapper extends CursorWrapper {

    public CustomersCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Customers getCustomers(){
        String uuidString = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.UUID));
        String customername = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.CUSTOMERNAME));
        String customeraddress = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.CUSTOMERADDRESS));
        String customerphone = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.CUSTOMERPHONE));
        String customeremail = getString(getColumnIndex(CustomerDbSchema.CustomerTable.Cols.CUSTOMEREMAIL));


        Customers customers = new Customers(UUID.fromString(uuidString));
        customers.set_customername(customername);
        customers.set_customeraddress(customeraddress);
        customers.set_customerphonenumber(customerphone);
        customers.set_customeremail(customeremail);

        return customers;
    }


}
*/