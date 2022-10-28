package org.example;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FunnyAlgorithmsTest {

    private static int[] numBinarySearch = {};
    private int[] numSelectionSort = {};
    private static String numToConvert;
    private static int correct = 23456;
    private static int[] selectionOrder = {};
    private static int[] selectionOrderReverse = {};

    @BeforeClass
    public static void initializeAll(){
        numBinarySearch = new int[]{10, 20, 30, 40, 50, 60, 70, 80};
        selectionOrder = new int[]{7,12,23,43,44,55,56,76,89};
        selectionOrderReverse = new int[]{89,76,56,55,44,43,23,12,7};
        numToConvert = "23456";
    }

    @Before
    public void initialize(){
        System.out.println("New test incoming");
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

    @Test
    public void binarySearchShouldFail(){
        DateTime inizio = new DateTime();
        System.out.println(inizio);
        FunnyAlgorithms f = new FunnyAlgorithms();
        Integer result = f.binarySearch(numBinarySearch,75);
        assertTrue(result.equals(-1));
        DateTime fine = new DateTime();
        System.out.println(fine);
    }

    @Test
    public void shouldAnswerWithTrueForSelectionSort(){
        DateTime inizio = new DateTime();
        System.out.println(inizio);
        FunnyAlgorithms f = new FunnyAlgorithms();
        f.selectionSort(numSelectionSort,1);
        assertEquals(Arrays.toString(numSelectionSort),(Arrays.toString(selectionOrder)));
        DateTime fine = new DateTime();
        System.out.println(fine);
    }

    @Test
    public void shouldAnswerWithTrueConverter(){
        DateTime inizio = new DateTime();
        System.out.println(inizio);
        FunnyAlgorithms f = new FunnyAlgorithms();
        int result = f.stringToIntConverter(numToConvert);
        assertEquals(result,correct);
        DateTime fine = new DateTime();
        System.out.println(fine);
    }

}
