/**
 * Copyright (C), 2019-2019, 微元素公司
 * FileName: UserDao
 * Author:   xzm
 * Date:     2019/11/22 21:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ihrm.system.dao;

import com.ihrm.domain.system.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author xzm
 * @create 2019/11/22
 * @since 1.0.0
 */
public interface UserDao extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {
}

