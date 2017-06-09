package com.huangyazhe.src.commonschain;

import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;

/**
 * 描述: 通过commons chain 进行任务链的处理
 * User: huangyazhe
 * Date: 2017/6/9
 */
public class CommandChain extends ChainBase {

    //增加命令的顺序也决定了执行命令的顺序

    public CommandChain(){
        addCommand(new Command1());  //返回false

        addCommand( new Command2()); //返回true

        addCommand( new Command3()); //没走到
    }


    //测试类
    public static void main(String arge[]) throws Exception{
        CommandChain process = new CommandChain();

        ContextBase ctx= new ContextBase();

        boolean yorn =  process.execute(ctx);
        System.out.println(yorn);
    }
}
