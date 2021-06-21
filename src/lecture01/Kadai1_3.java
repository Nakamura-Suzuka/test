package lecture01;

public class Kadai1_3 {
    public static void main(String[] args){
        int i;
        i = 22;

        int temp = i;

        if(i < 20){ //もし、20歳未満だったら
            System.out.println("I am "+temp+" years old so I cannot drink liquor.");
        }else if(i >= 20){ //20歳以上であれば
            System.out.println("I am "+temp+" years old so I can drink liquor.");
        }
    }
}
