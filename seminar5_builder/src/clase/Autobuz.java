package clase;

public class Autobuz {

    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textRulat;


    public Autobuz(String numeSofer, int nrLinie, boolean pauzaSofer, boolean deschideUsile, int oraIncepereProgram, String textRulat) {
        this.numeSofer = numeSofer;
        this.nrLinie = nrLinie;
        this.pauzaSofer = pauzaSofer;
        this.deschideUsile = deschideUsile;
        this.oraIncepereProgram = oraIncepereProgram;
        this.textRulat = textRulat;
    }


    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrLinie=" + nrLinie +
                ", pauzaSofer=" + pauzaSofer +
                ", deschideUsile=" + deschideUsile +
                ", oraIncepereProgram=" + oraIncepereProgram +
                ", textRulat='" + textRulat + '\'' +
                '}';
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public void setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
    }

    public void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    public void setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram = oraIncepereProgram;
    }

    public void setTextRulat(String textRulat) {
        this.textRulat = textRulat;
    }
}
