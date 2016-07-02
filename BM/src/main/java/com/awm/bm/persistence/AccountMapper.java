package com.awm.bm.persistence;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.awm.bm.model.Account;

/**
 * 数据层接口
 * 
 * @author Administrator
 * 
 */
@Mapper
public interface AccountMapper {
	/**
	 * 添加用户信息
	 * 
	 * @param account
	 */
	@Insert("insert into account values(#{id})")
	public int addAccount(@Param("id") Account account);

	/**
	 * 根据id和密码查询用户 验证登录
	 *
	 * @return
	 */
	@Select("select * from account where ")
	public Account findUserByIdAndPwd(Account account);

	/**
	 * 根据id修改密码
	 * 
	 * @param id
	 * @return
	 */
	public int modifyUserPwdById(Account account);

	/**
	 * 根据id修改员工信息
	 * 
	 * @return
	 */
	public int modifyUserById(Account account);

	/**
	 * 根据id修改员工的状态
	 * 
	 * @return
	 */
	public int modifyUserStateById(Account account);
}