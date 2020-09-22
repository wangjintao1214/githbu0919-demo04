package com.kgc.ssm.controller;


import com.kgc.ssm.pojo.Pet;
import com.kgc.ssm.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-09-20 15:37
 */
@Controller
public class PetController {
    @Resource
    PetService petService;

    @RequestMapping("/selectPetBybreed")
    public String selectPetBybreed(Model model, String breed) {
        List<Pet> pets = petService.selectByType(breed);
        model.addAttribute("list", pets);
        return "main";
    }
    @RequestMapping("/addPet")
    public String toaddPet(){
        return "addPet";
    }
    @RequestMapping("/doAddPet")
    public String addPet(Model model, HttpServletRequest request,Pet pet) {

        /*Pet pet = new Pet();
        pet.setPetSex(sex);
        pet.setBirthday(date);
        pet.setDescription(describle);
        pet.setPetBreed(petbreed);
        pet.setPetName(name);
        , String petbreed, String name, String sex, String date, String describle
        */
        int i = petService.addPet(pet);
        if(i>0){
            request.setAttribute("success","添加成功");
        }else{
            request.setAttribute("fail","添加失败");
        }

        return "redirect:selectPetBybreed";
    }
}
