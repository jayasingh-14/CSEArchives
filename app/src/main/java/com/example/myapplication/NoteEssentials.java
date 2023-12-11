package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.text.PrecomputedText;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NoteEssentials extends AppCompatActivity {

    SQLiteDatabase db;
    Button add;
    ImageButton del,rem;
    EditText takenote;
    LinearLayout notes,d;
    ScrollView notescroll,delscroll;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_essentials);

        db = openOrCreateDatabase("archives", Context.MODE_PRIVATE,null);
        db.execSQL("Create table if not exists notes(note varchar not null);");

        notes = findViewById(R.id.notes);
        d = findViewById(R.id.deletenotes);
        delscroll = findViewById(R.id.delscroll);
        notescroll = findViewById(R.id.notescroll);

        takenote = findViewById(R.id.take);
        add = findViewById(R.id.addnote);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(takenote.getText().toString().equals(""))){
                    String s = takenote.getText().toString();
                    takenote.setText("");
                    textbox(s);
                    db.execSQL("insert into notes values('"+s+"')");
                }
            }
        });

        del = findViewById(R.id.deletebtn);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(data())
                {
                    notes.removeAllViews();
                    add.setEnabled(false);
                    takenote.setEnabled(false);
                    notescroll.setVisibility(View.GONE);
                    del.setVisibility(View.GONE);
                    delscroll.setVisibility(View.VISIBLE);
                    rem.setVisibility(View.VISIBLE);
                }
            }
        });

        rem = findViewById(R.id.backbtn);
        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(notesrestore()){
                    d.removeAllViews();
                    add.setEnabled(true);
                    takenote.setEnabled(true);
                    notescroll.setVisibility(View.VISIBLE);
                    del.setVisibility(View.VISIBLE);
                    delscroll.setVisibility(View.GONE);
                    rem.setVisibility(View.GONE);
                }
            }
        });

        if(notesrestore()){
            Toast.makeText(this, "Notes Opened", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean notesrestore(){
        Cursor c = db.rawQuery("select * from notes;",null);
        if(c.getCount()>0){
            while(c.moveToNext())
            {
                String s = c.getString(0);
                textbox(s);
            }
        }
        return true;
    }
    private boolean data(){
        Cursor cursor = db.rawQuery("select * from notes;",null);
        while(cursor.moveToNext())
        {
            CheckBox ck = new CheckBox(this);
            LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(0,0,0,30);
            ck.setLayoutParams(params);
            ck.setText(cursor.getString(0));
            ck.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
            ck.setPadding(20,20,20,20);
            ck.setBackgroundResource(R.drawable.roundcorner_field);
            ck.setTextColor(Color.parseColor("#FFFFFFFF"));
            ck.setId(i);
            ck.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    CheckBox c = findViewById(v.getId());
                    String s = c.getText().toString();
                    db.execSQL("delete from notes where note = '"+s+"';");
                    d.removeView(v);;
                }
            });
            d.addView(ck);
            i++;
        }
        return true;
    }

    private void textbox(String s) {
        TextView t = new TextView(this);
        LinearLayout.LayoutParams params= new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,30);
        t.setLayoutParams(params);
        t.setText(s);
        t.setPadding(20,20,20,20);
        t.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        t.setBackgroundResource(R.drawable.roundcorner_field);
        t.setTextColor(Color.parseColor("#FFFFFFFF"));
        notes.addView(t);
    }
    @Override
    protected void onStop() {
        notes.removeAllViews();
        db.close();
        super.onStop();
    }
}