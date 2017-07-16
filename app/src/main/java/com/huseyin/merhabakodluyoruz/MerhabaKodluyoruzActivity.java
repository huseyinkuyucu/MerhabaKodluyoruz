package com.huseyin.merhabakodluyoruz;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

public class MerhabaKodluyoruzActivity extends AppCompatActivity {
    private final String MAIN_TAG = "MerhabaKodluyoruz";
    private String name;

    @Override
    protected void onStart() {
        super.onStart();
        name = "Hüseyin";
        Log.e(MAIN_TAG, "onContentChanged");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //TODO burayı daha iyi yazarım
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merhaba_kodluyoruz);

        Log.e(MAIN_TAG, "onCreate");


    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        Log.e(MAIN_TAG, "onAttachFragment");
        super.onAttachFragment(fragment);


    }

    @Override
    public void onContentChanged() {
        Log.e(MAIN_TAG, "onContentChanged");
        super.onContentChanged();

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        Log.e(MAIN_TAG, "onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);

    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        Log.e(MAIN_TAG, "onPostCreate");
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onResume() {
        Log.e(MAIN_TAG, "onResume");
        super.onResume();
    }

    @Override
    protected void onPostResume() {
        Log.e(MAIN_TAG, "onPostResume");
        super.onPostResume();
    }

    @Override
    public void onAttachedToWindow() {
        Log.e(MAIN_TAG, "onAttachtoWindow");
        super.onAttachedToWindow();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG, "onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e(MAIN_TAG, "onPrepareOptionMenu");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPause() {
        Log.e(MAIN_TAG, "onPause");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.e(MAIN_TAG, "onSaveInstanceState");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onStop() {
        Log.e(MAIN_TAG, "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(MAIN_TAG, "onDestroy");
        super.onDestroy();
    }


    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        Log.e(MAIN_TAG, "onPostCreate");
        super.onPostCreate(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        Log.e(MAIN_TAG, "onBackPressed");
        super.onBackPressed();
    }

}
