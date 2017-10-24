package com.kitcenter.app.homework.lesson15EnumerationGenerics;

public enum GuessingGame {
    MIKHAILLERMONTOV("Mikhail Lermontov", 26, "dead"),
    ELONMUSK("Elon Musk", 46, "alive"),
    BILLGATES("Bill Gates", 61, "alive"),
    ADAROGOVTSEVA("Ada Rogovtseva", 80, "alive");

    private String personName;
    private int age;
    private String aliveStatus;

    GuessingGame(String personName, int age, String aliveStatus) {
        this.personName = personName;
        this.age = age;
        this.aliveStatus = aliveStatus;
    }

    public String getPersonName() {
        return personName;
    }

    public int getAge() {
        return age;
    }

    public String getAliveStatus() {
        return aliveStatus;
    }
}
