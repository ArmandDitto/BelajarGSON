package com.ditto.training.belajargson;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

public class People {
    @SerializedName("people_name")
    private String peopleName;
    @SerializedName("people_age")
    private int peopleAge;
    @SerializedName("people_mail")
    private String peopleMail;
    @SerializedName("people_address")
    private Address peopleAddress;

    public People(String peopleNameku, int peopleAgeku, String peopleMailku, Address peopleAddressku) {
        peopleName = peopleNameku;
        peopleAge = peopleAgeku;
        peopleMail = peopleMailku;
        peopleAddress = peopleAddressku;
    }

    public static class Address{
        @SerializedName("address_name")
        private String addressName;
        @SerializedName("address_detail")
        private String addressDetail;
        @SerializedName("address_city")
        private String addressCity;

        public Address(String addressNameku, String addressDetailku, String addressCityku) {
            addressName = addressNameku;
            addressDetail = addressDetailku;
            addressCity = addressCityku;
        }
    }
}
