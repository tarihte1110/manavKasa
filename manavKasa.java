import java.util.*;
public class manavKasa {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int armut,elma,domates,muz,patlıcan;

        System.out.print("Armut kaç kilo:");
        armut= input.nextInt();
        System.out.print("Elma kaç kilo:");
        elma= input.nextInt();
        System.out.print("Domates kaç kilo:");
        domates= input.nextInt();
        System.out.print("Muz kaç kilo:");
        muz= input.nextInt();
        System.out.print("Patlıcan kaç kilo:");
        patlıcan= input.nextInt();

        double x=(2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5.0*patlıcan);

        System.out.print("Toplam tutar:"+x);






    }
}
