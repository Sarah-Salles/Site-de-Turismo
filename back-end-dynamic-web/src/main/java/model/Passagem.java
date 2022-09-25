package model;
import java.util.Date;

public class Passagem {
    private int id;
    private int id_cidade;
    private double valor;
    private int desconto;
    private double valor_promocional;
    private Date data_ida;
    private Date data_volta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int id_cidade) {
        this.id_cidade = id_cidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public double getValor_promocional() {
        return valor_promocional;
    }

    public void setValor_promocional(double valor_promocional) {
        this.valor_promocional = valor_promocional;
    }

    public Date getData_ida() {
        return data_ida;
    }

    public void setData_ida(Date data_ida) {
        this.data_ida = data_ida;
    }

    public Date getData_volta() {
        return data_volta;
    }

    public void setData_volta(Date data_volta) {
        this.data_volta = data_volta;
    }
}
