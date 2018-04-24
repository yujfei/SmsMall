/*
 * Copyright (c) 2010 - 2015 Ushahidi Inc
 * All rights reserved
 * Contact: team@ushahidi.com
 * Website: http://www.ushahidi.com
 * GNU Lesser General Public License Usage
 * This file may be used under the terms of the GNU Lesser
 * General Public License version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE.LGPL included in the
 * packaging of this file. Please review the following information to
 * ensure the GNU Lesser General Public License version 3 requirements
 * will be met: http://www.gnu.org/licenses/lgpl.html.
 *
 * If you have questions regarding the use of this file, please contact
 * Ushahidi developers at team@ushahidi.com.
 */

package com.yjf.smsmall.receiver;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.yjf.smsmall.service.SmsReceiverService;

/**
 * This class handles SMS broadcast receiver.
 *
 * @author Henry Addo
 */
public class SmsReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        intent.setClass(context, SmsReceiverService.class);
        intent.putExtra("result", getResultCode());
        SmsReceiverService.beginStartingService(context, intent);
    }
}
