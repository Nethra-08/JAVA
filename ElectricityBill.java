package electricitybill;
import java.util.Scanner;
public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type;
        int unit;
        double amount=0;
        System.out.println("Connection type:");
        type=sc.nextLine();
        System.out.println("Units consumed:");
        unit=sc.nextInt();
        if (type.equalsIgnoreCase("Domestic"))
            if(unit<=100)
                amount=0;
            else if (unit<=200)
                amount=(unit-100)*2;
            else if(unit<=500)
                amount=(100*2)+(unit-100)*4;
            else
                amount=(100*2)+(300*4)+(unit-500)*6;
        else if(type.equalsIgnoreCase("Commercial"))
        {
            if(unit<=100)
                amount=unit*2;
            else if (unit<=200)
                amount=(100*2)+(unit-100)*4;
            else if(unit<=500)
                amount=(100*2)+(100*4)+(unit-200)*6;
            else
                amount=(100*2)+(100*4)+(300*6)+(unit-500)*7;
        }
        System.out.println("Amount to be paid:Rs."+(int)amount);
       
    }
   
}
