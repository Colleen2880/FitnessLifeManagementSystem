package com.bignerdranch.android.fitnesslifemanagementsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.bignerdranch.android.fitnesslifemanagementsystem.CustomerDbSchema.CustomerTable;


/**
 * Created by Colle on 4/29/2017.
 */

/*

public class CustomersLab {

    private static CustomersLab sCustomersLab;


    private Context context;
    private SQLiteDatabase database;

    ///////////////////////////////////////////////////////////////////////////////////
    public static CustomersLab get(Context context){
        if(sCustomersLab == null){
            sCustomersLab = new CustomersLab(context);
        }
        return sCustomersLab;
    }
    ///////////////////////////////////////////////////////////////////////////////////////

    private CustomersLab(Context context){
        context = context.getApplicationContext();
        database = new MyDBHandler(context).getWritableDatabase();


    }



    public void addCustomer(Customers customers){
        ContentValues values = getContentValues(customers);
        database.insert(CustomerDbSchema.CustomerTable.NAME, null, values);

    }

    public List<Customers> getCustomers(){

        List<Customers> customers = new ArrayList<>();

        CustomersCursorWrapper cursor = queryCustomers(null, null);

        try {
            cursor.moveToFirst();
            while(! cursor.isAfterLast()){
                customers.add(cursor.getCustomers());
                cursor.moveToNext();

            }

        } finally {
            cursor.close();
        }

        return customers;


    }

    public Customers getCustomers(UUID id){

        CustomersCursorWrapper cursor = queryCustomers(CustomerTable.Cols.UUID + " = ?",
                new String[] { id.toString()}
        );

        try{
            if(cursor.getCount() == 0){
                return null;
            }

            cursor.moveToFirst();
            return cursor.getCustomers();
        } finally {
            cursor.close();
        }


    }

    public void updateCustomers(Customers customers){
        String uuidString = customers.toString();

        ContentValues values = getContentValues(customers);

        database.update(CustomerTable.NAME, values, CustomerTable.Cols.UUID + " = ?",
        new String[] {uuidString});
    }

    private static ContentValues getContentValues(Customers customers){
        ContentValues values = new ContentValues();
        values.put(CustomerDbSchema.CustomerTable.Cols.UUID, customers.getID().toString();
        values.put(CustomerDbSchema.CustomerTable.Cols.CUSTOMERNAME, customers.getName().toString();


        return values;
    }

    private CustomersCursorWrapper queryCustomers(String whereClause, String[] whereArgs){
        Cursor cursor = database.query( CustomerTable.NAME, null,
                whereClause, whereArgs, null, null, null);

        return new CustomersCursorWrapper(cursor);

    }


}





    /*

    private static CustomersLab sCustomersLab;

    //private List<Customers> mCustomers;
    private Context mContext;
    private SQLiteDatabase mDatabase;


    private CustomersLab(Context context){
        mContext = context.getApplicationContext();
        mDatabase = new MyDBHandler(mContext).getWritableDatabase();

    }

    public void addCustomers(Customers c){
        ContentValues values = getContentValues(c);

    }

    public List<Customers> getCustomers(){
        return new ArrayList<>();
    }

    public Customers getCustomers(UUID id){
        return null;
    }

    private static ContentValues getContentValues(Customers customers){
        ContentValues values = new ContentValues();
        values.put(CustomerDbSchema.CustomerTable.Cols.ID, customers.get_id());
        values.put(CustomerDbSchema.CustomerTable.Cols.CUSTOMERNAME, customers.get_customername().toString());
        values.put(CustomerDbSchema.CustomerTable.Cols.CUSTOMERADDRESS, customers.get_customeraddress().toString());
        values.put(CustomerDbSchema.CustomerTable.Cols.CUSTOMEREMAIL, customers.get_customerphonenumber().toString());
        values.put(CustomerDbSchema.CustomerTable.Cols.CUSTOMERPHONE, customers.get_customerphonenumber().toString());

        return values;
    }
}
*/
