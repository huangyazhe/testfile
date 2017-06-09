package com.huangyazhe.src.commonschain;


import org.apache.commons.chain.Command;

/**
 * 描述: 这里实现了一个补充的业务接口
 * User: huangyazhe
 * Date: 2017/6/9
 */
public abstract class WareCommand implements Command {
    //@Autowired --->如果用sprint这块可以不用这样实例化了
    protected Manager manager;

}
