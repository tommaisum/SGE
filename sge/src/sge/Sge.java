package sge;

import java.util.Scanner;

public class Sge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        String Senha = "";
        

        
            System.out.println("Digite o Primeiro Nome: ");
            String primeiroNome = scanner.nextLine();
        
            System.out.println("Digite o Último nome: ");
            String ultimoNome = scanner.nextLine();
        
        
            String Login = primeiroNome.charAt(0)+"_"+ultimoNome;
            System.out.println("Seu login é: ");
            System.out.println(Login);
            
        
            boolean redefinir = false;
        
                while(redefinir == false){
            
                    System.out.println("Digite uma senha: ");
                    Senha = scanner.nextLine();
        
                        if(Senha.length() > 7){
                            
                            if(Senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+")){

                                    System.out.println("Senha cadastrada com sucesso");
                                    redefinir = true;
                            }else {

                                    System.out.println("Sua senha deve Conter 1 letra Maiuscula, 1 Número e um desses Caracteres (@,#,!)");
                            }
                        }else{
                        
                            System.out.println("Senha Precisa ter pelo menos 8 caracteres.");
                        }
                
            }
            
            boolean logar = false;
            
            while(logar == false){
                System.out.println("Digite seu Login: ");
                String login1 = scanner.nextLine();
            
                if (login1.equals(Login) ){
                    System.out.println("Digite sua senha: ");
                    String senha1 = scanner.nextLine();
                    if(senha1.equals(Senha)){
                        System.out.println("Login Realizado com Sucesso");
                        logar = true;
                    }else{
                        System.out.println("Senha Incorreta");
                    }
                }else{
                    System.out.println("Login incorreto"); 
                }
         }
        
        
    }
    
}
