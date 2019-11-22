/**
 * Copyright (C), 2019-2019, 微元素公司
 * FileName: DepartmentDao
 * Author:   xzm
 * Date:     2019/11/13 17:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ihrm.company.dao;

import com.ihrm.domain.company.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 〈一句话功能简述〉<br> 
 * 〈部门持久层〉
 *
 * @author xzm
 * @create 2019/11/13
 * @since 1.0.0
 */
public interface DepartmentDao extends JpaRepository<Department,String>, JpaSpecificationExecutor<Department> {

}
