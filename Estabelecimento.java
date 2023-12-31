public class Estabelecimento {

    private String tipoEstab;
    private String nomeEstab;
    private String ruaEstab;
    private int numeroEstab;
    private String complementoEstab;
    private String bairroEstab;
    private String cidadeEstab;
    private String ufEstab;
    private String cnpjEstab;
    private String telefoneEstab;

    // Construtor
    public Estabelecimento(String tipoEstab, String nomeEstab, String ruaEstab, int numeroEstab, String complementoEstab, String bairroEstab, String cidadeEstab, String ufEstab,
    String cnpjEstab, String telefoneEstab) {

        this.tipoEstab = tipoEstab;
        this.nomeEstab = nomeEstab;
        this.ruaEstab = ruaEstab;
        this.numeroEstab = numeroEstab;
        this.complementoEstab = complementoEstab;
        this.bairroEstab = bairroEstab;
        this.cidadeEstab = cidadeEstab;
        this.ufEstab = ufEstab;
        this.cnpjEstab = cnpjEstab;
        this.telefoneEstab = telefoneEstab;

    }

    // Getters e Setters

    public String getTipoEstab() {
        return this.tipoEstab;
    }

    public void setTipoEstab(String tipoEstab) {
        this.tipoEstab = tipoEstab;
    }

    
    public String getNomeEstab() {
        return this.nomeEstab;
    }

    public void setNomeEstab(String nomeEstab) {
        this.nomeEstab = nomeEstab;
    }

    
    public String getRuaEstab() {
        return this.ruaEstab;
    }

    public void setRuaEstab(String ruaEstab) {
        this.ruaEstab = ruaEstab;
    }

    
    public int getNumeroEstab() {
        return this.numeroEstab;
    }

    public void setNumeroEstab(int numeroEstab) {
        this.numeroEstab = numeroEstab;
    }

    
    public String getComplementoEstab() {
        return this.complementoEstab;
    }

    public void setComplementoEstab(String complementoEstab) {
        this.complementoEstab = complementoEstab;
    }

    
    public String getBairroEstab() {
        return this.bairroEstab;
    }

    public void setBairroEstab(String bairroEstab) {
        this.bairroEstab = bairroEstab;
    }

    
    public String getCidadeEstab() {
        return this.cidadeEstab;
    }

    public void setCidadeEstab(String cidadeEstab) {
        this.cidadeEstab = cidadeEstab;
    }

    
    public String getUfEstab() {
        return this.ufEstab;
    }

    public void setUfEstab(String ufEstab) {
        this.ufEstab = ufEstab;
    }

    
    public String getCnpjEstab() {
        return this.cnpjEstab;
    }

    public void setCnpjEstab(String cnpjEstab) {
        this.cnpjEstab = cnpjEstab;
    }

    
    public String getTelefoneEstab() {
        return this.telefoneEstab;
    }

    public void setTelefoneEstab(String telefoneEstab) {
        this.telefoneEstab = telefoneEstab;
    }

    // Método Especial - Valida se o estabelecimento é do RS 

    public boolean validSeEstabEhGaucho() {

        if (this.ufEstab.equalsIgnoreCase("RS")) {
            
            return true; 
            
        }
        
        return false;
    }
    
    // Metodo toString

    public String toString() {
        return "Tipo de Estabelecimento: " + this.tipoEstab + "\nNome do Estabelecimento: "
                + this.nomeEstab + "\nRua: " + this.ruaEstab + "\nNúmero: " + this.numeroEstab
                + "\nComplemento: " + this.complementoEstab + "\nBairro: " + this.bairroEstab
                + "\nCidade: " + this.cidadeEstab + "\nUF: " + this.ufEstab + "\nCNPJ: "
                + this.cnpjEstab + "\nTelefone: " + this.telefoneEstab;
    }

}
