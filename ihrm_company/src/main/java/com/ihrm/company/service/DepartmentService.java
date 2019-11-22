/**
 * Copyright (C), 2019-2019, 微元素公司
 * FileName: DepartmentService
 * Author:   xzm
 * Date:     2019/11/13 17:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ihrm.company.service;

import com.ihrm.common.service.BaseService;
import com.ihrm.common.utils.IdWorker;
import com.ihrm.company.dao.DepartmentDao;
import com.ihrm.domain.company.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xzm
 * @create 2019/11/13
 * @since 1.0.0
 */
@Service
public class DepartmentService extends BaseService {
    @Autowired
    private DepartmentDao departmentDao;
    @Autowired
    private IdWorker idWorker;

    /**
     * 功能描述: <br>
     * 〈保存部门〉
     *
     * @param:[department]
     * @return:void
     * @since: 1.0.0
     * @Author:xzm
     * @Date: 2019/11/13 17:16
     */
    public void save(Department department) {

        //id
        department.setId(idWorker.nextId() + "");
        //时间
        department.setCreateTime(new Date());
        //部门名称
        department.setName("开发部");
        //负责人
        department.setManager("小徐");
        //保存
        departmentDao.save(department);
    }

    /**
     * 功能描述: <br>
     * 〈修改部门〉
     *
     * @param:[department, id]
     * @return:void
     * @since: 1.0.0
     * @Author:xzm
     * @Date: 2019/11/13 17:19
     */
    public void update(Department department) {
       //查询
        Department sourceDepartment = departmentDao.findById(department.getId()).get();
        //修改
        sourceDepartment.setName(department.getName());
        sourceDepartment.setPid(department.getPid());
        sourceDepartment.setManagerId(department.getManagerId());
        sourceDepartment.setIntroduce(department.getIntroduce());
        sourceDepartment.setManager(department.getManager());
        departmentDao.save(department);
    }

    /**
     *   * 根据ID获取部门信息
     *   *
     *   * @param id 部门ID
     *   * @return 部门信息
     *   
     */
    public Department findById(String id) {
        return departmentDao.findById(id).get();
    }

    /**
     *   * 删除部门
     *   *
     *   * @param id 部门ID
     *   
     */
    public void delete(String id) {
        departmentDao.deleteById(id);
    }

    /**
     *   * 获取部门列表
     *   
     */
    public List<Department> findAll(String companyId) {
        return departmentDao.findAll(getSpecification(companyId));
    }
}
