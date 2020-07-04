
package projetocaneta;

public class caneta {
    public String modelo;
    public String cor;
    private float tamanhoPonta;
    protected int carga;
    protected boolean tampada;
    public void status(){
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("ponta: " + this.tamanhoPonta);
        System.out.println("carga: " + this.carga);
        System.out.println("Tampada? " + this.tampada);
    }
    public void escrever(){
        if(this.tampada == true){
        System.out.println("Não pode escrever!");
        }else if(this.tampada == false){
        System.out.println("Isto foi escrito pela caneta!");
        }else{
            System.out.println("Sem informação da tampa");
        }
    }
    public void rabiscar(){
        if(this.tampada == true){
        System.out.println("Não pode rabiscar!");
        }else if(this.tampada == false){
        System.out.println("Olha! Um rabisco");
        }else{
            System.out.println("Sem informação da tampa");
        }
    }public void pintar(){
        if(this.tampada == true){
        System.out.println("Não pode rabiscar!");
        }else if(this.tampada == false){
        System.out.println("Olha! Um rabisco");
        }else{
            System.out.println("Sem informação da tampa");
        }
    }
    
    private void tampar(){
    this.tampada = true;
    }
    private void destampar(){
    this.tampada = false;
    }
    
}
