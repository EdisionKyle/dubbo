
package com.loner.dubbo.server;

import java.util.Map;

import com.loner.dubbo.api.HelloService;
import com.loner.dubbo.dao.CnUserDao;
import com.loner.dubbo.pojo.CnUser;

/**
 * @author fengjx.
 * @date：2015/1/6 0006
 */
public class HelloServiceImpl implements HelloService {
	private Map<String, String> bankcodemap;
	private CnUserDao cnUserDao;
    /**
     * 暴露的接口
     *
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return "Hello " + name;
    }

    /**
     * 
     * @author pengcheng.tian
     * @param uid
     * @return
     */
	@Override
	public CnUser findCnUserById(String uid) {
		System.out.println("findCnUserById.uid==" + uid);
		System.out.println("cnUserDao.findCnUsers==" + bankcodemap);
		System.out.println(cnUserDao.findCnUsers());
		return new CnUser(uid, "万里独行", "30", "广东省深圳市南山区");
	}

	public Map<String, String> getBankcodemap() {
		return bankcodemap;
	}

	public void setBankcodemap(Map<String, String> bankcodemap) {
		this.bankcodemap = bankcodemap;
	}

	public CnUserDao getCnUserDao() {
		return cnUserDao;
	}

	public void setCnUserDao(CnUserDao cnUserDao) {
		this.cnUserDao = cnUserDao;
	}

}
