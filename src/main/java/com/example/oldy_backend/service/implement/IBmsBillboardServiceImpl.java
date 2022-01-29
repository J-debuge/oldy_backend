package com.example.oldy_backend.service.implement;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.oldy_backend.mapper.BmsBillboardMapper;
import com.example.oldy_backend.model.entity.BmsBillboard;
import com.example.oldy_backend.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper, BmsBillboard>
        implements IBmsBillboardService {

}
