package com.huangyazhe.src.commonschain;


import org.apache.commons.chain.Command;

/**
 * ����: ����ʵ����һ�������ҵ��ӿ�
 * User: huangyazhe
 * Date: 2017/6/9
 */
public abstract class WareCommand implements Command {
    //@Autowired --->�����sprint�����Բ�������ʵ������
    protected Manager manager;

}
