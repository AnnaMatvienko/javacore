package com.kitcenter.runners.homework.lesson15EnumerationGenerics;

import com.kitcenter.app.homework.lesson15EnumerationGenerics.AllTasks;
import com.kitcenter.runners.homework.lesson12oopEncapsulationInheritance.HumanRunner;
import com.kitcenter.runners.homework.lesson12oopEncapsulationInheritance.WhiteCollarRunner;
import com.kitcenter.runners.homework.lesson13OOPpolymorphismInheritanceComposition.BicycleWithRingAndCustomRunner;
import com.kitcenter.runners.homework.lesson13OOPpolymorphismInheritanceComposition.BouquetRunner;
import com.kitcenter.runners.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.FootballClubRunner;
import com.kitcenter.runners.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.HouseRunner;
import com.kitcenter.runners.homework.lesson14EqualsHashCodeDefaultMethodsInterfaces.TractorRunner;
import com.kitcenter.runners.homework.lesson4ClassMethodVariable.PrimitiveConverterRunner;
import com.kitcenter.runners.homework.lesson5UnitTesting.AllMathFuncsRunner;
import com.kitcenter.runners.homework.lesson7_1LoopsSwitchArrays.*;
import com.kitcenter.runners.homework.lesson9SwitchString.PalindromeOrNotRunner;
import com.kitcenter.runners.homework.lesson9SwitchString.PalindromeSentenceOrNotRunner;

import java.util.Scanner;

public class AllTasksRunner {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose menu item that should be executed:");
            System.out.println("Run PRIMITIVECONVERTER");
            System.out.println("Run ALLMATHFUNCS");
            System.out.println("Run ARRAYTASK1EVEN");
            System.out.println("Run ARRAYTASK2ODD");
            System.out.println("Run ARRAYTASK3RANDOM");
            System.out.println("Run ARRAYTASK4RANDOMBIG");
            System.out.println("Run ARRAYTASK5D2");
            System.out.println("Run ARRAYTASK6D2ALIGNMENT");
            System.out.println("Run TASK7SUMACCUMULATION");
            System.out.println("Run PALINDROMEORNOT");
            System.out.println("Run PALINDROMESENTENCEORNOT");
            System.out.println("Run HUMAN");
            System.out.println("Run WHITECOLLAR");
            System.out.println("Run BICYCLEWITHRINGANDCUSTOM");
            System.out.println("Run BOUQUET");
            System.out.println("Run FOOTBALLCLUB");
            System.out.println("Run HOUSE");
            System.out.println("Run TRACTOR");
            System.out.println("Run EXIT to exit the menu");

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please, enter menu item to run: ");
                String item = scanner.next();
                AllTasks menuItem = AllTasks.valueOf(item.toUpperCase());
                switch (menuItem) {
                    case PRIMITIVECONVERTER: {
                        String[] arg = {"Primitive converter"};
                        PrimitiveConverterRunner.main(arg);
                        break;
                    }

                    case ALLMATHFUNCS: {
                        String[] arg = {"All MATH functions"};
                        AllMathFuncsRunner.main(arg);
                        break;
                    }

                    case ARRAYTASK1EVEN: {
                        String[] arg = {"Array task1 even"};
                        ArrayTask1evenRunner.main(arg);
                        break;
                    }

                    case ARRAYTASK2ODD: {
                        String[] arg = {"Array task2 odd"};
                        ArrayTask2oddRunner.main(arg);
                        break;
                    }

                    case ARRAYTASK3RANDOM: {
                        String[] arg = {"Array task3 random"};
                        ArrayTask3randomRunner.main(arg);
                        break;
                    }

                    case ARRAYTASK4RANDOMBIG: {
                        String[] arg = {"Array task4 random big"};
                        ArrayTask4randomBigRunner.main(arg);
                        break;
                    }

                    case ARRAYTASK5D2: {
                        String[] arg = {"Array task5 D2"};
                        ArrayTask5d2Runner.main(arg);
                        break;
                    }

                    case ARRAYTASK6D2ALIGNMENT: {
                        String[] arg = {"Array task6 D2 alignment"};
                        ArrayTask6d2AlignmentRunner.main(arg);
                        break;
                    }

                    case TASK7SUMACCUMULATION: {
                        String[] arg = {"Task7 sum accumulation"};
                        Task7sumAccumulationRunner.main(arg);
                        break;
                    }

                    case PALINDROMEORNOT: {
                        String[] arg = {"Palindrome or not"};
                        PalindromeOrNotRunner.main(arg);
                        break;
                    }

                    case PALINDROMESENTENCEORNOT: {
                        String[] arg = {"Palindrome sentence or not"};
                        PalindromeSentenceOrNotRunner.main(arg);
                        break;
                    }

                    case HUMAN: {
                        String[] arg = {"Human"};
                        HumanRunner.main(arg);
                        break;
                    }

                    case WHITECOLLAR: {
                        String[] arg = {"Whitecollar"};
                        WhiteCollarRunner.main(arg);
                        break;
                    }

                    case BICYCLEWITHRINGANDCUSTOM: {
                        String[] arg = {"Bicycle with ring and custom"};
                        BicycleWithRingAndCustomRunner.main(arg);
                        break;
                    }

                    case BOUQUET: {
                        String[] arg = {"Bouquet"};
                        BouquetRunner.main(arg);
                        break;
                    }

                    case FOOTBALLCLUB: {
                        String[] arg = {"Football club"};
                        FootballClubRunner.main(arg);
                        break;
                    }

                    case HOUSE: {
                        String[] arg = {"House"};
                        HouseRunner.main(arg);
                        break;
                    }

                    case TRACTOR: {
                        String[] arg = {"Tractor"};
                        TractorRunner.main(arg);
                        break;
                    }

                    case EXIT:
                        System.out.println("You choose exiting the menu, goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid menu item. Make another choice.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error!! Only items from the list should be entered!!");
            }
        }
    }
}
