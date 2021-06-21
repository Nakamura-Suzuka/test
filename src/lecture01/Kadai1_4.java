package lecture01;

public class Kadai1_4 {
    public static void main(String[] args){
        int sum = 0; //sumの宣言と初期化
        int[] array = new int[100]; //要素数100のint型の配列arrayを作る

        for(int i = 0;i < 100; i++){ //int型iの宣言と同時にarray[0]からarray[99]まで繰り返す
            array[i] = i + 1; //iに1を足していき、array[i]に格納
        }
        for(int i = 0;i < 100; i++){
            if(array[i] % 2 == 0){ //array[i]÷2の余りが0の時
                sum = sum + array[i]; //前のsum+array[i]をsumに格納
            }
        }
        //偶数の総和を表示
        System.out.println("sum = "+sum); //sumの結果を表示
    }
}
//今回for文を用いた理由はあらかじめ回数が指定されているから