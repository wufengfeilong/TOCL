package com.fujisoft.translation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fujisoft.translation.TranslateRepository;
import com.fujisoft.translation.Translation;

/** 
* create by 張風武 
* 2018/02/28 13:12:59 
*/
@Controller
public class TranslationController {
    @Autowired
    TranslateRepository translateRepository;
    
    @GetMapping("/")
    String tran(){
        return "tran";
    }
    
    @PostMapping("/getTran")
    @ResponseBody
    List<Translation> getTran(
            @RequestParam(value = "type",required = true,defaultValue = "1") String type
            ,@RequestParam(value = "tranword",required = true) String tranword){
        System.out.println(type);
        System.out.println(tranword);
        if ("1".equals(type)) {
            System.out.println("china");
            return translateRepository.findByChinaTran(tranword);
        } else if ("2".equals(type)) {
            System.out.println("english");
            return translateRepository.findByEnglishTran(tranword);
        } else if ("3".equals(type)) {
            System.out.println("japan");
            return translateRepository.findByJapanTran(tranword);
        }
        System.out.println("waimian");
        return translateRepository.findByChinaTran(tranword);
    }
}
