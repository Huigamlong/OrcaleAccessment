package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.util.ArrayUtils;

@Component
public class Fibonacii {
    public List<Integer> fibonacii(int N) {
        List<Integer> fibonacci = new ArrayList<Integer>();
        int num1 = 0, num2 = 1;
        int counter = 0;
        while (counter < N) {
            fibonacci.add(num1);
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter++;
        }
        return fibonacci;
    }

    public List<Integer> sorted(List<Integer> list) {
        Integer[] arr = list.toArray(new Integer[0]);

        // Current indexes from left and right
        int l = 0, r = arr.length - 1;
        // Count the odd numbers
        int k = 0;
        while (l < r) {
            // Find the even number from left side
            while (arr[l] % 2 != 0) {
                l++;
                k++;
            }

            // Find the odd number from right side
            while (arr[r] % 2 == 0 && l < r)
                r--;

            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        Arrays.sort(arr, 0, k, Collections.reverseOrder());
        Arrays.sort(arr, k, list.size(), Collections.reverseOrder());

        // List<Integer> arrlist = Arrays.asList(arr);
        // Collections.reverse(arrlist);
        return Arrays.asList(arr);
    }
}
