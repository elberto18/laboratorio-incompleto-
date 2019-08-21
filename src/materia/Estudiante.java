package materia;

public class Estudiante {
    private String nombre;
    private int codigo;
    private String asignatura;
    private int canNotas;
    private double [] notas;
    private int [] porNotas;
    private double notaFinal = 0;
            
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return nombre;
    }
    
    public void setcodigo(int codigo){
        this.codigo=codigo;
    }
    public int getcodigo(){
        return codigo;
    }
    
    public void setasignatura(String asignatura){
        this.asignatura=asignatura;
    }
    public String getasignatura(){
        return asignatura;
    }
    
    public void setcanNotas(int canNotas){
        this.canNotas=canNotas;
    }
    public int getcanNotas(){
        return canNotas;
    }
    
    public void setnotas(double [] notas){
        this.notas=notas;
    }
    public double [] getnotas (){
        return notas;
    }
    
    public void setporNotas(int [] porNotas){
        this.porNotas=porNotas;
    }
    public int [] getporNotas (){
        return porNotas;
    }
    
    public double calNotaFinal(){
        for (int i = 0; i < canNotas; i++) {
            notaFinal += notas[i]*((double)porNotas[i]/100);
        }
        return notaFinal;
    }
    
    public void ImprimirDaots(){
        System.out.println("Nobre Estudiante: "+ nombre);
        System.out.println("Codigo Estudiante: "+ codigo);
        System.out.println("Nobre Asignatura: "+ asignatura);
        System.out.println("Nota Final: "+ calNotaFinal());
    }
    
    public void resultadoMateria(){
        if (calNotaFinal() < 2.5) {
            System.out.println("El Estudiante perdio la Asignatura");
        }
        else    {
            if (calNotaFinal() >= 2.6 && calNotaFinal() < 3 ){
                System.out.println("El Estudiante puede validar la Asignatura");
            }
            else{
                System.out.println("El Estudiante aprovo la Asignatura");
            }
        }
    }
    
     public void filNotas(String Fila){
        String [] Partes;
        Partes = Fila.split(" ");
        for (int i = 0; i < canNotas; i++) {
            notas[i] = Double.parseDouble(Partes[i]);
        }
     }
     
     public void filPorce(String Fila){
        String [] Partes;
        Partes = Fila.split(" ");
        for (int i = 0; i < canNotas; i++) {
            porNotas[i] = Integer.parseInt(Partes[i]);
        }
     }
}