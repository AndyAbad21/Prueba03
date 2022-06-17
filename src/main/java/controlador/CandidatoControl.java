/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import java.util.ArrayList;
import modelo.Candidato;
import servicio.CandidatoServicio;

/**
 * 
 * @author Andy Abad
 */
public class CandidatoControl
{
    private final CandidatoServicio candidatoServicio=new CandidatoServicio();
    
    public Candidato crear(String[] args)
    {
        Candidato candidato=new Candidato(args[0],Integer.valueOf(args[1]),
                args[2],args[3]);
        candidatoServicio.crear(candidato);
        return candidato;
    }
    public ArrayList<Candidato> listar()
    {
        return candidatoServicio.listar();
    }
}
