package lecture01;

public class Kadai1_5 {
    public static void main(String[] args) {
        int[] score = {41, 85, 72, 38, 80}; //1年生5人の算数のテストの点数


        seiseki(score); //成績判定
        min(score); //最小値を呼び出す
        max(score); //最大値を呼び出す
        average(score); //平均を呼び出す
    }

    static void seiseki(int[] score) { //seisekiメソッド
        for(int i = 0;i < score.length;i++) {
            if(score[i] < 60) { //
                System.out.println(""+i+"番 "+score[i]+" 不可");
            }else if(60 <= score[i] && score[i]< 70){
                System.out.println(""+i+"番 "+score[i]+" 可");
            }else if(70 <= score[i] && score[i] < 80){
                System.out.println(""+i+"番 "+score[i]+" 良");
            }else if(80 <= score[i] && score[i] < 90){
                System.out.println(""+i+"番 "+score[i]+" 優");
            }else{
                System.out.println(""+i+"番 "+score[i]+" 秀");
            }
        }
    }


        static void min ( int[] score){ //minメソッド
            //最小値minを宣言し、配列の最小値が0の場合もあるため配列の要素の1番目で初期化する
            int min = score[0];

            //1年生5人の点数を調べていく。
            //14行目で1つ目の箱を初期値にしているので条件式は5未満(i<score.length)で良い
            for (int i = 1; i < score.length; i++) {
                if (min > score[i]) { //score[i]がminより小さかった場合
                    min = score[i]; //minに格納される
                }
            }
            System.out.println("最低点 = " + min); //最低点数を表示
        }

        static void max ( int[] score){ //maxメソッド
            int max = score[0];

            for (int i = 1; i < score.length; i++) {
                if (max < score[i]) { //maxよりscore[i]の方が大きかった場合
                    max = score[i]; //maxに格納される
                }
            }
            System.out.println("最高点　= " + max);
        }

        static void average ( int[] score){ //averageメソッド※int型にする
            int sum = 0; //合計はintで良い。初期化する
            for (int i = 0; i < score.length; i++) {
                sum = sum + score[i];
            }

            double average = ((double) sum / score.length); //sumをdoubleでキャストする

            System.out.println("平均点　=　" + average);
        }
    }
