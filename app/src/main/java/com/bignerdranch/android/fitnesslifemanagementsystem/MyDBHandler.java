package com.bignerdranch.android.fitnesslifemanagementsystem;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.bignerdranch.android.fitnesslifemanagementsystem.CustomerDbSchema.CustomerTable;


public class MyDBHandler extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "customers.db";
    private static final String TABLE_CUSTOMER = "people";


    public MyDBHandler(Context context) {
        super(context, DATABASE_NAME, null, VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table " + CustomerTable.NAME + "(" +
                " _id INTEGER PRIMARY KEY AUTOINCREMENT " + CustomerTable.Cols.CUSTOMERNAME + " text not null " +
                CustomerTable.Cols.CUSTOMERADDRESS + " text not null " + CustomerTable.Cols.CUSTOMEREMAIL + " text not null " +
                CustomerTable.Cols.CUSTOMERPHONE + " text not null " + ");");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }




}

/*

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "customers.db";
    //public static final String TABLE_CUSTOMERS = "customers";


    public MyDBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + CustomerTable.NAME + "(" +
                " _id INTEGER PRIMARY KEY AUTOINCREMENT " + CustomerTable.Cols.CUSTOMERNAME + " text not null " +
                CustomerTable.Cols.CUSTOMERADDRESS + " text not null " + CustomerTable.Cols.CUSTOMEREMAIL + " text not null " +
                CustomerTable.Cols.CUSTOMERPHONE + " text not null " + ");");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + CustomerTable.NAME);
        //onCreate(db);
    }

    public boolean insertData(String customername, String customeraddress, String customeremail, String customerphonenumber) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CustomerTable.Cols.CUSTOMERNAME, customername);
        values.put(CustomerTable.Cols.CUSTOMERADDRESS, customeraddress);
        values.put(CustomerTable.Cols.CUSTOMEREMAIL, customeremail);
        values.put(CustomerTable.Cols.CUSTOMERPHONE, customerphonenumber);

        long results = db.insert(CustomerTable.NAME, null, values);
        if (results == -1) {
            return false;
        } else {
            return true;
        }

    }

/*
    public void addCustomer(Customers c){
        ContentValues values = new ContentValues();

        values.put(COLUMN_CUSTOMERNAME, c.get_customername());
        values.put(COLUMN_CUSTOMERADDRESS, c.get_customeraddress());
        values.put(COLUMN_CUSTOMEREMAIL, c.get_customeremail());
        values.put(COLUMN_CUSTOMERPHONENUMBER, c.get_customerphonenumber());
        values.put(COLUMN_SESSIONDATE, c.get_sessiondate());
        values.put(COLUMN_SESSIONDETAILS, c.get_sessiondetails());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_CUSTOMERS, null, values);
        db.close();

    }
    */
/*
    public String dbToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + CustomerTable.NAME + " WHERE 1";

        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            if(cursor.getString(cursor.getColumnIndex("customername"))!=null){
                dbString += cursor.getString(cursor.getColumnIndex("customername"));
                dbString += "\n";
            }
        }
        db.close();
        return dbString;
    }



}

*/