package com.tetras;

public class RequeteHTTP implements Affichable{
    
    private Url MyUrl;
    private Header MyHeader;
    private Body MyBody;
    
    public RequeteHTTP(Url myUrl, Header myHeader, Body myBody){
        MyUrl = myUrl;
        MyHeader = myHeader;
        MyBody = myBody;
    }

    public void afficher(){
        MyUrl.afficher();
        MyHeader.afficher();
        MyBody.afficher();
    }

    public Url GetUrl()
    {
        return MyUrl;
    }
}