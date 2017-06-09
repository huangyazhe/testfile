package com.huangyazhe.src.commonschain;

import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;

/**
 * ����: ͨ��commons chain �����������Ĵ���
 * User: huangyazhe
 * Date: 2017/6/9
 */
public class CommandChain extends ChainBase {

    //���������˳��Ҳ������ִ�������˳��

    public CommandChain(){
        addCommand(new Command1());  //����false

        addCommand( new Command2()); //����true

        addCommand( new Command3()); //û�ߵ�
    }


    //������
    public static void main(String arge[]) throws Exception{
        CommandChain process = new CommandChain();

        ContextBase ctx= new ContextBase();

        boolean yorn =  process.execute(ctx);
        System.out.println(yorn);
    }
}
