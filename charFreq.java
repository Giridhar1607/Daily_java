import java.util.Scanner;

public class charFreq {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String: ");
        String input=sc.nextLine();

        int[] freqcount = new int[256];

        for(int i=0;i<input.length();i++){
            freqcount[input.charAt(i)]++;
        }

        String[] position ={"first","second","third","forth","fifth","sixth","seventh","eighth","ninth","tenth"};
        int count=0;

        for(int i=0;i<input.length();i++){
           char ch=input.charAt(i);

           if(freqcount[ch]==1){
               String positionlabel;

               if(count<position.length){
                   positionlabel=position[count];
               }else{
                   positionlabel=(count+1)+"th";
               }
               System.out.println("The "+positionlabel+" non-repeating char is :"+ch);
               count++;
           }
        }
        if(count==0){
            System.out.println("NO Non-Repeat Character");
        }
    }
}
