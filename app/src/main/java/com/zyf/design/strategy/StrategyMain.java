package com.zyf.design.strategy;

import java.util.Scanner;

/**
 * Created by zyf on 2020/1/20.
 */
public class StrategyMain {

    private static double total = 0.0d;

    public static void main(String[] args) {
        System.out.println("输入 单价,数量 用半角的逗号隔开 ，如18,jack");
        Scanner scanner = new Scanner(System.in);

        while (true){
            String temp = scanner.nextLine();
            if (temp == null||temp.trim().equals("")){
                break;
            }
            String[] princeData = temp.split(",");

            double prince = Double.parseDouble(princeData[0].trim());
            int num = Integer.parseInt(princeData[1].trim());

            String type = "打8折";
            CashContext context = new CashContext(type);
            double totalPrice = context.getResult(prince * num);

            total += totalPrice;
            System.out.println(total);
            System.out.println("可继续输入单价、数量或点击Enter结束");
        }

    }
}
