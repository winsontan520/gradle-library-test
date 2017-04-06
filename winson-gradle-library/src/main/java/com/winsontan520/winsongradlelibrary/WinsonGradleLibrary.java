package com.winsontan520.winsongradlelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Winson Tan on 3/30/17.
 */

public class WinsonGradleLibrary {

    private static volatile WinsonGradleLibrary singleton;

    private Context mContext;

    private WinsonGradleLibrary(Context context) {
        mContext = context.getApplicationContext();
    }

    public static void init(Context context) {
        if (singleton == null) {
            singleton = new WinsonGradleLibrary(context);
        }
    }

    public static void startHacking() {
        singleton.toast();
    }

    private void toast() {
        Toast.makeText(mContext, "Hack your head lah!", Toast.LENGTH_LONG).show();
    }
}
