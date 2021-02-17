package com.tetras;

public class ServeurWebBase implements IServeurWeb{
    
    public ServeurWebBase(){

    }
    
    public int repondre(RequeteHTTP requete){
        if (requete == null)
        {
            return 500;
        }
        else
        {
            return 200;
        }

    }
}