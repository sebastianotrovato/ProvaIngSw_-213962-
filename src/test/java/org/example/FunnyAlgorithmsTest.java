package org.example;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.joda.time.DateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class FunnyAlgorithmsTest {

    private static int[] numBinarySearch = {};
    private int[] numSelectionSort = {};
    private static String numToConvert;
    private static int correct = 23456;
    private static int[] selectionOrder = {};

    @BeforeClass
    public static void initializeAll(){
        numBinarySearch = new int[]{10, 20, 30, 40, 50, 60, 70, 80};
        selectionOrder = new int[]{7,12,23,43,44,55,56,76,89};
        numToConvert = "23456";
    }

    @Before
    public void initialize(){
        numSelectionSort = new int[]{43,56,23,12,76,89,7,44,55};
    }

    @Test(timeout=500)
    public void BinarySearchIsFastEnough(){
        DateTime inizio = new DateTime();
        System.out.println(inizio);
        FunnyAlgorithms f = new FunnyAlgorithms();
        f.binarySearch(numBinarySearch,80);
        System.out.println("Binary search is really FAST!");
        DateTime fine = new DateTime();
        System.out.println(fine);
    }

}
