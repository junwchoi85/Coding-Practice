package com.hackerrank.thirtydays;

import java.util.Arrays;
import java.util.*;

public class Testing {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {
        public static int[] get_array() {
            return new int[0];
        }
    }

    /**
     * return an array of size at least 2 with all unique elements,
     * while method get_expected_result() of this class has to return the expected minimum value index for this array.
     */
    static class TestDataUniqueValues {
        private static int[] seq;

        public static int[] get_array() {
            //  complete this function
            Random random = new Random();
            seq = new int[10];
            for(int i=0; i<10; i++) {
//                seq[i] = random.nextInt(100);
                seq[i] = i;
            }
            return seq;
        }

        public static int get_expected_result() {
            // complete this function
            return 0;
        }
    }

    /*
     has to return an array where there are exactly two different minimum values,
     while method get_expected_result() of this class has to return the expected minimum value index for this array.
     */
    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            // complete this function
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<9; i++) {
                list.add(i);
            }
            list.add(0);
            Collections.shuffle(list, new Random());

            Integer[] seq = new Integer[10];
            seq = list.toArray(seq);
            int[] result= Arrays.stream(seq).mapToInt(Integer::intValue).toArray();
            return result;
        }

        public static int get_expected_result() {
            // complete this function
            return 0;
        }
    }


    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}
