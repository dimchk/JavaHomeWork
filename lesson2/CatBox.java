package lesson2;

public class CatBox {
    int w;
    int l;
    int h;

    {

    }
    public CatBox() {
    }

    public CatBox(int w, int l, int h) {
        this.w = w;
        this.l = l;
        this.h = h;
    }

    void getInfo()
    {
        System.out.println("L" + l + " W" + this.w + " H" + h);
    }
}
