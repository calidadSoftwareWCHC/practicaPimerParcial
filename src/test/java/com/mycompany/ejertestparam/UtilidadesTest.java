/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WILL
 */
public class UtilidadesTest {
    
    public UtilidadesTest() {
    }
    Utilidades utils=new Utilidades();
    @Test
    public void testSomeMethod() {
        //obtenerAccion(Boolean matriculado,Boolean registrado,Boolean esDocente, Boolean esInstitucion, Boolean esExterno, 
        //String tipoPersonaDestino, String estadoRegistro, String esObligatorio )
        //String resultado3 = utils.obtenerAccion(Boolean.FALSE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "docente", "porConfirmar", "si");
        
        //1 Si la persona esta matriculado devolver la cadena: yamatriculado
        String resultado = utils.obtenerAccion(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "", "", "");
        
        //2 Si esta registrado y esta matriculado devuélvela cadena: yamatriculado
        String resultado2 = utils.obtenerAccion(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "", "", "");
        
        //3 Si no esta matriculado, esta registrado , esDocente y el curso es obligatorio devolver: nodestinado.
        String resultado3 = utils.obtenerAccion(Boolean.FALSE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "", "", "si");
        
        //4. Si no esta matriculado, esta registrado , es docente y el curso no es obligatorio devolver: matricularse.
        String resultado4 = utils.obtenerAccion(Boolean.FALSE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "", "", "no");
        
        //5. Si esta matriculado y estadoRegistro es igual porConfirmar devolver registrarse
        String resultado5 = utils.obtenerAccion(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "", "porConfirmar", "");
        
        //6. Si no esta matriculado, esta registrado , no esDocente y esInstitucion o esExterno entonces devolver matricularse.
        String resultado6 = utils.obtenerAccion(Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.TRUE, Boolean.TRUE, "", "", "");
        
        //7. Si no esta registrado y no esta matriculado devolver registrarse y matricularse
        String resultado7 = utils.obtenerAccion(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.TRUE, "", "", "");
        
        //8. Si no esta registrado y no es docente devolver registrarse y matricularse
        String resultado8 = utils.obtenerAccion(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.TRUE, "", "", "");
        
        //9. Si esDocente y esObligatorio y no esta registrado entonces devolver nodestinado
        String resultado9 = utils.obtenerAccion(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "", "", "si");
        
        //10. Si esDocente y no esObligatorio y no esta registrado entonces devolver registrarse y matricularse
        String resultado10 = utils.obtenerAccion(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "", "", "no");
        
        assertEquals("yamatriculado", resultado);
        assertEquals("yamatriculado", resultado2);
        assertEquals("nodestinado", resultado3);
        assertEquals("matricularse", resultado4);
        assertEquals("registrarse", resultado5);
        assertEquals("matricularse", resultado6);
        assertEquals("registrarse y matricularse", resultado7);
        assertEquals("registrarse y matricularse", resultado8);
        assertEquals("nodestinado", resultado9);
        assertEquals("registrarse y matricularse", resultado10);
    }
    
}
