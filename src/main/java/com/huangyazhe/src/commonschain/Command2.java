package com.huangyazhe.src.commonschain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * ����: ������2 ������ԭ����Command interface��
 * @author: huangyazhe
 * Date: 2017/6/9
 */
public class Command2 implements Command {
    public boolean execute(Context context) throws Exception {
        System.out.println("Command2 done!");
        return true;
    }
}
