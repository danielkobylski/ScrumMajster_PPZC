package com.ciastkaipiwo.android.scrummajster;

/**
 * Created by Daniel on 31.03.2018.
 */

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ciastkaipiwo.android.scrummajster.Project;
import com.ciastkaipiwo.android.scrummajster.R;

import java.util.List;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder>{

    private List<Project> projectList;

    public ProjectsAdapter(List<Project> projectList) {
        this.projectList = projectList;
    }

    @Override
    public ProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.projects_list_row, parent, false);

        return new ProjectViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProjectViewHolder holder, int position) {
        holder.title.setText(projectList.get(position).getTitle());
        holder.startDate.setText(projectList.get(position).getStartDate().toString());
        holder.endDate.setText(projectList.get(position).getEndDate().toString());
    }

    @Override
    public int getItemCount() {
        return projectList.size();
    }

    public class ProjectViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title;
        public TextView startDate;
        public TextView endDate;
        public ProjectViewHolder(View view) {
            super(view);
            view.setOnClickListener(this);
            title = (TextView) view.findViewById(R.id.title);
            startDate = (TextView) view.findViewById(R.id.start_date);
            endDate = (TextView) view.findViewById(R.id.end_date);
        }
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), title.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}