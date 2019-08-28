/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materia;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Estudiante {
   
    private String Nombre;
    private String Asignatura;
    private int NumeroNotas;
    private double Notas[];
    private double Porcentajes[];
    private double NotaFinal; 
    
    public void setNombre(String Nombre){
    this.Nombre=Nombre;}
    public void setAsignatura(String Asignatura){
    this.Asignatura=Asignatura;}
    public void setNumeroNotas(int NumeroNotas){
    this.NumeroNotas=NumeroNotas;}
    public void setNotas(double[] Notas){
    this.Notas=Notas;}
    public void setPorcentajes(double[] Porcenajes){
    this.Porcentajes=Porcenajes;}
    public void setNotaFinal(double NotaFinal){
    this.NotaFinal=NotaFinal;}
    
    public String getNombre(){
    return Nombre;}
    public String getAsignatura(){
    return Asignatura;}
    public int getNumeroNotas(){
    return NumeroNotas;}
    public double[] getNotas(){
    return Notas;}
    public double[] getPorcentajes(){
    return Porcentajes;}
    public double getNotaFinal(){
    return NotaFinal;} 
   
   /*metodos*/
    Scanner teclado = new Scanner(System.in);
    public void datos(){
  
    System.out.println("Nombre del estudiante: ");
    Nombre=teclado.nextLine();
    System.out.println("Dijite la Asignatura: ");
    Asignatura=teclado.nextLine();
   
    double aux;
  
    System.out.print("Dijite el numero de notas sacadas en la asignatura: ");
    NumeroNotas=teclado.nextInt();
    
    
    Notas=new double[NumeroNotas];
    Porcentajes=new double[NumeroNotas];
    
    for(int i=0;i<(NumeroNotas-1);i++){
    System.out.println("Dijite su nota num: "+ (i+1));
    Notas[i]=teclado.nextDouble();
    System.out.println("Porcentaje de la nota: ");
    Porcentajes[i]=teclado.nextDouble();
    aux=(Notas[i])*(Porcentajes[i]/100);
    NotaFinal+=aux;}
    
    System.out.println("Notas: "+"Porcentaje: ");
    for(int i=0;i<(NumeroNotas-1);i++){
    System.out.println(Notas[i]+"       "+Porcentajes[i]);}
    
    if(NotaFinal>=3){
    System.out.println("Acaba de aprobar la materia, felicitaciones");}
    else
    if(NotaFinal<3){}
    else
    if(NotaFinal>=2.60 && NotaFinal<=2.99){
    System.out.println("Reprobo la materia, pero puede recuperarla");}
    else
    if(NotaFinal<2.60){
    System.out.println("Reprobo la materia, y no puede recuperarla");}}
    

    
}
