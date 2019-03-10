package com.example.ratemaplate;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table user(username text, email text primary key, password text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop if table exists user");

    }
    // inserting the database
    public boolean insert(String username, String email, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("email", email);
        contentValues.put("password", password);
        long ins = db.insert("user", null,contentValues);
        if(ins==-1) return false;
        else return true;
    }

    // checking if email exists
    public Boolean checkEmail (String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where email=?", new String[] {email});
        if (cursor.getCount() > 0) return false;
        else return true;
    }

    // checking if username exists
    public Boolean checkUsername (String username) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where username=?", new String[] {username});
        if(cursor.getCount() > 0) return false;
        else return true;
    }
}

Boolean checkEmail = db.checkEmail(s2);
                if (!checkEmail) {
                    Toast.makeText(getApplicationContext(), "Email Already exists", Toast.LENGTH_SHORT).show();
                    return;
                }

                // checks username isnt already being used by someone eles
                Boolean checkUsername = db.checkUsername(s1);
                if(!checkUsername) {
                    Toast.makeText(getApplicationContext(), "Username Already exists", Toast.LENGTH_SHORT).show();
                    return;
                }

                // s2 & s3 assigns email to password
                boolean insert = db.insert(s1, s2, s3);
                if (insert) {
                    Toast.makeText(getApplicationContext(), "Registered Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Account could not be created", Toast.LENGTH_SHORT).show();
                }
