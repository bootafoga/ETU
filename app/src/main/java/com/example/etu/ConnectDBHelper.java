package com.example.etu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class ConnectDBHelper {
    private Context context;
    private SQLiteDatabase dbWritable;
    private SQLiteDatabase dbReadable;
    Cursor cursor;

    public ConnectDBHelper(Context context){
        this.context = context;
        setConnect();
    }

    private void setConnect(){
        SQLiteOpenHelper lessonsDatabaseHelper = new LessonsOfTheDaySQLiteHelper(context);
        try {
            dbWritable = lessonsDatabaseHelper.getWritableDatabase();
            dbReadable = lessonsDatabaseHelper.getReadableDatabase();
        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(context, R.string.database_unavailable, Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public SQLiteDatabase getDbWritable() {
        return dbWritable;
    }

    public SQLiteDatabase getDbReadable() {
        return dbReadable;
    }

    public Cursor getCursorAll() {
        Cursor cursorAll;
        cursorAll = dbReadable.query("LESSONS",
                new String[]{"_id", "LESSONNAME", "CLASSROOM", "TEACHER", "TIME"},
                null, null, null, null, null);
        return cursorAll;
    }

    public Cursor getCursorByFlag(String day) {
        Cursor cursorByFlag;
        cursorByFlag = dbReadable.query("LESSONS",
                new String[]{"_id", "LESSONNAME", "CLASSROOM", "TEACHER", "TIME", "FLAG", "TYPE"},
                "FLAG = ?", new String[]{day}, null, null, null);
        return cursorByFlag;
    }
}
