package com.ak.demogifs.controller;

import com.ak.demogifs.model.Gif;
import com.ak.demogifs.model.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
    public String listGifs(ModelMap modelMap){
        // 1. Wyciąganie gifów
        List<Gif> gifList = gifRepository.getGifs();
        //GifRepository gifRepository = new GifRepository();

        // 2. Przekazanie gifa do view
        modelMap.put("gifs", gifList);

        // 3. Zwracanie widoku
        return "home";
    }

    @RequestMapping("/favorites")
    public String gifFavorites(ModelMap modelMap){
        // Według schematu:

        // 1. Pobieramy listę gifów (tylko ulubionych)
        List<Gif> favoriteGifs = gifRepository.getFavoritesGifs();
        // 2. Przekazanie gifów do widoku
        modelMap.put("gifs", favoriteGifs);
        // 3. Informacja: widok nazywa się favorites.html

        return "favorites";
    }
    
}
