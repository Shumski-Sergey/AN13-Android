package lkovsher.Task8;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Authentication authentication = new Authentication("jbhlhblhvylgkugvjgkuvgv", "nbg_", "nbg_");
        try{
            authentication.controlLogin();
        } catch (WrongLoginException e){
            System.out.println(e.getMessage());
        } finally {
            try{
                authentication.controlPassword();
            } catch(WrongPasswordExeption e){
                System.out.println(e.getMessage());
            }
        }
    }
}
