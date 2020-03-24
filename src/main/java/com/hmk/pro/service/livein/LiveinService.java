package com.hmk.pro.service.livein;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hmk.pro.po.livein.Livein;
import com.hmk.pro.po.livein.LiveinExample;

public interface LiveinService {
	int countByExample(LiveinExample example);

    int deleteByExample(LiveinExample example);

    int deleteByPrimaryKey(Integer customerid);

    int insert(Livein record);

    int insertSelective(Livein record);

    List<Livein> selectByExample(LiveinExample example);

    Livein selectByPrimaryKey(Integer customerid);

    int updateByExampleSelective(@Param("record") Livein record, @Param("example") LiveinExample example);

    int updateByExample(@Param("record") Livein record, @Param("example") LiveinExample example);

    int updateByPrimaryKeySelective(Livein record);

    int updateByPrimaryKey(Livein record);
    
    List<Livein> selectByPageAndExample(LiveinExample example);

    int getMaxId();
}
