package com.example.oldy_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.oldy_backend.model.entity.BmsBillboard;
import com.example.oldy_backend.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
