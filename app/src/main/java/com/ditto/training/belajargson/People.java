package com.ditto.training.belajargson;

import com.google.gson.annotations.SerializedName;

public class People {
    @SerializedName("people_name")
    private String peopleName;
    @SerializedName("people_age")
    private int peopleAge;
    @SerializedName("people_mail")
    private String peopleMail;

    public People(String peopleNameku, int peopleAgeku, String peopleMailku) {
        peopleName = peopleNameku;
        peopleAge = peopleAgeku;
        peopleMail = peopleMailku;
    }


}
