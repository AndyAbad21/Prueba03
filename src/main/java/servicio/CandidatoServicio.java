/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

import java.util.ArrayList;
import modelo.Candidato;

/**
 * 
 * @author Andy Abad
 */
public class CandidatoServicio implements ICandidatoServicio
{
    private static ArrayList<Candidato> candidatoList=new ArrayList<Candidato>();
    @Override
    public Candidato crear(Candidato candidato) 
    {
        candidatoList.add(candidato);
        return candidato;
    }

    @Override
    public ArrayList<Candidato> listar()
    {
        return candidatoList;
    }

}
