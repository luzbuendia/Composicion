package composicion;

public class Main
{
    public static void main(String[] args) 
    {
    
       EquipoDeVoley equipoDeVoley =new EquipoDeVoley("las gaviotas ");
       System.out.println(equipoDeVoley.getNombre());
       equipoDeVoley.setAgregarJugadora(new Jugadoras("Maria","Borja", 16));
       
       equipoDeVoley.setAgregarJugadora(new Jugadoras("Alejandra", "Perez" ,14));
       for(Jugadoras jugadoras:equipoDeVoley.listarJugadoras())
       {
         System.out.println("jugadoras:"+jugadoras.getNombre()+" "+jugadoras.getApellido());
       }
         equipoDeVoley.setEntrenadora(new Entrenadora("Elena", "villanueva",30 ));
         System.out.println(equipoDeVoley.getEntrenadora().getNombre());
         System.out.println(equipoDeVoley.getEntrenadora().getApellido());
         System.out.println(equipoDeVoley.getEntrenadora().getEdad());

    }  

}
