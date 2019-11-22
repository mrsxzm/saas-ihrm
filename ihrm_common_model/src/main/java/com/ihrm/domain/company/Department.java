/**
 * Copyright (C), 2019-2019, 微元素公司
 * FileName: Department
 * Author:   xzm
 * Date:     2019/11/13 16:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ihrm.domain.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈部门实体类〉
 *
 * @author xzm
 * @create 2019/11/13
 * @since 1.0.0
 */
//代表为jpa实体类
@Entity
//实体类对应的数据库表
@Table(name = "co_department")
//get,set方法
@Data
//全参构造方法
@AllArgsConstructor
//无参构造方法
@NoArgsConstructor
public class Department {
    //序列，代表唯一
    private static final long serialVersionUID = -9084332495284489553L;
    //ID 
    @Id
    private String id;
    /**
     *   * 父级ID
     *   
     */
    private String pid;
    /**
     *   * 企业ID
     *   
     */
    private String companyId;
    /**
     *   * 部门名称
     *   
     */
    private String name;
    /**
     *   * 部门编码，同级部门不可重复
     *   
     */
    private String code;
    /**
     *   * 负责人ID
     *   
     */
    private String managerId;
    /**
     * 负责人名称
     */
    private String manager;
    /**
     *   * 介绍
     *   
     */
    private String introduce;
    /**
     *   * 创建时间
     *   
     */
    private Date createTime;
}
