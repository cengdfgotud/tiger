package com.nbb.itf;

import com.nbb.bean.Agent;

/**
 * User: steak-yuqi
 * Date: 2017/9/12
 * Time: 15:03
 * Desc:用户服务
 */
public interface AgentService {

    /**
     * 根据主键id查询用户
     * @param id
     * @return
     */
    Agent selectAgent(int id);
}
