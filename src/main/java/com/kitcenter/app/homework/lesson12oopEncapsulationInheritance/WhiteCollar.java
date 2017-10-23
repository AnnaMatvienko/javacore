package com.kitcenter.app.homework.lesson12oopEncapsulationInheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhiteCollar extends Human {
    private String companyName;

    public WhiteCollar(int age, String name, String companyName) {
        super(age, name);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        Pattern p = Pattern.compile("^[a-zA-Z_-]+");
        Matcher m = p.matcher(companyName);
        if (m.matches() == true) {
            this.companyName = companyName;
            System.out.println(companyName);
        } else
            System.out.println(companyName + ": Company name is invalid");
    }
}
