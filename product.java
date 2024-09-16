package day7;

import java.util.Scanner;

class pro {

    int id;
    String name;
    int price;
    public void details(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the product id ");
        id=sc.nextInt();
        System.out.println("enter the product name ");
        name=sc.next();
        System.out.println("enter the product price ");
        price=sc.nextInt();
    }
    public void total(){

    }
    public void printDetails(){
        System.out.println("the id of the product id "+id);
        System.out.println("the name of the product name "+name);
        System.out.println("the price of the product price "+price);
    }
    
}
public class product {
    public static void main(String[] args) {
        pro[] prod=new pro[5];//creating a array of products
        
        
        for(int i=0;i<prod.length;i++){
            prod[i]=new pro();    
            System.out.println("enter the value of product "+(i+1));      
            prod[i].details();
        }
        for(int i=0;i<prod.length;i++){
            System.out.println("the value of product "+(i+1)+" is");      
            System.out.println();
            prod[i].printDetails();
        }
        int amount =0;
        for(int i=0;i<prod.length;i++){  
            System.out.println();  
           amount+=prod[i].price;
        }
        System.out.println("the total price is "+ amount);
    }
}
