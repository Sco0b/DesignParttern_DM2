package com.tetras;

public class Url implements Affichable{
    
    private String Path;
    
    public Url (String path){
        Path = path;
    }

    public void afficher(){
        System.out.println(Path);
    }

    public String getPath(){
        return Path;
    }
}