package victorY;

import java.io.Serializable;

public class Time implements Serializable{
    private String nome;
    private String pais;

    public Time(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }
    
    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Time{Nome: " + nome + ", País: " + pais + '}';
    }
}
