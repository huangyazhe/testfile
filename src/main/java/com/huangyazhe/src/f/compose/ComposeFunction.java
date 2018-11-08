package com.huangyazhe.src.f.compose;

/**
 * Created with IntelliJ IDEA.
 * User: huangyazhe
 * Date: 2018/11/8
 * Time: 21:19
 */
public class ComposeFunction {

    Function<Integer, Integer> function1 = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer arg) {
            return arg * 2;
        }
    };

    Function<Integer, Integer> function2 = new Function<Integer, Integer>() {
        public Integer apply(Integer arg) {
            return arg * arg;
        }
    };

    Function<String,String> function3 = new Function<String, String>() {
        @Override
        public String apply(String arg) {
            return "hi "+arg;
        }
    };

    Function<Integer, Integer> compose = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer arg) {
            return function1.apply(function2.apply(2));
        }
    };

    /**
     * 聚合函数
     */
    Function<String,String> res = new Function<String, String>() {
        @Override
        public String apply(String arg) {
            return function3.apply(function1.apply(function2.apply(Integer.parseInt(arg))).toString());
        }
    };

    /**
     * 简化函数
     */
    Function<Integer, Integer> triple = (Integer x) -> x * 3;

    public static void main(String[] args) {
        ComposeFunction composeFunction = new ComposeFunction();
        Integer num = composeFunction.function1.apply(3);
        System.out.println(num);

        Integer num1 = composeFunction.function2.apply(3);
        System.out.println(num1);

        String text = composeFunction.function3.apply("huangyz");
        System.out.println(text);

        Integer compose = composeFunction.compose.apply(3);
        System.out.println(compose);

        String res = composeFunction.res.apply("5");
        System.out.println(res);


        System.out.println(composeFunction.triple.apply(3));

    }



}
