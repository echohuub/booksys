package com.heqingbao.booksys.mapper;

import com.heqingbao.booksys.po.TbSale;
import com.heqingbao.booksys.po.TbSaleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSaleMapper {
    long countByExample(TbSaleExample example);

    int deleteByExample(TbSaleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSale record);

    int insertSelective(TbSale record);

    List<TbSale> selectByExample(TbSaleExample example);

    TbSale selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSale record, @Param("example") TbSaleExample example);

    int updateByExample(@Param("record") TbSale record, @Param("example") TbSaleExample example);

    int updateByPrimaryKeySelective(TbSale record);

    int updateByPrimaryKey(TbSale record);
}