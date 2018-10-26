/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class Libro {
    
   private int ISBN;
   private String titulo;
   private String Autor;
   private int numeroPaginas;

    public Libro(int ISBN, String titulo, String Autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.numeroPaginas = numeroPaginas;
    }
   
   
   

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "El libro con ISBN "+this.ISBN+" creado por el autor "+this.Autor+" tiene "+this.numeroPaginas+" paginas"; 
                
    }
    
    
    public void compararLibro(Libro libro2){
        
        if(this.numeroPaginas>libro2.numeroPaginas){
            JOptionPane.showMessageDialog(null, "Libro "+this.titulo+" es mas extenso");
        }else{
            JOptionPane.showMessageDialog(null,"Libro "+libro2.getAutor()+" es mas extenso");
        }
        
    }
   
   
   
}
