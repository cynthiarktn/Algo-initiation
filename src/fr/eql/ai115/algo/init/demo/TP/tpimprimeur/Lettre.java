package fr.eql.ai115.algo.init.demo.TP.tpimprimeur;


public class Lettre {
    private String msg;

    public Lettre(String msg) {
        this.msg = msg;
    }

    public Lettre() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Lettre{" +
                "msg='" + msg + '\'' +
                '}';
    }

}
