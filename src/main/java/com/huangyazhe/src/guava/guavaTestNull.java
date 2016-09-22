package com.huangyazhe.src.guava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.common.base.Optional;
import org.junit.Test;
/**
 * Created with IntelliJ IDEA.
 * User: huangyazhe
 * Date: 2016/8/23
 * Time: 21:22
 */


/**
 * null值是一种令人不满的模糊含义。有的时候会产生二义性，这时候我们就很难搞清楚具体的意思，如果程序返回一个null值，
 * 其代表的含义到底是什么，例如：Map.get(key)若返回value值为null，其代表的含义可能是该键指向的value值是null，亦或者该键在map中并不存在。
 * null值可以表示失败，可以表示成功，几乎可以表示任何情况。用其它一些值(而不是null值)可以让你的代码表述的含义更清晰。
 * 反过来说，使用null值在有些情况下是一种正确的选择，因为从内存消耗和效率方面考虑，使用null更加廉价，而且在对象数组中出现null也是不可避免的。
 * 但是在程序代码中，比方说在函数库中，null值的使用会变成导致误解的元凶，也会导致一些莫名的，模糊的，很难修正的问题。就像上述map的例子，
 * 字典返回null可以代表的是该键指向的值存在且为空，或者也可以代表字典中没有这个键。关键在于，null值不能指明到底null代表了什么含义。
 */
public class guavaTestNull {

    public static void main(String arge[]){
        //testNullObject();

        //判断list可不可以存NULL
        //TestListNUll();

        //MapListNUll();

        //
        //NUll2NUll();

        testOptional();
    }

    public static void testNullObject(){
        if (null instanceof Object){
            System.out.println("null属于java.lang.Object类型");
        }else {
            System.out.println("null不属于java.lang.Object类型");
        }
    }

    //判断list可不可以存NULL
    public static void TestListNUll(){
        List list = new ArrayList();
        list.add(null);
        list.add(1);
        list.add("2");
        list.add(null);
        list.add(null);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    //判断Map可不可以存NULL
    public static void MapListNUll(){
        Map map = new HashMap();
        map.put(null, null);
        map.put(1, 1);
        map.put(null, null);

        System.out.println(map.get(null));

    }

    //判断Map可不可以存NULL
    public static void NUll2NUll(){

        System.out.println(null == null);
    }


    /*public class OptionalTest {

        public void testOptional() throws Exception {
            Optional<Integer> possible=Optional.of(6);
            if(possible.isPresent()){
                System.out.println("possible isPresent:"+possible.isPresent());
                System.out.println("possible value:"+possible.get());
            }
        }
    }*/

//adfasdfas
        public static void testOptional()
        {
            Optional<Integer> possible=Optional.of(6);
            Optional<Integer> absentOpt=Optional.absent();
            Optional<Integer> NullableOpt=Optional.fromNullable(null);
            Optional<Integer> NoNullableOpt=Optional.fromNullable(10);
            if(possible.isPresent()){
                System.out.println("possible isPresent:"+possible.isPresent());
                System.out.println("possible value:"+possible.get());
            }
            if(absentOpt.isPresent()){
                System.out.println("absentOpt isPresent:"+absentOpt.isPresent()); ;
            }
            if(NullableOpt.isPresent()){
                System.out.println("fromNullableOpt isPresent:"+NullableOpt.isPresent()); ;
            }
            if(NoNullableOpt.isPresent()){
                System.out.println("NoNullableOpt isPresent:"+NoNullableOpt.isPresent()); ;
            }
        }
}
