/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Administrador
 */
public class Validacao {

    public static  boolean NcartaValidator(String nCartaConducao) {
        //Expressão regular para verificar se é um número com exatamente 8 dígitos
        String regex = "^[0-9]{8}$";
        return nCartaConducao != null && nCartaConducao.matches(regex);
    }

    public static boolean EmailValidator(String email) {
        //Expressão regular para validar e-mails
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email != null && email.matches(regex);
    }

    public static boolean ContatoValidator(String contato) {
        //Valida prefixos móveis 
        String regex = "^(9[123689])[0-9]{7}$";
        return contato != null && contato.matches(regex);
    }

}
