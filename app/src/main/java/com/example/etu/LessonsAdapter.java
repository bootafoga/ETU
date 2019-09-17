package com.example.etu;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.LessonsViewHoler> {

    private String day;
    private Context context;
    private Cursor cursor;
    ConnectDBHelper connect;

    public LessonsAdapter(String day, Context context) {
        this.day = day;
        this.context = context;
        connect = new ConnectDBHelper(context);
        cursor = connect.getCursorByFlag(day);
    }

    @NonNull
    @Override
    public LessonsViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_lesson_cardview, parent, false);
        return new LessonsViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LessonsViewHoler holder, int position) {
        if (cursor.moveToNext()) {
            holder.lessonName.setText(cursor.getString(1));
            holder.lessonClassroom.setText(cursor.getString(2));
            holder.lessonTeacher.setText(cursor.getString(3));
            holder.lessonTime.setText(cursor.getString(4));

            String type;
            int currentTypeNum = cursor.getInt(6);
            if (currentTypeNum == 0){
                type = "Лекция";
                holder.image.setImageResource(R.drawable.lection_three);
            } else if (currentTypeNum == 1){
                type = "Практика";
                holder.image.setImageResource(R.drawable.practice_one);
            } else {
                type = "Лаба";
                holder.image.setImageResource(R.drawable.labs_two);
            }

            holder.lessonType.setText(type);

        }
    }

    @Override
    public int getItemCount() {
        return cursor.getCount();
    }

    class LessonsViewHoler extends RecyclerView.ViewHolder{

        private TextView lessonName;
        private TextView lessonClassroom;
        private TextView lessonTime;
        private TextView lessonTeacher;
        private TextView lessonType;
        private ImageView image;


        public LessonsViewHoler(@NonNull View itemView) {
            super(itemView);
            lessonName = itemView.findViewById(R.id.lessonName);
            lessonClassroom = itemView.findViewById(R.id.lessonClassroom);
            lessonTime = itemView.findViewById(R.id.lessonTime);
            lessonTeacher = itemView.findViewById(R.id.lessonTeacher);
            lessonType = itemView.findViewById(R.id.lessonType);
            image = itemView.findViewById(R.id.view);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
