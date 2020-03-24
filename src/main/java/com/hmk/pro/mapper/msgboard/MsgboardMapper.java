package com.hmk.pro.mapper.msgboard;

import com.hmk.pro.po.msgboard.Msgboard;
import com.hmk.pro.po.msgboard.MsgboardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MsgboardMapper {
    int countByExample(MsgboardExample example);

    int deleteByExample(MsgboardExample example);

    int deleteByPrimaryKey(Integer msgboardid);

    int insert(Msgboard record);

    int insertSelective(Msgboard record);

    List<Msgboard> selectByExample(MsgboardExample example);

    Msgboard selectByPrimaryKey(Integer msgboardid);

    int updateByExampleSelective(@Param("record") Msgboard record, @Param("example") MsgboardExample example);

    int updateByExample(@Param("record") Msgboard record, @Param("example") MsgboardExample example);

    int updateByPrimaryKeySelective(Msgboard record);

    int updateByPrimaryKey(Msgboard record);
    
    public List<Msgboard> selectByPageAndExample(MsgboardExample example);
}