/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Andy Abad
 */
public class Evaluaicion {

    public static void main(String[] args) 
    {
        CandidatoVista cv=new CandidatoVista();
        cv.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cv.setLocationRelativeTo(null);
        cv.setTitle("Formulario de Candidato");
        cv.setVisible(true);
    }
}
