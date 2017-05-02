package com.bignerdranch.android.fitnesslifemanagementsystem;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class SQLiteHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "SQLiteDatabase.db";
    public static final String TABLE_CUSTOMERS = "customer";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";

    public SQLiteHelper(Context context, Object o, Object o1, int i) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + DATABASE_NAME + " ( " + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_NAME + " VARCHAR);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CUSTOMERS);
        onCreate(db);
    }

    public void addCustomer(Customers customer) {

        SQLiteDatabase db = this.getWritableDatabase();
        //database = this.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, customer.getName());

        db.insert(TABLE_CUSTOMERS, null, values);
        db.close();
        //database.insert(TABLE_CUSTOMERS, null, values);
        //database.close();

    }

    /*
        public Customers getCustomer(int id){
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.query(TABLE_CUSTOMERS, new String[]{COLUMN_ID, COLUMN_NAME +"=?",new String[]{String.valueOf(id)}, null, null, null, null);
            if (cursor != null)
                cursor.moveToFirst();

            Customers customers = new Customers((cursor.getString(0)));

            return customers;
    });
        }
    */
    public List<Customers> getAllCustomers() {
        List<Customers> customerList = new ArrayList<Customers>();
        // Select All Query
        String selectQuery = "SELECT * FROM " + TABLE_CUSTOMERS;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);


        if (cursor.moveToFirst()) {
            do {
                Customers customers = new Customers();
                customers.setID(Integer.parseInt(cursor.getString(0)));
                customers.setName(cursor.getString(1));

                // Adding contact to list
                customerList.add(customers);
            } while (cursor.moveToNext());
        }


        return customerList;
    }




    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_CUSTOMERS + " WHERE 1";
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();


        while(!c.isAfterLast()){

            if(c.getString(c.getColumnIndex("name"))!= null){
                dbString += c.getString(c.getColumnIndex("name"));


                dbString += "\n";

            }
        }



        db.close();
        return dbString;

    }


            }

    /*
    private SQLiteDatabase database;

    public void insertRecord(Customers customers) {
        database = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_NAME, customers.getName());
        database.insert(TABLE_CUSTOMERS, null, contentValues);
        database.close();
    }

    public void updateRecord(Customers customers) {
        database = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NAME, customers.getName());

        database.update(TABLE_CUSTOMERS, contentValues, COLUMN_ID + " = ?", new String[]{customers.getID()});
        database.close();
    }

    //public int update (String table, ContentValues values, String whereClause, String[] whereArgs)


    public ArrayList<Customers> getAllRecords() {
        database = this.getReadableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + TABLE_CUSTOMERS, null);

        ArrayList<Customers> customers = new ArrayList<Customers>();
        Customers names;
        if (cursor.getCount() > 0) {
            for (int i = 0; i < cursor.getCount(); i++) {
                cursor.moveToNext();

                names = new Customers();
                names.setID(cursor.getString(0));
                names.setName(cursor.getString(1));


                customers.add(names);
            }
        }
        cursor.close();
        database.close();

        return customers;
    }
}
*/