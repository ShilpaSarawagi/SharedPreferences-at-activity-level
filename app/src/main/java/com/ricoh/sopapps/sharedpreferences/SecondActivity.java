package com.ricoh.sopapps.sharedpreferences;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ssarawagi on 11/8/2016.
 */

public class SecondActivity extends Activity{

    private TextView txvName, txvProfession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txvName = (TextView) findViewById(R.id.txvName);
        txvProfession = (TextView) findViewById(R.id.txvProfession);
    }

    public void loadAccountData(View view) {
    }

    public void clearAccountData(View view) {
    }

    public void removeProfessionKey(View view) {
    }
}
