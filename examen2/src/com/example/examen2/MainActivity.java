package com.example.examen2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void a(View View){
    	Toast.makeText(getApplicationContext(),"(2)horas semanales" ,Toast.LENGTH_LONG).show();
    }
    public void b(View View){
    	Toast.makeText(getApplicationContext(),"(2)horas semanales" ,Toast.LENGTH_LONG).show();
    }
    public void c(View View){
    	Toast.makeText(getApplicationContext(),"(2)horas semanales" ,Toast.LENGTH_LONG).show();
    }
    public void d(View View){
    	Toast.makeText(getApplicationContext(),"(8)horas semanales" ,Toast.LENGTH_LONG).show();
    }
    public void e(View View){
    	Toast.makeText(getApplicationContext(),"(2)horas semanales" ,Toast.LENGTH_LONG).show();
    }
    public void f(View View){
    	Toast.makeText(getApplicationContext(),"(4)horas semanales" ,Toast.LENGTH_LONG).show();
    }
    public void g(View View){
    	Toast.makeText(getApplicationContext(),"(5)horas semanales" ,Toast.LENGTH_LONG).show();
    }
    public void button(View View){
    	Toast.makeText(getApplicationContext(),"(5)horas semanales" ,Toast.LENGTH_LONG).show();
    }
}
