package com.ak.demogifs.model.repository;

import com.ak.demogifs.model.Gif;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "mols", true, 1),
            new Gif("ben-and-mike", "mika", false, 2),
            new Gif("book-dominos", "mem", true, 0),
            new Gif("compiler-bot", "bot", false, 1),
            new Gif("cowboy-coder", "code", false, 1),
            new Gif("infinite-andrew", "andrew", false, 2)
    );

    public List<Gif> getGifs(){
        return ALL_GIFS;
    };


    //metoda która zapisuje wszystkie imiona do Stringa

    public String getGifNames(){
        String result = "";
        for (Gif allGif : ALL_GIFS){
            result += allGif.getName();
        }
        return result;
    }

    public List<Gif> getFavoritesGifs() {
        List<Gif> favoriteGifs = new ArrayList<>();
        for (Gif gif : ALL_GIFS){
            if (gif.getFavorite()){
                favoriteGifs.add(gif);
            }
        }
        return favoriteGifs;
    }

    public List<Gif> getGifByCategoryId(int id){
        List<Gif> categories = new ArrayList<>();

        for (Gif gif : ALL_GIFS){
            if (gif.getCategoryId() == id){
                categories.add(gif);
            }
        }
        return categories;
    }
}
