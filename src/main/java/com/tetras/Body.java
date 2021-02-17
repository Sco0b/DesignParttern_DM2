package com.tetras;

public class Body implements Affichable{
    
    private String Content;
    
    public Body (String content){
        Content = content;
    }

    public void afficher(){
        System.out.println(Content);
    }
}