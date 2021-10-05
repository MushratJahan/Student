package com.example.urms;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static int  DB_VERSION = 1;
    public static final String DBNAME = "URMS";
    //private static String name ="Login.db" ;
    private String studentID;
    private static final String STUDENT_INFO_TABLE = "Student Profile";
    public DBHelper(Context context) {
        super(context,DBNAME,null,DB_VERSION);
    }




    private static final String KEY_STUDENT_ID = "student_id";
    private static final String KEY_STUDENT_NAME = "student_firstname";
    private static final String KEY_STUDENT_MO_NO = "student_mobilenumber";
    private static final String KEY_STUDENT_ADDRESS = "student_address";
    private static final String KEY_STUDENT_DEPARTMENT = "student_department";




    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table users(studentId TEXT primary key, password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop Table if exists users");

    }
    public Boolean insertData(String studentID, String password) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("studentID", studentID);
        contentValues.put("password", password);
        long result = MyDB.insert("users", null, contentValues);
        if (result == -1) return false;
        else
            return true;
    }
    public Boolean checkstudentID (String studentID){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where studentID = ?", new String[]{studentID});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
    public Boolean checkstudentIDpassword(String username, String password){
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where studentID = ?", new String[]{studentID,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
