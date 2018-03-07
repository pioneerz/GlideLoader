package com.example.maventest;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator
 * 2018/3/7 0007.
 */

public class MavenProxy {
    private static volatile MavenProxy mInstance;

    public static MavenProxy getInstance() {
        if (mInstance == null) {
            synchronized (MavenProxy.class) {
                if (mInstance == null) {
                    mInstance = new MavenProxy();
                }
            }
        }
        return mInstance;
    }

    public void init(Context context) {
        Toast.makeText(context, "Maven Proxy", Toast.LENGTH_SHORT).show();
    }

}
