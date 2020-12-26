package com.scratchcat458.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListModifier {
    String[] addToString(String[] arr, String r) {
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        list.add(r);
        arr = list.toArray(new String[0]);
        return arr;
    }

    String[] removeFromString(String[] arr, String r) {
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        list.remove(r);
        arr = list.toArray(new String[0]);
        return arr;
    }
}
