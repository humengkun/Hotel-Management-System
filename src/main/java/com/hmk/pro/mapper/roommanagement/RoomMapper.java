package com.hmk.pro.mapper.roommanagement;

import com.hmk.pro.po.roommanagement.Room;
import com.hmk.pro.po.roommanagement.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper {
    int countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(Integer roomid);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExample(RoomExample example);
    
    List<Room> selectByPageAndExample(RoomExample example);

    Room selectByPrimaryKey(Integer roomid);

    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
    
    public Integer getId(String roomnum);
    
    public String getstate(Integer roomid);
    
    public Integer customeridGetRoomid(Integer customerid);
}