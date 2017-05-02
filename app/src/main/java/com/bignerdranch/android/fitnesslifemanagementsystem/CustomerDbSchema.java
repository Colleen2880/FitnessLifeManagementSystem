package com.bignerdranch.android.fitnesslifemanagementsystem;

/**
 * Created by Colle on 4/28/2017.
 */



public class CustomerDbSchema {

    public static final class CustomerTable {
        public static final String NAME = "customers";

        public static final class Cols {
            public static final String UUID = "id";
            public static final String CUSTOMERNAME = "customername";
            public static final String CUSTOMERADDRESS = "customeraddress";
            public static final String CUSTOMERPHONE = "customerphone";
            public static final String CUSTOMEREMAIL = "customeremail";
        }
    }
}
