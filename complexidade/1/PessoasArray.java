public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    // implementar o método de buscaLinear
    public void buscaLinear(String nome){
        boolean encontrado = false;

        System.out.printf("Procurando pelo nome: \"%s\"", nome);
            for(int i = 0; i < nomes.length; i++){
                System.out.println("Passando pelo índice:" + i);

                  if (nomes[i] == nome) {
                      System.out.println("Nome pesquisado é " + nome + " que está na posição " +i);
                      encontrado = true;
                  }

            }

            if(!encontrado){
                throw new IllegalArgumentException("O nome " + nome + " não se encontra no array de nomes");

            }

    }
}