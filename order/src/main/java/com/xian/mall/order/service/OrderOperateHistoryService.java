package com.xian.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xian.common.utils.PageUtils;
import com.xian.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author lishouxian
 * @email li.shouxian@outlook.com
 * @date 2020-09-15 20:41:33
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

