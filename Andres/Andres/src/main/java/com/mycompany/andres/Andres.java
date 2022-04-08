/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.andres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andre
 */
public class Andres {

    Vector datos=new Vector();
    
    public void escribirArchivo(Computadoras informacion){
        datos.addElement(informacion);
    }    
    
    public void guardarArchivo(Computadoras data){
        try{
            FileWriter fw=new FileWriter("ComputadorasDB.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            pw.print(","+data.getModelo());
            pw.print(","+data.getMarca());
            pw.print(","+data.getColor());
            pw.print(","+data.getProcesador());
            pw.print(","+data.getFabricante());
            pw.print(","+data.getRAM());
            pw.println(","+data.getAlmacenamiento());
            pw.close();
        }catch(Exception a){
         JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    
    public DefaultTableModel ListaGenerada(){
        Vector array=new Vector();
        array.addElement("Modelo");
        array.addElement("Marca");
        array.addElement("Color");
        array.addElement("Procesador");
        array.addElement("Fabricante");
        array.addElement("RAM");
        array.addElement("Almacenamiento");
       
        
        DefaultTableModel lista=new DefaultTableModel(array,0);
        
        try{
            FileReader fw=new FileReader("ComputadorasDB.txt");
            BufferedReader br=new BufferedReader(fw);
            String c;
            while((c=br.readLine())!= null){
                StringTokenizer dato= new StringTokenizer(c,",");
                Vector t=new Vector();
                while(dato.hasMoreTokens()){
                    t.addElement(dato.nextToken());
                }
                lista.addRow(t);
            }
        }catch(Exception z){
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
        return lista;
    }
    
    
    public static void main(String[] args) {
        Interfaz objA=new Interfaz();
        objA.setVisible(true);
    }
}
