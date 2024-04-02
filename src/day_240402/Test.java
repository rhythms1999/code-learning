package day_240402;
/**
 * Practice
 * <p>
 * 例：<br>
 * 双十一，京东有优惠活动：<br>
 * - 满 400 元減 50元<br>
 * - 抵扣时会优先使用`无门槛抵用券`，再执行满减政策<br>
 * <p><br>
 * 你：<br>
 * 购物车中有总价 10000 元的待下单商品<br>
 * - 同时，你有一张 200.3 元的`无门槛抵用券`<br>
 * <p><br>
 * 问：<br>
 * - 最理想的情况下，你需要支付多少钱，把购物车中的原价 10000 元的商品全部买走？
 */

public class Test {
    public static void main(String[] args) {
        double price = 10000 - 200.3;//减去无门槛后的价格
        int a = (int)(price / 400);//满400减50的次数
        double pay = price - 50*a;//减去优惠价格
        System.out.println(pay);
    }
}
