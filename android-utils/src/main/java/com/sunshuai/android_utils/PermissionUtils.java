/*******************************************************************************
 * Copyright (c) 2017. www.hrsoft.net  Inc. All rights reserved.
 ******************************************************************************/

package com.sunshuai.android_utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/**
 * Created by sunshuai on 2018/1/18
 */

public final class PermissionUtils {

    public static boolean checkPermission(Context context, String permission) {
        return ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED;
    }


    public static void requestPermission(Activity activity, String[] permissions, int requestCode) {
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }
}
