package com.xskt.pph.activities;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;
import java.util.*;
import com.xskt.pph.*;
import com.xskt.pph.adapters.*;
import com.xskt.pph.models.*;
import com.xskt.pph.data.*;
import android.database.sqlite.*;
import android.database.*;

public class CustomerListActivity extends ListActivity
{
	DatabaseHelper db_helper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.customer_list);
	
		db_helper = new DatabaseHelper(this);
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Cursor cr = db_helper.viewData();
		while (cr.moveToNext()){
			customers.add(new Customer(cr.getString(1)));
			ListAdapter adapter = new CustomerAdapter(this, customers);
			setListAdapter(adapter);
		}
		
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		Customer s = (Customer)getListView().getItemAtPosition(position);
		Toast.makeText(this, s.getName() + " " + s.getAddress(), Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
			case R.id.help:
			Toast.makeText(this, "help", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.exit:
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
