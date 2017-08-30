package com.hyperdev.playvolley;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ProgressDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDialog = new ProgressDialog(this);
        mDialog.setMessage(getString(R.string.text_loading));
    }

    public void onStringRequestPressed(View view) {

    }

    public void onJsonObjectRequestPressed(View view) {

    }

    public void onJsonArrayRequestPressed(View view) {

    }

    public void onImageRequestPressed(View view) {

    }
}
