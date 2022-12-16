package tp.education.factory;

public class VoitureFactory {
    public Voiture commanderVoiture(int vitesse){
        if(vitesse<=90){
            return new VoitureLegere();
        }
        else if(vitesse>90&&vitesse<300){
            return new VoitureLourde();
        }
        else{
            return new VoitureExpress();
        }
    }
}
