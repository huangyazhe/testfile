package com.huangyazhe.src.commonschain;

import org.apache.commons.chain.Context;

/**
 * ����: ������1 (ֱ�Ӽ̳� һ��ҵ���࣬�ô��ǿ����������ҵ��)
 * User: huangyazhe
 * Date: 2017/6/9
 */
public class Command1 extends WareCommand {

    public boolean execute(Context context) throws Exception {
        System.out.println("Command1 done!");
        Manager manager = new ManagerImpl();//�����sprint�����Բ�������ʵ������
        manager.isVersion("6.1.0", true);
        return false;
    }


}
