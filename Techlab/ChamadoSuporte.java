package Techlab;

public class ChamadoSuporte {
    private int idChamando;
    private String descricao;
    private boolean aberto;
    private AtivoTI ativoRelacionado;

    public ChamadoSuporte (
    int idChamado, 
    String descricao, 
    AtivoTI ativoRelacionado) {
        this.idChamando = idChamando;
        this.descricao = descricao;
        this.aberto = true;
        this.ativoRelacionado = ativoRelacionado;
    }
    public AtivoTI getativoRelacionado () {
        return this.ativoRelacionado;
    }

    public void fecharChamado(){
        aberto = false;
    }

}
