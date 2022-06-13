package composicion;

public class EquipoDeVoley
{
    private String nombre;
    private Jugadoras[]jugadoras;
    private Entrenadora entrenadora;
    private int contador;

  
    public  EquipoDeVoley (String nombre)
    {
      this.nombre=nombre;
      this.jugadoras=new Jugadoras[2];
      this.contador=0;
      
  
    }
    public void setNombre(String nombre)
      {
        this.nombre=nombre;
      }
      public String getNombre()
      {
        return this.nombre;  
      }
      public void setAgregarJugadora(Jugadoras jugadoras )
      {
          this.jugadoras[this.contador]=jugadoras;
          this.contador ++;
  
      }
      public Jugadoras []listarJugadoras()
      {
        return this.jugadoras;
      }    
      public void setEntrenadora(Entrenadora entrenadora)
      {
          this.entrenadora=entrenadora;
          
  
      }
      public Entrenadora getEntrenadora()
      {
        return this.entrenadora;
      }    
     
    
}
