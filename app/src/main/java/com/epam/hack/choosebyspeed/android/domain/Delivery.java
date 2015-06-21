package com.epam.hack.choosebyspeed.android.domain;

import com.epam.hack.choosebyspeed.android.choosebyspeedapp.DateUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by pverest on 21.06.2015.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Delivery {

    public Long id;
    public Provider provider;

    /**
     private Customer customer;
     */

    public Date timeStart;
    public Date timeEnd;

    private Float timeDuration;

    public String getTimeStartString(){
        return DateUtil.format(timeStart);
    }

    public String getTimeEndString(){
        return DateUtil.format(timeEnd);
    }

    public String getCategoryProviderString(){
        return provider.category.name
                +" from "+provider.name;
    }


    @Override
    public String toString(){
        return getCategoryProviderString()
                +" "+getTimeStartString();


    }

}
