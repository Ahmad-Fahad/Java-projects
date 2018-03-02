package Algorithms;

import java.util.Scanner;

/**
 * Created by Sheikh Muhammad on 15-03-16.
 */
public class EnCryCodeAlg_2 {
    public static EnCryCodeAlg_2 k=new EnCryCodeAlg_2();
    public int CharToCode(char c){
        int arr=0;
        switch(c){
            case 'a':
                arr=28;
                break;
            case 'b':
                arr=15;
                break;
            case 'c':
                arr=41;
                break;
            case 'd':
                arr=70;
                break;
            case 'e':
                arr=18;
                break;
            case 'f':
                arr=25;
                break;
            case 'g':
                arr=62;
                break;
            case 'h':
                arr=31;
                break;
            case 'i':
                arr=22;
                break;
            case 'j':
                arr=57;
                break;
            case 'k':
                arr=39;
                break;
            case 'l':
                arr=47;
                break;
            case 'm':
                arr=71;
                break;
            case 'n':
                arr=36;
                break;
            case 'o':
                arr=3;
                break;
            case 'p':
                arr=59;
                break;
            case 'q':
                arr=12;
                break;
            case 'r':
                arr=67;
                break;
            case 's':
                arr=37;
                break;
            case 't':
                arr=16;
                break;
            case 'u':
                arr=56;
                break;
            case 'v':
                arr=43;
                break;
            case 'w':
                arr=6;
                break;
            case 'x':
                arr=1;
                break;
            case 'y':
                arr=77;
                break;
            case 'z':
                arr=9;
                break;

            case ' ':
                arr=61;
                break;
            case '!':
                arr=14;
                break;
            case '#':
                arr=74;
                break;
            case '$':
                arr=5;
                break;
            case '%':
                arr=60;
                break;
            case '^':
                arr=80;
                break;
            case '&':
                arr=11;
                break;
            case '*':
                arr=50;
                break;
            case '(':
                arr=45;
                break;
            case ')':
                arr=24;
                break;
            case '-':
                arr=63;
                break;
            case '_':
                arr=38;
                break;
            case '+':
                arr=52;
                break;
            case '=':
                arr=79;
                break;
            case '{':
                arr=40;
                break;
            case '}':
                arr=63;
                break;
            case '[':
                arr=8;
                break;
            case ']':
                arr=66;
                break;
            case '|':
                arr=49;
                break;
            case '<':
                arr=76;
                break;
            case '>':
                arr=20;
                break;
            case ',':
                arr=32;
                break;
            case '.':
                arr=73;
                break;
            case '/':
                arr=26;
                break;
            case '?':
                arr=78;
                break;
            case '@':
                arr=4;
                break;

            case 'A':
                arr=76;
                break;
            case 'B':
                arr=27;
                break;
            case 'C':
                arr=64;
                break;
            case 'D':
                arr=42;
                break;
            case 'E':
                arr=17;
                break;
            case 'F':
                arr=72;
                break;
            case 'G':
                arr=21;
                break;
            case 'H':
                arr=44;
                break;
            case 'I':
                arr=23;
                break;
            case 'J':
                arr=69;
                break;
            case 'K':
                arr=51;
                break;
            case 'L':
                arr=30;
                break;
            case 'M':
                arr=58;
                break;
            case 'N':
                arr=46;
                break;
            case 'O':
                arr=29;
                break;
            case 'P':
                arr=13;
                break;
            case 'Q':
                arr=7;
                break;
            case 'R':
                arr=48;
                break;
            case 'S':
                arr=65;
                break;
            case 'T':
                arr=19;
                break;
            case 'U':
                arr=10;
                break;
            case 'V':
                arr=75;
                break;
            case 'W':
                arr=2;
                break;
            case 'X':
                arr=68;
                break;
            case 'Y':
                arr=33;
                break;
            case 'Z':
                arr=53;
                break;






        }


        return arr;
    }
    public char CodeToChar(int n){
        char arr='\0';


        return ' ';
    }
    public String Encrypt(String s){
        return s;
    }
    public String Decrypt(String s){
        return s;
    }

    public static void main(String[] args) {
        String s;
        Scanner ii=new Scanner(System.in);
        s=ii.nextLine();
        String E=k.Encrypt(s);
        System.out.println(E);
        String D=k.Decrypt(E);
        System.out.println(D);

    }
}
