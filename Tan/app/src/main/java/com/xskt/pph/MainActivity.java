package com.xskt.pph;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;
import com.xskt.pph.mission.*;

public class MainActivity extends Activity implements View.OnClickListener
{
	private Button btnTicket, btnCustomer;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	
		btnTicket = findViewById(R.id.btnTicket);
		btnTicket.setOnClickListener(this);
    
		btnCustomer = findViewById(R.id.mainButton2);
		btnCustomer.setOnClickListener(this);
	}

	@Override
	public void onClick(View v){
		switch(v.getId()){
			case R.id.btnTicket:
				Intent iTicket = new Intent(MainActivity.this, Ticket.class);
				startActivity(iTicket);
				
				break;
			
			default:
				break;
		}
	}

}
