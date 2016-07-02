package com.awm.bm.persistence;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.awm.bm.model.Account;

/**
 * ���ݲ�ӿ�
 * 
 * @author Administrator
 * 
 */
@Mapper
public interface AccountMapper {
	/**
	 * ����û���Ϣ
	 * 
	 * @param account
	 */
	@Insert("insert into account values(#{id})")
	public int addAccount(@Param("id") Account account);

	/**
	 * ����id�������ѯ�û� ��֤��¼
	 *
	 * @return
	 */
	@Select("select * from account where ")
	public Account findUserByIdAndPwd(Account account);

	/**
	 * ����id�޸�����
	 * 
	 * @param id
	 * @return
	 */
	public int modifyUserPwdById(Account account);

	/**
	 * ����id�޸�Ա����Ϣ
	 * 
	 * @return
	 */
	public int modifyUserById(Account account);

	/**
	 * ����id�޸�Ա����״̬
	 * 
	 * @return
	 */
	public int modifyUserStateById(Account account);
}