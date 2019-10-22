/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Scanner;

/**
 *
 * @author yus08
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Input integral part of Binary=");
        int B = input.nextInt();
        System.out.print("Input fractional part of Binary=");
        int BF = input.nextInt();
        float c = 0;
        float cf = 0;
        float d = 0;
        String ms = new Integer(BF).toString();
        int m = ms.length();
        int a = 2;
        int n = ((int)(Math.log10(B)));
        for (int i = 0 ; i<=n ; i++){
            if ((B%2)==1){
                c = (int)(Math.pow(a,i));
            }
            else{
                c = 0;
            }
            d = d + c;
            B = B / 10;
        }
        for (int i=m; i>=1 ; i--){
            if ((BF%10)==1){
                cf = (float)(Math.pow(a,-i));
            }
            else{
                cf = 0;
            }
            BF = BF / 10;
            d = d + cf;
        }
        System.out.println(d);
    }
    
}
