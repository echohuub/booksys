package com.heqingbao.booksys.mapper;

import com.heqingbao.booksys.po.TbInventory;
import com.heqingbao.booksys.po.TbInventoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbInventoryMapper {
    long countByExample(TbInventoryExample example);

    int deleteByExample(TbInventoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbInventory record);

    int insertSelective(TbInventory record);

    List<TbInventory> selectByExample(TbInventoryExample example);

    TbInventory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbInventory record, @Param("example") TbInventoryExample example);

    int updateByExample(@Param("record") TbInventory record, @Param("example") TbInventoryExample example);

    int updateByPrimaryKeySelective(TbInventory record);

    int updateByPrimaryKey(TbInventory record);
}