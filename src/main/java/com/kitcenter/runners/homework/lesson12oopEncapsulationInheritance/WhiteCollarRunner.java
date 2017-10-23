package com.kitcenter.runners.homework.lesson12oopEncapsulationInheritance;

import com.kitcenter.app.homework.lesson12oopEncapsulationInheritance.WhiteCollar;

import java.util.Scanner;

public class WhiteCollarRunner {
    public static void main(String[] args) {
        WhiteCollar whitecollar = new WhiteCollar(31, "Anna", "HM");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the company name:");
        String companyName = scanner.next();
        whitecollar.setCompanyName(companyName);
    }
}
