package intro;

//条件演算子（三項演算子）
public class ConditionalOperator {
    public static void main(String[] args) {
        int num = 1;
        String gender = num==1 ? "男":"女";//if命令と代入 ifの代わり 1だけ男 1以外は女
        System.out.println(gender);//男
    }
}
