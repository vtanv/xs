package com.xskt.pph.mission;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;
import android.view.*;
import com.xskt.pph.*;


public class Ticket extends ListActivity
{
	public final static Class[] CLASS = new Class[] {
		TicketWinList.class,
		My_List_View.class
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		String[] label = getResources().getStringArray(R.array.ticket_list_label);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, label);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		Intent intent = new Intent();
		intent.setClass(this, CLASS[position]);
		startActivity(intent);
	}
	/*Intent intent = getIntent();
	 String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

	 TextView textView = new TextView(this);
	 textView.setTextSize(70);
	 textView.setText(message);
	 setContentView(textView);*/
}
