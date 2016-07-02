package com.awm.bm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awm.bm.model.Account;
import com.awm.bm.persistence.AccountMapper;

/**
 * �����
 * 
 * @author Administrator
 * 
 */
@Service
public class AccountService {

	@Autowired
	/**
	 * ���ݲ�ӿڶ���
	 */
	private AccountMapper accountMapper;

	/**
	 * ����û���Ϣ
	 * 
	 * @param account
	 * @return
	 */
	public int addAccount(Account account) {
		return accountMapper.addAccount(account);
	}

	/**
	 * ����id�������ѯ�û� ��֤��¼
	 * 
	 * @param account
	 * @return
	 */
	public Account findUser(Account account) {
		return accountMapper.findUserByIdAndPwd(account);
	}

	/**
	 * ����id�޸�Ա����Ϣ
	 * 
	 * @param account
	 * @return
	 */
	public int modifyUser(Account account) {
		return accountMapper.modifyUserById(account);
	}

	/**
	 * ����id�޸�����
	 * 
	 * @param account
	 * @return
	 */
	public int modifyUserPwd(Account account) {
		return accountMapper.modifyUserPwdById(account);
	}

	/**
	 * ����id�޸�Ա����״̬
	 * 
	 * @param account
	 * @return
	 */
	public int modifyUserState(Account account) {
		return accountMapper.modifyUserStateById(account);
	}
}