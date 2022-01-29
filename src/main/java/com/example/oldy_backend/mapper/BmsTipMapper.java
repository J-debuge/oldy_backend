package com.example.oldy_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.oldy_backend.model.entity.BmsTip;
import org.springframework.stereotype.Repository;

@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}
