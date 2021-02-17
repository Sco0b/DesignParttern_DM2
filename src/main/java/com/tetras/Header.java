package com.tetras;

import java.util.Map;

public class Header implements Affichable {
    
    private Map<String, String> Headers;
    
    public Header (Map<String, String> headers){
        Headers = headers;
    }

    public void afficher(){
        Headers.forEach((k, v) -> System.out.println((k + ":" + v)));
    }
}