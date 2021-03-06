package com.hmk.pro.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hmk.pro.po.base.Department;
import com.hmk.pro.po.base.DepartmentExample;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(String deptid);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);
    List<Department> selectByPageAndExample(DepartmentExample example);

    Department selectByPrimaryKey(String deptid);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}