package Algorithms;

import java.util.Scanner;

/**
 * Created by Sheikh Muhammad on 15-03-16.
 */
public class EnCryCodeAlg_1 {

    /**
     * Created by Sheikh Muhammad on 09-03-16.
     */


        public static char[] ch;
        public static char[] sh;
        public static char[] ph;
        public static int[] arr;
        public static int[] rrr;
        public static  String s="";
        public static char p;
        public String Enscriptted(String s){
            ch=s.toCharArray();
            arr=new int[ch.length];
            rrr=new int[ch.length];
            sh=new char[ch.length];
            for(int i=0;i<ch.length;i++){
                p=ch[i];
                switch(p){
                    case 'a':
                        arr[i]=1;
                        break;
                    case 'b':
                        arr[i]=2;
                        break;
                    case 'c':
                        arr[i]=3;
                        break;
                    case 'd':
                        arr[i]=4;
                        break;
                    case 'e':
                        arr[i]=5;
                        break;
                    case 'f':
                        arr[i]=6;
                        break;
                    case 'g':
                        arr[i]=7;
                        break;
                    case 'h':
                        arr[i]=8;
                        break;
                    case 'i':
                        arr[i]=9;
                        break;
                    case 'j':
                        arr[i]=10;
                        break;
                    case 'k':
                        arr[i]=11;
                        break;
                    case 'l':
                        arr[i]=12;
                        break;
                    case 'm':
                        arr[i]=13;
                        break;
                    case 'n':
                        arr[i]=14;
                        break;
                    case 'o':
                        arr[i]=15;
                        break;
                    case 'p':
                        arr[i]=16;
                        break;
                    case 'q':
                        arr[i]=17;
                        break;
                    case 'r':
                        arr[i]=18;
                        break;
                    case 's':
                        arr[i]=19;
                        break;
                    case 't':
                        arr[i]=20;
                        break;
                    case 'u':
                        arr[i]=21;
                        break;
                    case 'v':
                        arr[i]=22;
                        break;
                    case 'w':
                        arr[i]=23;
                        break;
                    case 'x':
                        arr[i]=24;
                        break;
                    case 'y':
                        arr[i]=25;
                        break;
                    case 'z':
                        arr[i]=26;
                        break;



                }
            }
            for(int i=0;i<ch.length;i++){
                if(i%2==0) {
                    rrr[i] = (arr[i] + 17) % 26;
                }else{
                    rrr[i] = (arr[i] + 11) % 26;
                }
            }
            for(int i=0;i<ch.length;i++){
                int n=rrr[i];
                switch(n){
                    case 1:
                        sh[i]='a';
                        break;
                    case 2:
                        sh[i]='b';
                        break;

                    case 3:
                        sh[i]='c';
                        break;
                    case 4:
                        sh[i]='d';
                        break;
                    case 5:
                        sh[i]='e';
                        break;
                    case 6:
                        sh[i]='f';
                        break;
                    case 7:
                        sh[i]='g';
                        break;

                    case 8:
                        sh[i]='h';
                        break;
                    case 9:
                        sh[i]='i';
                        break;
                    case 10:
                        sh[i]='j';
                        break;
                    case 11:
                        sh[i]='k';
                        break;
                    case 12:
                        sh[i]='l';
                        break;

                    case 13:
                        sh[i]='m';
                        break;
                    case 14:
                        sh[i]='n';
                        break;
                    case 15:
                        sh[i]='o';
                        break;
                    case 16:
                        sh[i]='p';
                        break;
                    case 17:
                        sh[i]='q';
                        break;

                    case 18:
                        sh[i]='r';
                        break;
                    case 19:
                        sh[i]='s';
                        break;
                    case 20:
                        sh[i]='t';
                        break;

                    case 21:
                        sh[i]='u';
                        break;
                    case 22:
                        sh[i]='v';
                        break;

                    case 23:
                        sh[i]='w';
                        break;
                    case 24:
                        sh[i]='x';
                        break;
                    case 25:
                        sh[i]='y';
                        break;
                    case 26:
                        sh[i]='z';
                        break;


                }
            }

            String v=new String(sh);

            return  v;

        }
        public  void Decrypted(String s){
            ch=s.toCharArray();
            arr=new int[ch.length];
            rrr=new int[ch.length];
            sh=new char[ch.length];

            for(int i=0;i<ch.length;i++){
                p=ch[i];
                switch(p){
                    case 'a':
                        arr[i]=1;
                        break;
                    case 'b':
                        arr[i]=2;
                        break;
                    case 'c':
                        arr[i]=3;
                        break;
                    case 'd':
                        arr[i]=4;
                        break;
                    case 'e':
                        arr[i]=5;
                        break;
                    case 'f':
                        arr[i]=6;
                        break;
                    case 'g':
                        arr[i]=7;
                        break;
                    case 'h':
                        arr[i]=8;
                        break;
                    case 'i':
                        arr[i]=9;
                        break;
                    case 'j':
                        arr[i]=10;
                        break;
                    case 'k':
                        arr[i]=11;
                        break;
                    case 'l':
                        arr[i]=12;
                        break;
                    case 'm':
                        arr[i]=13;
                        break;
                    case 'n':
                        arr[i]=14;
                        break;
                    case 'o':
                        arr[i]=15;
                        break;
                    case 'p':
                        arr[i]=16;
                        break;
                    case 'q':
                        arr[i]=17;
                        break;
                    case 'r':
                        arr[i]=18;
                        break;
                    case 's':
                        arr[i]=19;
                        break;
                    case 't':
                        arr[i]=20;
                        break;
                    case 'u':
                        arr[i]=21;
                        break;
                    case 'v':
                        arr[i]=22;
                        break;
                    case 'w':
                        arr[i]=23;
                        break;
                    case 'x':
                        arr[i]=24;
                        break;
                    case 'y':
                        arr[i]=25;
                        break;
                    case 'z':
                        arr[i]=26;
                        break;



                }
            }


            char[] dh=new char[ch.length];
            for(int i=0;i<ch.length;i++){

                if(i%2==0) {
                    rrr[i] = (arr[i] - 17) % 26;
                }else{
                    rrr[i] = (arr[i] -11) % 26;
                }


            }
            for(int i=0;i<ch.length;i++){
                int n=rrr[i];
                switch(n){
                    case 1:
                        sh[i]='a';
                        break;
                    case 2:
                        sh[i]='b';
                        break;

                    case 3:
                        sh[i]='c';
                        break;
                    case 4:
                        sh[i]='d';
                        break;
                    case 5:
                        sh[i]='e';
                        break;
                    case 6:
                        sh[i]='f';
                        break;
                    case 7:
                        sh[i]='g';
                        break;

                    case 8:
                        sh[i]='h';
                        break;
                    case 9:
                        sh[i]='i';
                        break;
                    case 10:
                        sh[i]='j';
                        break;
                    case 11:
                        sh[i]='k';
                        break;
                    case 12:
                        sh[i]='l';
                        break;

                    case 13:
                        sh[i]='m';
                        break;
                    case 14:
                        sh[i]='n';
                        break;
                    case 15:
                        sh[i]='o';
                        break;
                    case 16:
                        sh[i]='p';
                        break;
                    case 17:
                        sh[i]='q';
                        break;

                    case 18:
                        sh[i]='r';
                        break;
                    case 19:
                        sh[i]='s';
                        break;
                    case 20:
                        sh[i]='t';
                        break;

                    case 21:
                        sh[i]='u';
                        break;
                    case 22:
                        sh[i]='v';
                        break;

                    case 23:
                        sh[i]='w';
                        break;
                    case 24:
                        sh[i]='x';
                        break;
                    case 25:
                        sh[i]='y';
                        break;
                    case 26:
                        sh[i]='z';
                        break;


                }
            }


            String y=new String(sh);
            System.out.println(y);



        }

        public static void main(String[] args) {
            EnCryCodeAlg_1 k=new EnCryCodeAlg_1();
            Scanner ii=new Scanner(System.in);
            s=ii.nextLine();
            String s1= k.Enscriptted(s);
            System.out.println(s1);

            k.Decrypted(s1);




        }

    }


