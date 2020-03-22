package com.xskt.pph;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import com.xskt.pph.mission.*;
import java.util.*;
import com.xskt.pph.adapters.*;
import com.xskt.pph.models.*;
import android.database.sqlite.*;
import com.xskt.pph.data.*;
import android.database.*;
import com.xskt.pph.activities.*;

public class MainActivity extends Activity implements View.OnClickListener
{
	private EditText id;
	private EditText iname, iphone;
	private TextView rname,rphone;
	private Button insert, read, update, delete;
	//SQLiteDatabase sdb;

	DatabaseHelper db_helper;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		setContentView(R.layout.ticket_stat_item);
        //setContentView(R.layout.main_number);
		//setContentView(R.layout.activity_main);
		
		/*db_helper = new DatabaseHelper(this);
		
		id = findViewById(R.id.id);
		
		iname = findViewById(R.id.iname);
		iphone = findViewById(R.id.iphone);
	
		rname = findViewById(R.id.rname);
		rphone = findViewById(R.id.rphone);
		
		insert = findViewById(R.id.insert);
		read = findViewById(R.id.read);
		update = findViewById(R.id.update);
		delete = findViewById(R.id.delete);
		
		insert.setOnClickListener(this);
		read.setOnClickListener(this);
		update.setOnClickListener(this);
		delete.setOnClickListener(this);
   */
		//String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/mydatabase.sqlite";
		//sdb = SQLiteDatabase.openOrCreateDatabase(path, null);
		//sdb.execSQL("create table if not exists table1(name varchar, phone integer)");*/
	}

	
	@Override
	public void onClick(View v){
		switch(v.getId()){
			case R.id.insert:
				/*ContentValues cv = new ContentValues();
				cv.put("name", iname.getText().toString());
				cv.put("phone", iphone.getText().toString());
				sdb.insert("table1", null, cv);
			
				iname.setText("");
				iphone.setText("");*/
			/*	boolean result = db_helper.insertData(iname.getText().toString());
				if (result == true) {
					iname.setText("");
					Toast.makeText(this, "Data inserted", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(this, "Data not inserted", Toast.LENGTH_SHORT).show();
				}
				break;
			case R.id.read:
				/*Cursor res = db_helper.viewData();
				StringBuffer buf = new StringBuffer();
				
				while (res.moveToNext()){
					buf.append("ID : " + res.getString(0) + "\n");
					buf.append("NAME : " + res.getString(1) + "\n");
				}
				
				AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
				alert.setCancelable(true);
				alert.setTitle("List of your friends name");
				alert.setMessage(buf.toString());
				alert.show();*/
			/*	Intent iList = new Intent(MainActivity.this, CustomerListActivity.class);
				startActivity(iList);
				break;
			case R.id.update:
				boolean res_update = db_helper.updateData(id.getText().toString(), iname.getText().toString());
				if (res_update == true) {
					Toast.makeText(this, "Data updated", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(this, "Data not updated", Toast.LENGTH_SHORT).show();
				}
				
				break;
			case R.id.delete:
				Integer res_del = db_helper.deleteData(id.getText().toString());
				if (res_del > 0) {
					id.setText("");
					Toast.makeText(this, "Data deleted", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(this, "Data not deleted", Toast.LENGTH_SHORT).show();
				}
				
				break;*/
			default:
				break;
		}
	}

}
/*
public class MainActivity extends ListActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//String[] customerName = getResources().getStringArray(R.array.customer_name);
		//ListAdapter adapter1 = new MyAdapter(this, customerName);
		
		//ListView listView = findViewById(R.id.activity_mainListView);
		//listView.setAdapter(adapter);
		//ArrayAdapter<String> adap = new ArrayAdapter<String>(this,
		//	R.layout.entry, R.id.entryTextView, customerName);
	
		//ListAdapter ticketStatAdapter = new MyAdapter(this, abc);
	}
	
	
	}
}*/


