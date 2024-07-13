
public class Review01 {
 // 消費税率を定数として定義
    private static final double TAX_RATE = 0.10;

    // taxメソッド：消費税額を計算して整数値で返す
    public static int tax(int price) {
        // 消費税額を計算
        double taxAmount = price * TAX_RATE;
        // 小数点以下を切り捨てて整数値に変換
        return (int) taxAmount;
    }

    // mainメソッド：税込価格を計算して表示
    public static void main(String[] args) {
        // 商品価格を指定（例：1000円）
        int price = 1000;

        // taxメソッドを呼び出して消費税額を取得
        int taxAmount = tax(price);

        // 税込価格を計算
        int totalPrice = price + taxAmount;

        // 結果を表示
        System.out.println(price + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。");
    }
}
    

