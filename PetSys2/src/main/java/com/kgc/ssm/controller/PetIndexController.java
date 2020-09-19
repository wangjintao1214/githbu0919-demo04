package com.kgc.ssm.controller;

import com.kgc.ssm.pojo.Pet;
import com.kgc.ssm.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PetIndexController {

    @Resource
    PetService petService;

    @RequestMapping("/")
    public String index(Model model,String type){
        int i=0;
        if(type!=null){
            i=Integer.parseInt(type);
        }
        List<Pet> pets = petService.selectAll(i);
        model.addAttribute("list",pets);
        return "index";
    }

    //新增宠物页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }
    @RequestMapping("/doAdd")
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
        petService.add(pet);
        return "redirect:/";
    }
}
