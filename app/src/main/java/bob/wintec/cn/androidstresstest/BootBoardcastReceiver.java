package bob.wintec.cn.androidstresstest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootBoardcastReceiver extends BroadcastReceiver {
    private static String TAG = "bob";
    private static String action_boot = "android.intent.action.BOOT_COMPLETED";
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.i(TAG, "In the broadcast receiver!");

        if (intent.getAction().equals(action_boot)) { //开机启动完成后，要做的事情
            Log.i(TAG, "In the broadcast receiver!");
            Intent mint = new Intent(context, MainActivity.class);
            mint.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mint);
        }
    }
}
