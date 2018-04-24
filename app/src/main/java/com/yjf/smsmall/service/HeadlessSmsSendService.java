package com.yjf.smsmall.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by yjf on 2018/3/5.
 */

public class HeadlessSmsSendService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}