package com.ak.demogifs.model.repository;

import com.ak.demogifs.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "mols", true),
            new Gif("ben-and-mike", "mika", false),
            new Gif("book-dominos", "mem", true),
            new Gif("compiler-bot", "bot", false),
            new Gif("cowboy-coder", "code", false),
            new Gif("infinite-andrew", "andrew", false)
    );

    //metoda która zapisuje wszystkie imiona do Stringa

    public String getGifNames(){
        String result = "";
        for (Gif allGif : ALL_GIFS){
            result += allGif.getName();
        }
        return result;
    }
}
