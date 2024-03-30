package equals;

import java.util.Date;

public class EqualsHashcode {
    public static void main(String[] args) {
       
        //usuario1
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemaial.com.br";

        //usuario2
        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezemaial.com.br";

        // dará falso, pois são dois objs distintos na memória. 
        System.out.println(u1 ==  u2); 

        // dará falso, pois são dois objs distintos na memória. 
        System.out.println(u1.equals(u2));


        System.out.println(u2.equals(new Date()));
    }
}
