package com.epam.hack.choosebyspeed.android.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pverest on 21.06.2015.
 */
public class OrdersDas {

    public static final String URL = "http://172.30.43.170:8080/choosebyspeed/deliverys"; //dev
    //final String url = "http://rest-service.guides.spring.io/greeting";


    /**
     * An array of sample (dummy) items.
     */
    public static List<Delivery> ITEMS = new ArrayList<Delivery>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, Delivery> ITEM_MAP = new HashMap<String, Delivery>();

    public static void swap(List<Delivery> list) {
        ITEMS.clear();
        ITEM_MAP.clear();
        for(Delivery dlvr: list){
            addItem(dlvr);
        }
    }

    private static void addItem(Delivery item) {
        ITEMS.add(item);
        ITEM_MAP.put(String.valueOf(item.id), item);
    }

}
