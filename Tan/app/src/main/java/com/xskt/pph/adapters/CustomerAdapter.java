package com.xskt.pph.adapters;
import java.util.*;
import com.xskt.pph.*;
import com.xskt.pph.models.*;
import android.content.Context;
import android.widget.*;
import android.view.*;

public class CustomerAdapter extends ArrayAdapter<Customer>
{
	public CustomerAdapter(Context context, ArrayList<Customer> customers){
		super(context, 0, customers);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		if (convertView == null){
			convertView = LayoutInflater.from(getContext()).inflate(R.layout.entry, parent, false);
		}

		Customer customer = getItem(position);

		TextView tvName = (TextView) convertView.findViewById(R.id.entryTextView);
		TextView tvHome = (TextView) convertView.findViewById(R.id.entryTextView2);

		tvName.setText(customer.getName());
		tvHome.setText(customer.getAddress());
		// Return the completed view to render on screen
		ImageView imageView = convertView.findViewById(R.id.entryImageView);
		imageView.setImageResource(android.R.drawable.ic_menu_info_details);
		return convertView;
    }
}
