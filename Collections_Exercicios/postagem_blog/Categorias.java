public enum Categorias {
   /*  DEVOPS("devops"),
    DESENVOLVIMENTO("desenvolvimento"),
    DATA_SCIENCE("data science");

    private final String categoria;

    Categorias(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){ return categoria;}

    public static Categorias fromString(String ca){
        for(Categorias c : Categorias.value()){
            if(c.categoria.equals(ca)){
                return c;
            }
        }

        throw new IllegalArgumentException("Categoria invalida");
    }
        */

        DEVOPS,
        DESENVOLVIMENTO,
        DATA_SCIENCE;
}
