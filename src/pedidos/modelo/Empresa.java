package pedidos.modelo;

public class Empresa 
{
   private int codigo;
   private String nombre;
   
   public int getCodigo() {
      return codigo;
   }

   public String getNombre() {
      return nombre;
   }

   public Empresa(int codigo, String nombre) {
      this.codigo = codigo;
      this.nombre = nombre;
   }

}
