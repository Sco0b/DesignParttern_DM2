package com.tetras;

public class ServeurWebWithEvil implements IServeurWeb{
    
    private ServeurWebBase LocalServeur;
    
    public ServeurWebWithEvil (ServeurWebBase serveur){
        LocalServeur = serveur;
    }

    public int repondre(RequeteHTTP requete){
        if (requete != null)
        {
            String url = requete.GetUrl().getPath();
            if (url.contains("/evilurl"))
            {
                return 403;
            }
            else
            {
                return LocalServeur.repondre(requete);
            }
        }
        else
        {
            return LocalServeur.repondre(requete);
        }
    }
}