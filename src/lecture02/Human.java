package lecture02;

public class Human { //Humanクラス
    String name; //名前の情報
    int age; //年齢の情報

    Human(String name, int age) { //コンストラクタを設定
        //this演算子により、同名の変数を区別することができる
        this.name = name;
        this.age = age;
    }

        public void print() { //printメソッド
                if (age <= 18) { //もし18以下であれば
                    System.out.println("生徒 "+name+" "+age+"歳です。"); //生徒と表示
                }else if(age >= 19){ //もし19歳以上であれば
                    System.out.println("学生 "+name+" "+age+"歳です。"); //学生と表示
                }
            }
        }
