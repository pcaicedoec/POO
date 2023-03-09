package pedidos.modelo;

public class Producto 
{
   private int codigo;
   private String descripcion;
   private double precio;
   private int stock;

   public Producto(){

   }
   
   public Producto(int codigo, String descripcion, double precio) {
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.precio = precio;
   }

   public Producto(int codigo, String descripcion, double precio, int stock) {
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.precio = precio;
      this.stock = stock;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }
   
   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }
   public void setPrecio(double precio) {
      this.precio = precio;
   }
   public void setStock(int stock) {
      this.stock = stock;
   }
   public int getCodigo() {
      return codigo;
   }
   public String getDescripcion() {
      return descripcion;
   }
   public double getPrecio() {
      return precio;
   }

   public int getStock() {
      return stock;
   }


   @Override
   public String toString() {
      return codigo +  "\t" + descripcion + "\t" + precio + "\t" + stock;
   }

}
