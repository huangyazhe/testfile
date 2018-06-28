package com.huangyazhe.src.commonschain;


import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * 描述: 这里实现了一个补充的业务接口
 * @author: huangyazhe
 * Date: 2017/6/9
 */
public abstract class WareCommand implements Command {
    //@Autowired --->如果用spring这块可以不用这样实例化了
    protected Manager manager = new ManagerImpl();//如果用sprint这块可以不用这样实例化了

    public boolean execute(Context context) throws Exception {
        System.out.println("WareCommand done!");
        manager.isVersion("6.1.0", true);
        return false;
    }

}
