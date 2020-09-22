package com.kgc.ssm.service;
import com.kgc.ssm.pojo.Pet;

import java.util.List;

/**
 * @author wangyf
 * @create 2020-09-22 9:12
 */
public interface PetService {
    //查询全部
    List<Pet> selectByType(String type);
    //添加
    int addPet(Pet pet);
}
