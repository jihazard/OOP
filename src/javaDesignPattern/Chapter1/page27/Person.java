package javaDesignPattern.Chapter1.page27;

import javaDesignPattern.Chapter1.page26.Phone;

public class Person {
    private Phone homePhone;
    private Phone officePhone;

    public Phone getHomePhone() {
        return homePhone;
    }

    public Person setHomePhone(Phone homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public Phone getOfficePhone() {
        return officePhone;
    }

    public Person setOfficePhone(Phone officePhone) {
        this.officePhone = officePhone;
        return this;
    }
}
