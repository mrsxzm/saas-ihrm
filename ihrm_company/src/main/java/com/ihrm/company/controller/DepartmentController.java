/**
 * Copyright (C), 2019-2019, 微元素公司
 * FileName: DepartmentController
 * Author:   xzm
 * Date:     2019/11/13 17:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ihrm.company.controller;

import com.ihrm.common.controller.BaseController;
import com.ihrm.common.entity.Result;
import com.ihrm.common.entity.ResultCode;
import com.ihrm.company.service.CompanyService;
import com.ihrm.company.service.DepartmentService;
import com.ihrm.domain.company.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xzm
 * @create 2019/11/13
 * @since 1.0.0
 */
@RestController
@RequestMapping("/company")
public class DepartmentController extends BaseController {
    @Autowired
    DepartmentService departmentService;
    @Autowired
    CompanyService companyService;

    //保存
    @RequestMapping(value = "/departments", method = RequestMethod.POST)
    public Result save(@RequestBody Department department) {
        //目前公司id写死
        department.setCompanyId(parseCompanyId());
        departmentService.save(department);
        return Result.SUCCESS();
    }

    /**
     *   * 修改部门信息
     *   
     */
    @RequestMapping(value = "/departments/{id}", method = RequestMethod.PUT)
    public Result update(@PathVariable(name = "id") String id, @RequestBody Department
            department) throws Exception {
        department.setCompanyId(parseCompanyId());
        department.setId(id);
        departmentService.update(department);
        return Result.SUCCESS();
    }

    /**
     *   * 删除部门
     *   
     */
    @RequestMapping(value = "/departments/{id}", method = RequestMethod.DELETE)
    public Result delete(@PathVariable(name = "id") String id) throws Exception {
        departmentService.delete(id);
        return Result.SUCCESS();
    }

    /**
     *   * 根据id查询
     *   
     */
    @RequestMapping(value = "/departments/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable(name = "id") String id) throws Exception {
        Department department = departmentService.findById(id);
        return new Result(ResultCode.SUCCESS, department);
    }

    /**
     *   * 组织架构列表
     *   
     */

   /* @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public Result findAll() throws Exception {
        Company company = companyService.findById(parseCompanyId());
        List<Department> list = departmentService.findAll(parseCompanyId());
        return new Result(ResultCode.SUCCESS, new DeptListResult(company, list));
    }*/
}
