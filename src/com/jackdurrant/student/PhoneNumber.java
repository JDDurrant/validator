package com.jackdurrant.student;

/**
 * Created by Administrator on 06/11/2017.
 */
public class PhoneNumber {

    private int countryCode;
    private long phoneNumber;
    private String type = "Mobile";

    public PhoneNumber(int countryCode, long phoneNumber, String type) {

        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public String getPhoneNumber() {

        return String.format("+%d %d", countryCode, phoneNumber);
    }

    public static PhoneNumber parsePhoneNumber(String phoneNumberString) {

        String[] splitPhoneNumber = phoneNumberString.split(" ", 2);

        int countryCode = Integer.parseInt(splitPhoneNumber[0]);
        long phoneNumber = Long.parseLong(splitPhoneNumber[1]);

        return new PhoneNumber(countryCode, phoneNumber, "Mobile");
    }
}
