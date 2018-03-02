package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class  scanner {
    public static void main(String[] args) throws IOException {
    	int[] a=new int[4];
    	int m=0;
    	int n=0;
        Scanner s = null;

        try {
            s = new Scanner( new BufferedReader(new FileReader("in.txt")));

            while (s.hasNext()) {
            	a[m]=s.nextInt();//a great clue here
            	n=a[m]+n;
                System.out.println(a[m]+" "+n+" "+m);
            m++;
            }
            
        } finally {
            if (s != null) {
                s.close();
            }
        }
        for(int i=0;i<3;i++){
        	System.out.println(a[i]);
        }
       
    }
}