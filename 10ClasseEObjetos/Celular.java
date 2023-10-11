package ClasseEObjetos;

public class Celular {
    private String modelo;
    private String marca;
    private double preco;

    public void Celular(String nome, String marca, double preco){
        this.modelo = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}