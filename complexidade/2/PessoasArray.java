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

    // implementar o método de buscaBinaria
    public void buscaBinaria(String nome){
        boolean encontrado = false;
        int low = 0;
        int high = nomes.length -1;

        System.out.printf("Procurando o nome: \"%s\"", nome);
        System.out.println();
        while(low <= high){
            int mid = (low + high) /2;
            System.out.println("Passando pelo indice: " + mid);
            if(nomes[mid].equals(nome)){
                System.out.println("Nome " + nome + " encontrado na posição " + mid);
                return;
            } else if(nomes[mid].compareTo(nome) < 0){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }


        throw new IllegalArgumentException("O nome " + nome + " não se encontra no array de nomes.");
    }
}
