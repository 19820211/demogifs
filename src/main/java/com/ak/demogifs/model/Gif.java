package com.ak.demogifs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Gif {

    private String name;
    private String username;
    private Boolean favorite;

}
