package com.android.ag.notetrainer.TaskActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.android.ag.notetrainer.MainActivity;
import com.android.ag.notetrainer.R;
import com.android.ag.notetrainer.TaskSet;

/**
 * Created by User on 30.03.2016.
 */
public class TaskHands extends Activity {

    private static final int LAYOUT = R.layout.choose_task;

    public ImageButton task[] = new ImageButton[6];
    public Intent intent;
    public String text_id,text_data;
    public String index_set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        text_id = getIntent().getStringExtra("id");
        text_data = getIntent().getStringExtra("data");

        task[0] = (ImageButton) findViewById(R.id.task_1);
        task[1] = (ImageButton) findViewById(R.id.task_2);
        task[2] = (ImageButton) findViewById(R.id.task_3);
        task[3] = (ImageButton) findViewById(R.id.task_4);
        task[4] = (ImageButton) findViewById(R.id.task_5);
        task[5] = (ImageButton) findViewById(R.id.task_6);

        task[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index_set = "1";
                intent = new Intent(TaskHands.this, TaskSet.class);
                intent.putExtra("id",text_id);
                intent.putExtra("data",text_data);
                intent.putExtra("name_table", MainActivity.mDatabaseHelper.TABLE_NAME[0]);
                intent.putExtra("index_set", index_set);
                startActivity(intent);
            }
        });

        task[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index_set = "2";
                intent = new Intent(TaskHands.this, TaskSet.class);
                intent.putExtra("id",text_id);
                intent.putExtra("data",text_data);
                intent.putExtra("name_table", MainActivity.mDatabaseHelper.TABLE_NAME[0]);
                intent.putExtra("index_set", index_set);
                startActivity(intent);
            }
        });

        task[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index_set = "3";
                intent = new Intent(TaskHands.this, TaskSet.class);
                intent.putExtra("id",text_id);
                intent.putExtra("data",text_data);
                intent.putExtra("name_table", MainActivity.mDatabaseHelper.TABLE_NAME[0]);
                intent.putExtra("index_set", index_set);
                startActivity(intent);
            }
        });

        task[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index_set = "4";
                intent = new Intent(TaskHands.this, TaskSet.class);
                intent.putExtra("id",text_id);
                intent.putExtra("data",text_data);
                intent.putExtra("name_table", MainActivity.mDatabaseHelper.TABLE_NAME[0]);
                intent.putExtra("index_set", index_set);
                startActivity(intent);
            }
        });

        task[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index_set = "5";
                intent = new Intent(TaskHands.this, TaskSet.class);
                intent.putExtra("id",text_id);
                intent.putExtra("data",text_data);
                intent.putExtra("name_table", MainActivity.mDatabaseHelper.TABLE_NAME[0]);
                intent.putExtra("index_set", index_set);
                startActivity(intent);
            }
        });

        task[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index_set = "6";
                intent = new Intent(TaskHands.this, TaskSet.class);
                intent.putExtra("id",text_id);
                intent.putExtra("data",text_data);
                intent.putExtra("name_table", MainActivity.mDatabaseHelper.TABLE_NAME[0]);
                intent.putExtra("index_set", index_set);
                startActivity(intent);
            }
        });
    }
}
