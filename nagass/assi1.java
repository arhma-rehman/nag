import java.util.*;
import java.lang.*;
public class assi1 {
    static String carModel;
    static String carType;
    static double costPrice;
    static String insuranceType;
    static double totalInsurance;

    assi1(String carModel, String carType, double costPrice, String insuranceType, double totalInsurance) {
        this.carModel= carModel;
        this.carType = carType;
        this.costPrice = costPrice;
        this.insuranceType = insuranceType;
        this.totalInsurance =0.0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("“Do you want to enter details of any other car (y/n):");
            ch = sc.nextLine().charAt(0);
            //assi1 obj ;

            if (ch == 'y') {
                assi1 obj = takeinput();
                sol(obj);
            }
        }
        while(ch!='n');


    }

    public static void sol(assi1 ob) {
        if(ob.carType.equalsIgnoreCase("Hatchback")){
            totalInsurance =0.05*(ob.costPrice);
            if(ob.insuranceType.equalsIgnoreCase("premium")){
                totalInsurance = totalInsurance +0.2* totalInsurance;
            }


        }
        else if(ob.carType.equalsIgnoreCase("Sedan")) {
            totalInsurance = 0.08 * (ob.costPrice);
            if (ob.insuranceType.equalsIgnoreCase("premium")) {
                totalInsurance = totalInsurance + 0.2 * totalInsurance;
            }
        }
        else if(ob.carType.equalsIgnoreCase("SUV")) {
            totalInsurance = 0.1 * (ob.costPrice);
            if (ob.insuranceType.equalsIgnoreCase("premium")) {
                totalInsurance = totalInsurance + 0.2 * totalInsurance;
            }
        }
        System.out.println("Car model:"+ob.carModel);
        System.out.println("Cost price:"+ob.costPrice);
        System.out.println("Total insurance:"+ob.totalInsurance);
        System.out.println("insurance type:"+ob.insuranceType);



    }

    public static assi1 takeinput () {
        assi1 ob=null;
        String arr[]=new String[3];
        String arr1[]=new String[2];
        arr[0]="suv";arr[1]="sedan";arr[2]="hatchback";
        arr1[0]="basic";arr1[1]="premium";
        int f1=0,f2=0;

        try {
          Scanner sc = new Scanner(System.in);
          System.out.println("Car model:");
          String carModel = sc.nextLine();
          System.out.println("Car type:");
          String carType = sc.nextLine();
          System.out.println("Insurance Type :");
          String insuranceType = sc.nextLine();
          System.out.println("Cost price:");
          double costPrice = sc.nextDouble();
          int i,j;
          for(i=0;i<arr.length;i++){
              if(carType.equalsIgnoreCase(arr[i]))
                  f1=1;
          }
            for(i=0;i<arr1.length;i++){
                if(insuranceType.equalsIgnoreCase(arr1[i]))
                    f2=1;
            }
            if(f1==1&&f2==1)
                  ob = new assi1(carModel, carType, costPrice, insuranceType, totalInsurance);
            else {
                System.out.println("Error due to incorrect input");
                System.exit(0);
            }






      }
         catch (Exception e) {
            System.out.println(e);

        }


        return ob;


    }

    }

