package bob.wintec.cn.androidstresstest;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by adc on 2018/9/19.
 */

public class RebootFragment extends Fragment {

    SQLiteDatabase minfotable;
    Button inset;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mview = inflater.inflate(R.layout.reboot_fragment, container, false);

        minfotable = new DatebaseHelper(getActivity(),"database.db", null, 1 ).getWritableDatabase();
        inset = (Button) mview.findViewById(R.id.start);
        inset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues mvalue = new ContentValues();
                mvalue.put("item", "reboot times");
                mvalue.put("boolvalue", true);
                mvalue.put("numvalue", 20);
                mvalue.put("strvalue", "reboot comm");
                minfotable.insert("info", null, mvalue);
            }
        });

        return mview;

    }

    public void mDatabaseQuery( ){

    }

}
