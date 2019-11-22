/**
 * Copyright (C), 2019-2019, 微元素公司
 * FileName: SystemApplication
 * Author:   xzm
 * Date:     2019/11/22 21:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ihrm.system;

import com.ihrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xzm
 * @create 2019/11/22
 * @since 1.0.0
 */
@SpringBootApplication
//扫描实体类
@EntityScan("com.ihrm.domain.system")
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }

    @Bean
    public IdWorker idWorkker() {
        return new IdWorker(1, 1);
    }
}
