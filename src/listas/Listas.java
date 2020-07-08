package listas;




public class Listas {
    String cadena="";
    String cadena2 = "";
    Nodo cab;
    double resultado;
    
    public Listas(){
        cab=null;
    }
    
    
    void meter_nodo(int x){
        Nodo p=new Nodo(x);
        Nodo q = cab;
        Nodo s = null;
        while(q!=null){
          s = q;
          q = q.sig;
        }
        if(s==null){
            cab=p;  
        }else{
            s.sig = p;
            p.ant = s;
        }      
    }
    
    
    public String imprimir_delante(){
        Nodo q =cab;
        while(q!=null){
            cadena = cadena+"[ "+q.info+" ]-";
            q=q.sig;
        }
        return cadena;
    }
    
    void Escribir_atras(){
        int cont = 0;
        double cociente;        Nodo q =cab;
        Nodo s =null;
        while(q!=null){
            s = q;
            q = q.sig;
        }
        int aux=0;
        while(s != null){
            if (aux==0){
                cociente=(1/((double)s.info));
                resultado=(cociente + (double)(s.ant.info));
            }else{
                if(s.ant!=null){
                    resultado=(1/(double)resultado)+((double)s.ant.info);
                }
               
            }
            aux=1;
            s = s.ant;
        }
        System.out.println();
    } 
    
    public String igualdad(){
        Nodo q =cab;
        String var="      ";
        while(q!=null){
            int conta =1;
            if (q.sig!=null){
                cadena2 = cadena2+q.info+"+"+conta+"___\n"+var;  
            }else{
                conta = 0;
                cadena2 = cadena2+q.info+" "; 
            }
            var+="      ";
            q=q.sig;
        }
        return cadena2;
    }
    
}
