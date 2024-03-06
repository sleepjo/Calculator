package com.ohgiraffers.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App {
    static int n1, n2, ans;
    static char op;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        do{
            System.out.println("quit: 0 + 0");
            System.out.print("Input: ");
            st = new StringTokenizer(br.readLine());
            n1 = Integer.parseInt(st.nextToken());
            op = st.nextToken().charAt(0);
            n2 = Integer.parseInt(st.nextToken());
            if(n1 == n2 && n1 ==0) break;
            switch(op){
                case '+':
                    ans = add(n1,n2);
                    break;

                case '-':
                    ans = subtract(n1,n2);
                    break;
                case '*':
                    ans = multiply(n1,n2);
                    break;
                case '/':
                    ans = divide(n1,n2);
                    break;
                case '%':
                    ans = modular(n1,n2);
                    break;
            }


            System.out.println("Output: "+ ans);


        } while(true);
    }



    public static int add(int x, int y){
        return 0;
    }

    public static int subtract(int x, int y){
        return 0;
    }

    public static int multiply(int x, int y){
        return 0;
    }
    public static int divide(int x, int y){
        return 0;
    }

    public static int modular(int x, int y){
        return 0;
    }


}
