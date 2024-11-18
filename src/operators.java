public class operators {
    public static void main (String[] arg){
        double x =20.00;
        double y = 80.00;
        double z = (x=y)*100;
        System.out.println(z);
         double r = z % 40;
         System.out.println(r);


         boolean ifTrue = r == 0.00 ? true : false;
         if (ifTrue){
             System.out.print("the remainder is " +r);
         }

    }
}
