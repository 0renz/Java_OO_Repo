package CounterStrike.Classes;

public class Municao extends Artefato{
   private Boolean explosiva;
   private Calibre calibre;

    public Municao(Boolean explosiva, Calibre calibre, Integer id, String nome, Float peso, Float valor) {
        super(id, nome, peso, valor);
        this.explosiva = explosiva;
        this.calibre = calibre;
    }

    public Boolean getExplosiva() {
        return explosiva;
    }

    public void setExplosiva(Boolean explosiva) {
        this.explosiva = explosiva;
    }

    public Calibre getCalibre() {
        return calibre;
    }

    public void setCalibre(Calibre calibre) {
        this.calibre = calibre;
    }
}
