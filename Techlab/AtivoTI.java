package Techlab;
public class AtivoTI {
    private int id;
    private String codigoPatrimonio;
    private String modelo;
    private String status;

    // Construtor 
    public AtivoTI (int id, String codigoPatrimonio, String modelo, String status)
    {
    this.id = id;
    this.codigoPatrimonio = codigoPatrimonio;
    this.modelo = modelo;
    this.status = status;
    }

    //Getters e Setters
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getcodigoPatrimonio(){
        return codigoPatrimonio = codigoPatrimonio;
    }
    public String getmodelo (){
        return modelo;
    }
    public void setmodelo (String modelo) {
        this.modelo = modelo;
    }
    public String getstatus(){
        return status;
    }
    public void setstatus(String status){
        this.status = status;
    }
    } 
