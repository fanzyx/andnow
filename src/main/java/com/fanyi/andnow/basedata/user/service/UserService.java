package com.fanyi.andnow.basedata.user.service;

import com.fanyi.andnow.common.vo.basedata.UserVO;

/**
 * 用户服务层
 *
 * @author wangyds
 * @date 2019/6/17 9:13
 */
public interface UserService {

    /**
     * 获取所有用户
     * @return
     */
    UserVO getUser();

    /**
     * 添加用户
     * @param userVO
     * @return int （大于0成功，小于0失败。）
     */
    int insertUser(UserVO userVO);

}