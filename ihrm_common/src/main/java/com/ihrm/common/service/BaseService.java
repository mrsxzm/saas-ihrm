/**
 * Copyright (C), 2019-2019, 微元素公司
 * FileName: BaseService
 * Author:   xzm
 * Date:     2019/11/13 16:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ihrm.common.service;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xzm
 * @create 2019/11/13
 * @since 1.0.0
 */
public class BaseService<T> {
    protected Specification<T> getSpecification(String companyId) {
        return new Specification<T>() {
            @Override
            public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery,
                                         CriteriaBuilder cb) {
                return cb.equal(root.get("companyId").as(String.class), companyId);
            }
        };
    }
}
