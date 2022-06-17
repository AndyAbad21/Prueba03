/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import modelo.Candidato;

/**
 *
 * @author Andy Abad
 */
public interface ICandidatoServicio 
{
    public Candidato crear(Candidato candidato);
    public ArrayList<Candidato> listar();
}
