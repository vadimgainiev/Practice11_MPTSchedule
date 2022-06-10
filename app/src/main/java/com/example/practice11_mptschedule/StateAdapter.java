package com.example.practice11_mptschedule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<LessonsDay> lessonsDays;

    StateAdapter(Context context, List<LessonsDay> lessonsDays) {
        this.lessonsDays = lessonsDays;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public StateAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.day_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        LessonsDay lessonsDay = lessonsDays.get(position);
        holder.pair.setText(lessonsDay.getPair());
        holder.discipline.setText(lessonsDay.getDiscipline());
        holder.lecturer.setText(lessonsDay.getLecturer());
    }

    @Override
    public int getItemCount() {
        return lessonsDays.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView pair;
        TextView discipline;
        TextView lecturer;
        ViewHolder(View view){
            super(view);
            pair = view.findViewById(R.id.pair);
            discipline = view.findViewById(R.id.discipline);
            lecturer = view.findViewById(R.id.lecturer_FIO);
        }
    }

}


