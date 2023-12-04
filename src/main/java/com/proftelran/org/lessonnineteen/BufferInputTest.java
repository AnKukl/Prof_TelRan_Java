package com.proftelran.org.lessonnineteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInputTest {

    public static void main(String[] args) {

//          InputStream in = System.in;
//          InputStreamReader inputStreamReader = new InputStreamReader(in);
//          BufferedReader reader = new BufferedReader(inputStreamReader);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}
