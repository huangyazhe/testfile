package com.huangyazhe.src.juc.future;

/**
 * Created with IntelliJ IDEA.
 * User: huangyazhe
 * Date: 2018/6/29
 * Time: 5:30
 */
public class Main {

    private String returnDate(){

        new Thread() {
            @Override
            public void run() {
                RealData realdata = new RealData();
                //future.setRealData(realdata);
            }
        }.start();

        return "���ȷ���һ�����";
    }

    public static void main(String[] args) {
        Main main = new Main();
        String str = main.returnDate();
        System.out.println(str);
    }

    static class RealData {
        public RealData() {
            System.out.println("�����첽����ܶ�����");
        }
    }
}
