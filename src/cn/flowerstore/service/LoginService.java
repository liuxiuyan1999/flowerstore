package cn.flowerstore.service;

import java.sql.SQLException;
import java.util.Date;

import cn.flowerstore.dao.LoginDao;
import cn.flowerstore.exception.ActiveUserException;
import cn.flowerstore.exception.RegisterException;

public class LoginService {
	private LoginDao dao=new LoginDao();
	public void addLogin(int uid,String ipaddress) throws SQLException {
		dao.add(uid,ipaddress);
	}

}
