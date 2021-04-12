package ex;

import java.util.Arrays;

//配列の最大値・最小値・平均値を求める　ifとか使う
public class Ex5 {
    public static void main(String[] args) {
        int[] array = {20, 30, 10, 50, 40};//配列の宣言
        int max = array[0];//仮の最大値
        int min = array[0];//仮の最小値
        int sum = 0;//合計を初期化
        double ave = 0.0;//平均を初期化

        //各値を見つける
        for (int value:array) {
            if (max<value) max = value;//最大値の更新
            if (min>value) min = value;//最小値の更新
            sum += value;//合計の計算
        }
        ave = sum / array.length;//平均を求める

        //結果の出力
        System.out.println(Arrays.toString(array));//元の配列の表示
        System.out.println(String.format("max:%d min:%d ave:%.2f",max,min,ave));

    }
}
