package com.example.pat.watch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.w1) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void forwardLst (MenuItem i){

    }

    public void backwardLst (MenuItem i){

    }

    public void newWatch (MenuItem i){

    }

    public void showDetails (MenuItem i){

    }

    public void deleteWatch (MenuItem i){

    }

    public void avgPrice (MenuItem i){

    }

    public void numAuto (MenuItem i){

    }

    public void expensiveWatch (MenuItem i){

    }

    public void loadLst (MenuItem i){
        TextView tv1 = (TextView) findViewById(R.id.text_main);
        String[] data = new String[1024];
        int x;


        try {
            URL urlDat = new URL("https://web.njit.edu/~halper/it114/a1dat.txt");
            Scanner urlScn = new Scanner(urlDat.openStream());
            while (urlScn.hasNext()){
                data[x] = (urlScn.nextLine() + "\n");
                x++;
            }
            urlScn.close();


        }catch (IOException Exc){
            //I dont know, toast or something. do it
            tv1.setText("IO Exception: check file address or URL");

    }}

    public void saveLst (MenuItem i){

    }


    private static boolean isDiveWatch(String objName) {
        boolean isDW;

        int water = objName.getWr();
        if (water > 200){
            isDW = true;
        }else{
            isDW =false;
        }

        return  isDW;
    }

    public int getAge(String objName){
        //first, get the year
        Calendar now = Calendar.getInstance(TimeZone.getDefault());
        int curYear = now.get(Calendar.YEAR);
        //get year from the object
        int year = objName.getYear();
        //math
        year = curYear-year;

        return year;
    }
}
