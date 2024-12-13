package org.semenenya.searchemailandphonenumber.viev;

import java.util.List;

public class Response {
    private List<String> email;
    private List<String> phoneNumber;

    public List<String> getEmail() {
        return email;
    }
    public void setEmail(List<String> email) {
        this.email = email;
    }
    public List<String> getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(List<String> telephoneNumber) {
        phoneNumber = telephoneNumber;
    }
}
