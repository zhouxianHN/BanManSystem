package com.awm.bm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awm.bm.model.Account;
import com.awm.bm.persistence.AccountMapper;

/**
 * 服务层
 * 
 * @author Administrator
 * 
 */
@Service
public class AccountService {

	@Autowired
	/**
	 * 数据层接口对象
	 */
	private AccountMapper accountMapper;

	/**
	 * 添加用户信息
	 * 
	 * @param account
	 * @return
	 */
	public int addAccount(Account account) {
		return accountMapper.addAccount(account);
	}

	/**
	 * 根据id和密码查询用户 验证登录
	 * 
	 * @param account
	 * @return
	 */
	public Account findUser(Account account) {
		return accountMapper.findUserByIdAndPwd(account);
	}

	/**
	 * 根据id修改员工信息
	 * 
	 * @param account
	 * @return
	 */
	public int modifyUser(Account account) {
		return accountMapper.modifyUserById(account);
	}

	/**
	 * 根据id修改密码
	 * 
	 * @param account
	 * @return
	 */
	public int modifyUserPwd(Account account) {
		return accountMapper.modifyUserPwdById(account);
	}

	/**
	 * 根据id修改员工的状态
	 * 
	 * @param account
	 * @return
	 */
	public int modifyUserState(Account account) {
		return accountMapper.modifyUserStateById(account);
	}
}