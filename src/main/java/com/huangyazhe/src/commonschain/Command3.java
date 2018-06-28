package com.huangyazhe.src.commonschain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * 描述: Command3 （调用原生的Command interface）
 * @author: huangyazhe
 * Date: 2017/6/9
 */
public class Command3 implements Command {
    public boolean execute(Context context) throws Exception {
        System.out.println("Command2 done!");
        return false;
    }
}
