package com.yang.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 因为只需要根据配置文件创建一个SessionFactory即可，所以我们把SessionFactory创建为静态成员
 * 保证全局使用
 * @author yang
 *
 */
public class HibernateUtil {
	private static SessionFactory factory;
	static {
		try {
			Configuration config = new Configuration();
			config.configure("config/hibernate.cfg.xml");
			factory = config.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//获取当前线程绑定的session
	public static Session getCurrentSession() {
		return factory.getCurrentSession();
	}
}
