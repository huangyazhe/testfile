package com.huangyazhe.src;


import com.huangyazhe.src.LMD.Map;

import java.util.logging.Logger;

/**
 * Created by huangyazhe on 2016/8/22.
 */
public class MainTest {


    public static void main(String[] args) {

        //简写Map.put()
        Map<String, Object> map = new Map<String, Object>()
                .put("1",1)
                .put("2",2)
                .put("3",3)
                .put("4",4)
                .put("5",5);

        System.out.println("123");
        UserInfo userInfo = new UserInfo();
        userInfo.setId(11);
        userInfo.setName("huangyazhe");
        System.out.println(userInfo.toString());
    }


    static class UserInfo{
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "UserInfo{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }



}
