package com.ak.demogifs.model.repository;

import com.ak.demogifs.model.Gif;

import java.util.Arrays;
import java.util.List;

public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "mols", true),
            new Gif("ben-and-mike", "mika", false),
            new Gif("book-dominos", "mem", true),
            new Gif("compiler-bot", "bot", false),
            new Gif("cowboy-coder", "code", false),
            new Gif("infinite-andrew", "andrew", false)
    );
}
