package clase;

public abstract class Handler {

    protected Handler nextHandler;
    protected int prag;

    public Handler(Handler nextHandler, int prag) {
        this.nextHandler = nextHandler;
        this.prag = prag;
    }

    public Handler(int prag) {
        this.prag = prag;
        this.nextHandler = null;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void setPrag(int prag) {
        this.prag = prag;
    }

    public abstract void afiseazaCuCeSaMearga(int distanta);
}
