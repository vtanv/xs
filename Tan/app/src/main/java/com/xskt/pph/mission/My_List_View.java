package com.xskt.pph.mission;
import android.app.*;
import android.os.*;
import com.xskt.pph.*;
import com.xskt.pph.data.*;
import android.widget.*;
import java.util.*;
import android.database.*;

public class My_List_View extends Activity
{
	DatabaseHelper db_helper;
	ListView listFriends;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_list_view);
	
		db_helper = new DatabaseHelper(this);
		listFriends = findViewById(R.id.my_list_id);
	
		ArrayList<String> arrFriends = new ArrayList<>();
		Cursor cr = db_helper.viewData();
	
		while (cr.moveToNext()){
			arrFriends.add(cr.getString(1));
			ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrFriends);
			listFriends.setAdapter(adapter);
		}
	}
	
}
