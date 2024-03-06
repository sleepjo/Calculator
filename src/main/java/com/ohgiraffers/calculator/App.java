package com.ohgiraffers.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        do{
            st = new StringTokenizer(br.readLine());


        } while(true);
    }



    public static int add(int x, int y){
        return x+y;

    }
    public static int subtract(int x, int y){
        return 0;
    }

    public static int divide(int x, int y){
        return 0;

    }

    public static int modular(int x, int y){
        return 0;
    }


}
