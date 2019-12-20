package com.gamecodeschool.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
  ArrayList<String> ContactList;
  ArrayList<Integer> PhotoList;
  Context context;

    public RecyclerViewAdapter(ArrayList<String> contactList, ArrayList<Integer> photoList, Context context) {
        ContactList = contactList;
        PhotoList = photoList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mContact.setText(ContactList.get(position));
        holder.mPhoto.setImageResource(PhotoList.get(position));

    }

    @Override
    public int getItemCount() {
        return PhotoList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView mContact;
        ImageView mPhoto;
        LinearLayout layoutContact;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mContact = itemView.findViewById(R.id.textview_contact);
            mPhoto = itemView.findViewById(R.id.image_contact);
            layoutContact = itemView.findViewById(R.id.linear_layoutcontact);

        }
    }

}
