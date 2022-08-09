
package aula.pkg2;


public class Caneta {
    String modelo= "bic";
     String cor = "Azul";
     double ponta = 2.2;
     int carga= 4;
     boolean tampada;
     void status () {
         System.out.println("Uma caneta "  +  this.cor);
         System.out.println("Esta tampada  ? "  +  this.tampada);
         System.out.println("Qual e o modelo ? "  +  this.modelo);
         System.out.println("Qual a ponta: "  +  this.ponta);
         System.out.println("Qual e a carga ? "  +  this.carga);
         
     }
     
     void rabiscar (){
     if(this.tampada==true){
         System.out.println("Erro nao posso rabiscar a caneta esta tampada");
          }else{
             System.out.println("Estou rabiscando");
                 }
        
         
         
     }
         
         void tampar (){
         this.tampada=true;
        
         
         
     }

     void destampar () {
        this.tampada=false;
         
     }
}
