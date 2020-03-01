import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Fortune{
public static void main(String[] args) {
  System.out.println("今日のあなたの運勢を占います");
  System.out.println("誕生を○○月△△日を連続した数字で○○△△と入力して下さい");
//キーボード入力を受けつける

    Scanner scanner = new Scanner(System.in);

    System.out.println("誕生日:");
    int birth = scanner.nextInt(); 
    
    int month = birth/100;
    int day = birth - month*100;
    System.out.println("あなたの誕生日は"+month+"月"+day+"日ですね");
    System.out.println("良ければYes、間違いであればNoと入力して下さい");
    String reply = scanner.next();
        while (!(reply.equals("yes"))){
            System.out.println("再度誕生日を入力してください");
            scanner.nextInt(); 
            System.out.println("あなたの誕生日は"+month+"月"+day+"日ですね");
            System.out.println("良ければYes、間違いであればNoと入力して下さい");
            reply = scanner.next();
        }

    
    System.out.println("OK");
    int r = new Random().nextInt(3);
    System.out.println("名前を入力してください");
    String name = scanner.next();
    byte[] name_byte = name.getBytes();
    int Sum = 0;
    for(int i=0; i<name_byte.length; i++)
        {
            Sum = Sum + name_byte[i];
            //System.out.println(Sum); //全て足し算させれているか確認する 
        }

    int Abs = Math.abs(Sum);
    int Zerocheck = Abs*r;
    //System.out.println(Zerocheck); //Zerocheck内の数字を確認する

if(Zerocheck == 0){
    System.out.println("今日の運勢はbad");
    System.out.println(r); 
}else if(Sum/r != 0 && Sum%r == 0){
    System.out.println("今日の運勢は最高!!!");

    /*
    int Fortune = Abs / r;
    int mod = Abs % r;
    System.out.println(r); 
    System.out.println(Fortune);   
    System.out.println(mod);
    */
}else{
    System.out.println("今日の運勢は普通^_~");
    
    /*
    int Fortune = Abs / r;
    int mod = Abs % r;
    System.out.println(r);  
    System.out.println(Fortune);   
    System.out.println(mod);
    */
}
} 
}