package com.heqingbao.booksys.mapper;

import com.heqingbao.booksys.po.TbBook;
import com.heqingbao.booksys.po.TbBookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbBookMapper {
    long countByExample(TbBookExample example);

    int deleteByExample(TbBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBook record);

    int insertSelective(TbBook record);

    List<TbBook> selectByExample(TbBookExample example);

    TbBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBook record, @Param("example") TbBookExample example);

    int updateByExample(@Param("record") TbBook record, @Param("example") TbBookExample example);

    int updateByPrimaryKeySelective(TbBook record);

    int updateByPrimaryKey(TbBook record);
}