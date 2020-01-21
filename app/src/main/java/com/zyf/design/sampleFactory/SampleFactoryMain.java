package com.zyf.design.sampleFactory;

/**
 * Created by zyf on 2020/1/20.
 */
public class SampleFactoryMain {

    public static void main(String[] args) {
        Operation operation = OperationFactory.INSTANCE.createOperate("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
