package com.ciastkaipiwo.android.scrummajster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Project> mProjectList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private ProjectsAdapter mProjectsAdapter;
    ImageButton mAddButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mProjectsAdapter = new ProjectsAdapter(mProjectList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mProjectsAdapter);

        mAddButton = (ImageButton) findViewById(R.id.add_button);
        mAddButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //open ProjectConfigActivity here
            }

        });

        initProjectsData();

    }



    private void initProjectsData() {
        for (int i = 1; i<15; i++) {
            mProjectList.add(new Project("Project"+i, new Date(2018,03,31), new Date(2018,04,i)));
        }
    }

}


