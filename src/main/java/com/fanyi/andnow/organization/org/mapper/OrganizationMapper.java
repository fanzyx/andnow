package com.fanyi.andnow.organization.org.mapper;

import com.fanyi.andnow.common.vo.organization.Organization;
import com.fanyi.andnow.organization.org.service.OrganizationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * 组织数据映射层
 *
 * @author wangyds
 * @date 2019/7/1
 */
@Mapper
public interface OrganizationMapper {
    /**
     * 新增组织信息
     * @param org 组织信息
     * @return 返回影响行数
     */
    int insertOrg(Organization org);

    /**
     * 逻辑删除组织信息
     * @param pkOrg 组织主键
     * @return 返回影响行数
     */
    int deleteOrgByPrimaryKey(Integer pkOrg);

    /**
     * 查询组织信息
     * @param pkOrg 组织主键
     * @return 返回查找到的组织信息
     */
    Organization selectOrgByPrimaryKey(Integer pkOrg);

    /**
     * 根据主键更新组织信息，更新不为null的项
     * @param org 组织信息
     * @return 返回影响行数
     */
    int updateOrgByPrimaryKey(Organization org);

    /**
     * 查询所有未逻辑删除的组织信息
     * @return
     */
    List<Organization> selectAllOrg();
}