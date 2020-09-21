package com.kgc.ssm.service.impl;

import com.kgc.ssm.mapper.PetMapper;
import com.kgc.ssm.pojo.Pet;
import com.kgc.ssm.pojo.PetExample;
import com.kgc.ssm.service.PetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-20 15:05
 */
@Service("petService")
public class PetServiceImpl implements PetService{
    @Resource
    PetMapper petMapper;

    @Override
    public List<Pet> selectAllPet(Integer type) {
        PetExample example=new PetExample();
        PetExample.Criteria criteria = example.createCriteria();
       if(type==1){
           criteria.andPetBreedEqualTo("金毛");
           return petMapper.selectByExample(example);
       }else if(type==2){
           criteria.andPetBreedEqualTo("拉布拉多");
           return petMapper.selectByExample(example);
       }else if(type==3){
           criteria.andPetBreedEqualTo("柯基");
           return petMapper.selectByExample(example);
       }else if(type==4){
           criteria.andPetBreedEqualTo("二哈");
           return petMapper.selectByExample(example);
       }
        return petMapper.selectByExample(null);
    }

    @Override
    public void addPet(Pet pet) {
        petMapper.insertSelective(pet);
    }
}
