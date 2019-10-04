package com.company;

import jdk.jshell.Diag;
import org.w3c.dom.UserDataHandler;

import java.awt.geom.Area;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        SpeedConverter.printConversion(10);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(-34);

//        barkingDog.shouldWakeUp(true,1);
//        barkingDog.shouldWakeUp(false,6);

//        System.out.println(leapYearCalculator.isLeapYear(1600));

//        DecimalComparator.areEqualByThreeDecimalPlaces(3.1756,3.175);
//
//        System.out.println( secondsAndMinutes.getDurationString(99) );
//
//        System.out.println( secondsAndMinutes.getDurationString(12,99) );
//        System.out.println( secondsAndMinutes.getDurationString(12,9) );

//        System.out.println(AreaCalculator.area(1));
//        System.out.println(AreaCalculator.area(1,2));

//        MinutesToYearsAndDaysCalculator.printYearsAndDays(525600);
//        MinutesToYearsAndDaysCalculator.printYearsAndDays(561600);

//        IntEqualityPrinter.printEqual(1,1,1);
//        IntEqualityPrinter.printEqual(1,1,2);
//        IntEqualityPrinter.printEqual(1,2,3);

//        System.out.println( PlayingCat.isCatPlaying(true,45) );
//        System.out.println( PlayingCat.isCatPlaying(false,45) );
//        System.out.println( PlayingCat.isCatPlaying(false,35) );

//        NumberInWord.printNumberInWord(9);
//        NumberInWord.printNumberInWord(-9);

//        System.out.println(DaysInMonth.getDaysInMonth(2,2000));
//        System.out.println(DaysInMonth.getDaysInMonth(3,2000));
//        System.out.println(DaysInMonth.getDaysInMonth(4,2000));
//        System.out.println(DaysInMonth.getDaysInMonth(2,2001));
//        System.out.println(DaysInMonth.getDaysInMonth(2,2002));
//        System.out.println( DaysInMonth.getDaysInMonth(2,2003));

//        System.out.println(DigitSum.sumDigits(235));
//        System.out.println(NumberPalindrome.isPalindrome(121));
//        System.out.println(NumberPalindrome.isPalindrome(-121));
//        System.out.println(NumberPalindrome.isPalindrome(1));
//        System.out.println(NumberPalindrome.isPalindrome(1321));
//
//        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(5));
//        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(257));

//        System.out.println(EvenDigitSum.getEvenDigitSum(245));
//        System.out.println(SharedDigit.hasSharedDigit(12,43));


//        System.out.println(LastDigitChecker.hasSameLastDigit(9,99,999));
//        System.out.println(LastDigitChecker.hasSameLastDigit(42,32,23));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,36));

//        AllFactors.printFactors(6);
//        System.out.println(PerfectNumber.isPerfectNumber(6));
//        System.out.println(NumberToWords.getDigitCount(100));
//        System.out.println(NumberToWords.reverse(100));
//        NumberToWords.numberToWords(100);
//        NumberToWords.numberToWords(4320);
//        NumberToWords.numberToWords(0);

//        System.out.println(FlourPacker.canPack(1,0,4));
//        System.out.println(FlourPacker.canPack(1,11,9));
//
//        System.out.println(FlourPacker.canPack(2,11,35));
//
//        System.out.println(LargestPrime.getLargestPrime(217));

//        DiagonalStar.printSquareStar(8);

//        InputCalculator.inputThenPrintSumAndAverage();

//        System.out.println(PaintJob.getBucketCount(3,3,1.1,1));
//        System.out.println(PaintJob.getBucketCount(3,3,1.1));
//
//        System.out.println(PaintJob.getBucketCount(3, 0.5));

//        PaintJob.printBucketCount();
//
//            SimpleCalculator calculator = new SimpleCalculator();
//            calculator.setFirstNumber(5);
//            calculator.setSecondNumber(2);
//            System.out.println(calculator.getSecondNumber());
//
//            System.out.println(calculator.getAdditionResult());

//        Person john = new Person();
//        john.setFirstName("John");
//        john.setLastName("Smith");
//        john.setAge(19);
//        System.out.println(john.isTeen());
//        System.out.println(john.getFullName());


//        Wall wall1 = new Wall();
//        Wall wall2 = new Wall(20.3,30.2);
//
//        System.out.println(wall1.getArea());
//        System.out.println(wall2.getArea());

//        Point p1 = new Point();
//        Point p2 = new Point(1,1);
//        Point p3 = new Point(2,2);
//
//        System.out.println(p1.distance());
//        System.out.println(p2.distance());
//        System.out.println(p2.distance(p3));

//        Carpet carpet1 = new Carpet(3.5);
//        Floor floor1 = new Floor(2.75,4);
//
//        Calculator b1cost = new Calculator(floor1,carpet1);
//
//        System.out.println(b1cost.getTotalCost());

//        ComplexNumber c1 = new ComplexNumber(1, 1);
//        ComplexNumber c2 = new ComplexNumber(2, 2);
//
//        c1.add(c2);
//        System.out.println(c1.getReal());
//        System.out.println(c1.getImaginary());
//
//        c1.subtract(c2);
//        System.out.println(c1.getImaginary());
//        System.out.println(c1.getReal());
//
//        c1.add(5,2);
//        System.out.println(c1.getReal());
//        System.out.println(c1.getImaginary());

//        Circle c1 = new Circle(2);
//        c1.getArea();
//
//        Cylinder cl1 = new Cylinder(3,10);
//        System.out.println(cl1.getArea());
//        System.out.println(cl1.getVolume());;

        Rectangle r1 = new Rectangle(2,3);
        Cuboid c1 = new Cuboid(2,1,1);

        System.out.println(c1.getVolume());
        System.out.println(c1.getArea());

    }   // closing for main
}
