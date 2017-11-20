package com.dave.wifirealtimespeeker.util;

import android.widget.Toast;

import com.dave.wifirealtimespeeker.MyApplication;


/**
 * Created by Kevin on 2016/10/24.
 */
public class CommUtil {

    public final static String tag = "【CommUtil】";

    public static void Toast(String content) {
        Toast.makeText(MyApplication.getContext(),content,Toast.LENGTH_SHORT).show();
    }
}
