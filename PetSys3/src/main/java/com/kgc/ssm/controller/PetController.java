package com.kgc.ssm.controller;

import com.kgc.ssm.pojo.Pet;
import com.kgc.ssm.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-20 15:17
 */
@Controller
public class PetController {
    @Resource
    PetService petService;
    @RequestMapping("/")
    public String index(Model model, String type){
        int i=0;
        if(type!=null){
            i=Integer.parseInt(type);
        }
        List<Pet> pets=petService.selectAllPet(i);
        model.addAttribute("list",pets);
        return "index";
    }

    //新增宠物页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "addpet";
    }

    @RequestMapping(value = "/doAdd")
    public String doAdd(Pet pet){
        if(pet.getPetBreed().equals("1")){
            pet.setPetBreed("金毛");
        }else if(pet.getPetBreed().equals("2")){
            pet.setPetBreed("拉布拉多");
        }else if(pet.getPetBreed().equals("3")){
            pet.setPetBreed("柯基");
        }else if(pet.getPetBreed().equals("4")){
            pet.setPetBreed("二哈");
        }
        petService.addPet(pet);
        System.out.println(pet.toString());
        return "redirect:/";
    }
}
