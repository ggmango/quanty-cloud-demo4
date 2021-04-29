package com.quanty.cloud.service.demo.tkmybatismapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
//不用修改
public interface MyMapper<T> extends Mapper, MySqlMapper {
}
