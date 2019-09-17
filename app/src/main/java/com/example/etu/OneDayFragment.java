package com.example.etu;


import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class OneDayFragment extends Fragment implements Updatable{

    private RecyclerView recyclerView;
    private ArrayList<String> listOfLessons;
    private String day;
    private LessonsAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_day, container, false);


        recyclerView = view.findViewById(R.id.recyclerView);

        adapter = new LessonsAdapter(day, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }


    public void setDay(String day){
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void update(){
       // Log.i("MYTAG", ""+day);
       // setDay(day);
        adapter.notifyDataSetChanged();
    }

}
