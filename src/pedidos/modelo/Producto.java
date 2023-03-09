package pedidos.modelo;

public class Producto 
{
   private int codigo;
   private String descripcion;
   private double precio;
   private int stock;
   
   public Producto(int codigo, String descripcion, double precio) {
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.precio = precio;
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
      return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock
            + "]";
   }


}
