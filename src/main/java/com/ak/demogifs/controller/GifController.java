package com.ak.demogifs.controller;

import com.ak.demogifs.model.Gif;
import com.ak.demogifs.model.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/showGifsInBrowser")
    @ResponseBody
    public String showGifsInBrowser(){
        return gifRepository.getGifNames();
    }

    @RequestMapping("/")
    public String listGifs(){
        // 1. Wyciąganie gifów
        List<Gif> gifList = gifRepository.getGifs();
        //GifRepository gifRepository = new GifRepository();

        // 2. Przekazanie gifa do view

        // 3. Zwracanie widoku
        return gifRepository.getGifs().toString();
    }


}
