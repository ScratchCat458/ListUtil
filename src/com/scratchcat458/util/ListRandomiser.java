package com.scratchcat458.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListRandomiser {
    int[] randomiseInt(int[] a, int n) {
        Random r = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }

    String[] randomiseString(String[] a, int n) {
        Random r = new Random();
        for (int i = n-1; i > 0; i--) {
            int j = r.nextInt(i);

            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }
}

