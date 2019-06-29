package com.fanyi.andnow.basedata.material.service;

import com.fanyi.andnow.basedata.material.mapper.MaterialMapper;
import com.fanyi.andnow.common.vo.basedata.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 物料业务实现层
 * @author yutao
 * @date 20190628
 */
@Service
public class MaterialServiceImpl implements MaterialService{

    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public List<Material> getMaterialList() {
        return materialMapper.selectMaterial();
    }

    @Override
    public int addMaterial(Material material) {
        return materialMapper.insertMaterial(material);
    }

    @Override
    public int saveMaterialByPk(Material material) {
        return materialMapper.updateMaterialByPk(material);
    }

    @Override
    public int removeMaterialByPk(Integer pkMaterial) {
        return materialMapper.deleteMaterialByPk(pkMaterial);
    }
}
