package com.baomidou.ant.rsps.mapper;

import com.baomidou.ant.rsps.entity.JhytBoxInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhaochunbo
 * @since 2018-10-22
 */
@Repository
public interface JhytBoxInfoMapper extends BaseMapper<JhytBoxInfo> {

    IPage<JhytBoxInfo> selectPageVo(Page page, @Param("state") Integer state);

    List<JhytBoxInfo> getAll();
}
