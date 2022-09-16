package com.android.fragmentscomactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout placeHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placeHolder = findViewById( R.id.placeHolder);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuToast:

                placeHolder.removeAllViews();

                FragmentManager fm1 = getSupportFragmentManager();
                ToastFragment tf = new ToastFragment();
                FragmentTransaction ft1 = fm1.beginTransaction();

                ft1.replace(R.id.placeHolder, tf );
                ft1.commit();

                return true;

            case R.id.menuSoma:

                placeHolder.removeAllViews();

                FragmentManager fm2 = getSupportFragmentManager();
                SomaFragment sf = new SomaFragment();
                FragmentTransaction ft2 = fm2.beginTransaction();

                ft2.replace(R.id.placeHolder, sf );
                ft2.commit();

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}