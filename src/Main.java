import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ebob=1,ekok=1,Number1,Number2,i=1,j=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        Number1  = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        Number2 = input.nextInt();



        while (i <= Number1 && i<=Number2){
            if (Number1 % i == 0 && Number2 % i ==0) {
                ebob=i;
            }   i++;
        }   System.out.println("Ebob: "+ebob);


        while(j <=Number1*Number2){
            if(j % Number1==0 && j % Number2==0){
                ekok =j;
                break;
            }   j++;
        }
        System.out.print("Ekok: "+ekok);


    }

}

