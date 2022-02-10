package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gatto = new Gato();
        System.out.println(gatto);

        livro livro1 = new livro("O problema dos 3 corpos", 330);
        System.out.println(livro1);
    }
}

class livro{
    private String nome;
    private Integer numPaginas;

    public livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = Integer.valueOf(numPaginas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}
