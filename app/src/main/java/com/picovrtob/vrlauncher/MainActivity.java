package com.picovrtob.vrlauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    int i;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        i=0;
    }

    public void onResum() {

        if (i==0) {
            ComponentName componentName = new ComponentName( "com.picovr.recenter", "com.picovr.recenter.activity.UnityActivity" );

            Intent intent = new Intent();
            intent.setComponent( componentName );
            startActivity( intent );
        }
        i=1;

    }
}
