package pedidos.modelo;

public class Cliente 
{
   private int codigo;
   private String cedula;
   private String nombres;
   
   public int getCodigo() {
      return codigo;
   }
   public String getCedula() {
      return cedula;
   }
   public String getNombres() {
      return nombres;
   }

   public Cliente(int codigo, String cedula, String nombres) {
      this.codigo = codigo;
      this.cedula = cedula;
      this.nombres = nombres;
   }
   
}
