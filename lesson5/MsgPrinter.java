package lesson5;

public class MsgPrinter {
    public String msg;

    public void printMsg(FuncInt inter)
    {
        System.out.println(inter.getMsg(msg));
    }

    public static void main(String[] args) {
        MsgPrinter printer  = new MsgPrinter();
        printer.msg = "message";
        printer.printMsg(s-> s + " changed");
    }
}
