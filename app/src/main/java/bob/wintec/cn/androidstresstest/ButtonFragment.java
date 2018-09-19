package bob.wintec.cn.androidstresstest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by adc on 2018/9/19.
 */

public class ButtonFragment extends Fragment {
    private static String TAG = "bob";
    private Button bt_reboot;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buttonfagment, container, false);
        bt_reboot = (Button) view.findViewById(R.id.bt_reboot);
        bt_reboot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "you have tip the reboot button");
            }
        });
        return view;
    }

}
