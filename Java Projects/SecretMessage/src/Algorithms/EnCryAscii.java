package Algorithms;

import java.util.Scanner;

/**
 * Created by Sheikh Muhammad on 05-03-16.
 */
public class EnCryAscii {
    public static void main(String[] args) {
        String s="";
        char[] c;
        char k;
        int n,m,r;
        Scanner ii=new Scanner(System.in);
        s=ii.nextLine();
        c=s.toCharArray();
        int[] a=new int[c.length];
        for(int i=0;i<c.length;i++){
            m=(int)c[i];
            n=m+3;
            r=n%126;
            if(r<=31){
                r=r+31;
            }
            a[i]=r;
        }
        System.out.println("Enscrypt : ");
        for(int i=0;i<c.length;i++){
            k=(char)a[i];
            System.out.print(k);

        }
        System.out.println("\nDecrypt : ");
        for(int i=0;i<c.length;i++){
            m=a[i];
            n=m-3;
            r=n%126;
            if(r<=31){
                r=r+31;
            }
            a[i]=r;
        }
        for(int i=0;i<c.length;i++){
            k=(char)a[i];
            System.out.print(k);

        }
    }
}
