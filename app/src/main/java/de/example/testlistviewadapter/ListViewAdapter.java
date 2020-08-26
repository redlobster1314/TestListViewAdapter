package de.example.testlistviewadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ListViewAdapter  extends BaseAdapter implements ListAdapter {

    private List<Daten> datenList;
    private Context context;

    public ListViewAdapter(List<Daten> datenList, Context context){
        this.datenList = datenList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return datenList.size();
    }

    @Override
    public Object getItem(int i) {
        return datenList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.daten_layout, null);

        TextView textView = (TextView) view.findViewById(R.id.myTextView);
        textView.setText(datenList.get(i).getName());

        Button myButton = view.findViewById(R.id.myButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, datenList.get(i).getBeschreibung(), Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
