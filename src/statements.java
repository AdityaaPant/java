import javax.sound.midi.SysexMessage;

public class statements {
    public static void main(String[] args){
        System.out.println("Hello World");

        int topScore = 70;
        if (topScore < 100){
            System.out.println("you got the high score");
        }

        int secondTopScore = 80;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("greater than the second top score and less than 100");
        }
        if (topScore < secondTopScore  ){
            System.out.println("the new top score is " + secondTopScore + " \n the old score was" + topScore );
        }


        String manuf = "tata";
        boolean isDomestic = manuf == "tata" ? true :false ;
        if(isDomestic){
            System.out.println("domestic");
        }
        String s = (isDomestic) ?"this car is domestic " : "this car isnt domestic ";
        System.out.println(s);

    }
}
