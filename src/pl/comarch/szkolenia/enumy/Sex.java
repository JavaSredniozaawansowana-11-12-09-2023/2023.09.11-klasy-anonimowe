package pl.comarch.szkolenia.enumy;

public enum Sex {
    MEN(1, 4.0),
    WOMAN(2, 6.6),
    OTHER(3, 3.3);

    int x;

    Sex(int x, double a) {
        this.x = x;
    }

    public void metoda() {
        System.out.println("metoda z enuma !!");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
