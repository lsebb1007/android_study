package org.androidtown.quickcoding_1110;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    static ArrayList<String> m_string = new ArrayList<>();
    static ArrayList<Integer> m_int = new ArrayList<>();

    public TextView stringView;
    public TextView numView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        stringView = (TextView) findViewById(R.id.stringView);
        numView = (TextView) findViewById(R.id.numView);

    }

    public void onClickbutton1(View v) {
        EditText ed1 = (EditText) findViewById(R.id.editText);
        String str = ed1.getText().toString();
        try{

            int num = Integer.parseInt(str);
            m_int.add(num);

            }catch(NumberFormatException e){
                m_string.add(str);
            }
    }
    public void onClick2(View v){
        String str1 = "";
        String str2 = "";
        Iterator<String> iterator = m_string.iterator();
        Iterator<Integer> iterator1 = m_int.iterator();
        while(iterator.hasNext()) {
            str1 += iterator.next() + " ";
        }
        while(iterator1.hasNext()) {
            str2 += iterator1.next() + " ";
        }
        stringView.setText(str1);
        numView.setText(str2);
    }
}
