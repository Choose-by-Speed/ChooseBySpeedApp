package com.epam.hack.choosebyspeed.android.choosebyspeedapp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pverest on 21.06.2015.
 */
public class DateUtil {
    public static String format(Date date) {
        //DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getApplicationContext());
        SimpleDateFormat format = new SimpleDateFormat("MMM dd,yyyy hh:mm a");

        return format.format(date);
    }
}
