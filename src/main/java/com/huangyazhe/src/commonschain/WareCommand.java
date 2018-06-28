package com.huangyazhe.src.commonschain;


import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

/**
 * ����: ����ʵ����һ�������ҵ��ӿ�
 * @author: huangyazhe
 * Date: 2017/6/9
 */
public abstract class WareCommand implements Command {
    //@Autowired --->�����spring�����Բ�������ʵ������
    protected Manager manager = new ManagerImpl();//�����sprint�����Բ�������ʵ������

    public boolean execute(Context context) throws Exception {
        System.out.println("WareCommand done!");
        manager.isVersion("6.1.0", true);
        return false;
    }

}
