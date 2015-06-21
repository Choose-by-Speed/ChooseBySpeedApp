package com.epam.hack.choosebyspeed.android.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by pverest on 21.06.2015.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Provider {

     public String name;

    /**
     */
    public Category category;

    /**
     */
    private Float locationLat;

    /**
     */
    private Float locationLong;

    /**
     */
    private String imageUrl;

    /**
     */
    private byte[] image;

    /**
     */
    private String description;

    /**
     */
    public String phoneNumber;

    /**
     */
    private String menuHtml;

    private Long id;

}
