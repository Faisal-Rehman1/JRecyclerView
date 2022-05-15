package com.example.jrecyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

// It is a AdapterClass for bind the ViewHolder
public class KeysListAdapter extends RecyclerView.Adapter<KeyViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private final ArrayList<String> mitems;
    private final Context mContext;

    public KeysListAdapter(Context context, ArrayList<String> items) {
        mitems = items;
        mContext = context;
    }

    @Override
    public KeyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_keys, parent, false);
        KeyViewHolder viewHolder = new KeyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(KeyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        holder.TitleItemView.setText(mitems.get(position));
    }

    @Override
    public int getItemCount() {
        return mitems.size();
    }
}

// ViewHolder class that Holds the textView
class KeyViewHolder extends RecyclerView.ViewHolder {
    TextView TitleItemView;

    KeyViewHolder(View itemView) {
        super(itemView);
        TitleItemView = itemView.findViewById(R.id.title);
    }

    public void bind(String text) {
        TitleItemView.setText(text);
    }

//    static KeyViewHolder create(ViewGroup parent) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_keys, parent, false);
//        return new KeyViewHolder(view);
//    }
}