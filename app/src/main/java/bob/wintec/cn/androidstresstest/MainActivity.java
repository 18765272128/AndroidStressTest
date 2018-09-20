package bob.wintec.cn.androidstresstest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "bob";
    private DatebaseHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "In the onCreate method");

        mydb = new DatebaseHelper(this,"database.db", null, 1 );

        replaceBtFragment(new ButtonFragment());
        replaceCtFragment(new RebootFragment());
    }

    private void replaceBtFragment(android.support.v4.app.Fragment mfrag){
        android.support.v4.app.FragmentManager mfragmanager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = mfragmanager.beginTransaction();
        transaction.replace(R.id.bt_fragment, mfrag);
        transaction.commit();
    }
    private void replaceCtFragment(android.support.v4.app.Fragment mfrag){
        android.support.v4.app.FragmentManager mfragmanager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = mfragmanager.beginTransaction();
        transaction.replace(R.id.ct_fragment, mfrag);
        transaction.commit();
    }

    private void mInitDB(){

    }
}
