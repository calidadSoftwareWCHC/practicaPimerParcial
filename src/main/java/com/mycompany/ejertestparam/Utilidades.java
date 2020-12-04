package com.mycompany.ejertestparam;
public class Utilidades {
    public String obtenerAccion(Boolean matriculado,Boolean registrado,Boolean esDocente, Boolean esInstitucion, Boolean esExterno, String tipoPersonaDestino, String estadoRegistro, String esObligatorio ){
        if (matriculado) {
            if (estadoRegistro=="porConfirmar") {
                 return "registrarse";
            }else{
                return "yamatriculado";
            }
            
        }else if (matriculado && registrado) {
            if (estadoRegistro=="porConfirmar") {
                 return "registrarse";
            }else{
                return "yamatriculado";
            }
        }else if (!matriculado && registrado && esDocente && esObligatorio=="si") {
            return "nodestinado";
        }else if (!matriculado && registrado && esDocente && esObligatorio=="no") {
            return "matricularse";
        }
        else if (!matriculado && registrado && !esDocente && esInstitucion && esExterno) {
            return "matricularse";
        }
        else if (!matriculado && !registrado) {
            if(esDocente && esObligatorio=="si"){
                return "nodestinado";
            }else{
                return "registrarse y matricularse";
            }
        }else if (!registrado && !esDocente) {
            return "registrarse y matricularse";
        }else if (esDocente && esObligatorio=="si" && !registrado) {
            return "nodestinado";
        }else if (esDocente && esObligatorio=="no" && !registrado) {
            return "registrarse y matricularse";
        }
        /*if (!matriculado && registrado && esDocente && esInstitucion && esExterno && tipoPersonaDestino=="docente" && tipoPersonaDestino=="porConfirmar" && esObligatorio=="si") {
            return "hola";
        }*/
        return null;
    }
    
}
