package com.huangyazhe.src.commonschain;

import org.apache.commons.chain.Context;

/**
 * 描述: 任务链1 (直接继承 一个业务类，好处是可以添加切面业务)
 * User: huangyazhe
 * Date: 2017/6/9
 */
public class Command1 extends WareCommand {

    public boolean execute(Context context) throws Exception {
        System.out.println("Command1 done!");
        Manager manager = new ManagerImpl();//如果用sprint这块可以不用这样实例化了
        manager.isVersion("6.1.0", true);
        return false;
    }


}
