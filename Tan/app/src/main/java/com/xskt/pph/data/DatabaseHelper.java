package com.xskt.pph.data;
import android.database.sqlite.*;
import android.content.*;
import android.database.*;

public class DatabaseHelper extends  SQLiteOpenHelper
{
	public static final String DATABASE_NAME = "friends.db";
	public static final String TABLE_NAME = "friends_name";
	public static final String COL_ID = "ID";
	public static final String COL_NAME = "NAME";
	
	public DatabaseHelper(Context context){
		super(context, DATABASE_NAME, null,1);
		SQLiteDatabase db = this.getWritableDatabase();
	}
	
	@Override
	public void onCreate(SQLiteDatabase db){
		db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME VARCHAR)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
		onCreate(db);
	}

	public boolean insertData(String name){
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues cv = new ContentValues();
		cv.put("NAME", name); 
		long result = db.insert(TABLE_NAME, null, cv);
		if (result == -1)
			return false;
		else
			return true;
	}

	public Cursor viewData(){
		SQLiteDatabase db = this.getWritableDatabase();
	
		Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
	
		return res;
	}

	public boolean updateData(String id, String name){
		SQLiteDatabase db = this.getWritableDatabase();
	
		ContentValues cv = new ContentValues();
	
		cv.put("NAME", name);
	
		db.update(TABLE_NAME, cv, "ID = ?", new String[] {id});
		
		return true;
	}

	public Integer deleteData(String id){
		SQLiteDatabase db = this.getWritableDatabase();
	
		return db.delete(TABLE_NAME, "ID = ?", new String[] {id});
		
	}
}
