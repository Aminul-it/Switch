
package pkgswitch;

import java.util.Scanner;


public class Switch {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks:");
        int markes=sc.nextInt();
        
        int range=markes/10;
        switch(range){
            case 9:
                System.out.println("A+");
                break;
                
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("A-");
                break;
            default:
                System.out.println("F");
                
            }
        
        
    }
    }
    

