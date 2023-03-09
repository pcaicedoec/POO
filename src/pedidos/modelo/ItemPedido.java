package pedidos.modelo;

public class ItemPedido 
{
   private int numeroLinea;
   private int cantidad;
   private double subtotal;

   //? Asociacion con la entidad Producto
   private Producto producto;

   
   public ItemPedido(Producto producto, int cantidad) {
      this.cantidad = cantidad;
      this.producto = producto;
   }
   public void setNumeroLinea(int numeroLinea) {
      this.numeroLinea = numeroLinea;
   }
   public void setCantidad(int cantidad) {
      this.cantidad = cantidad;
   }
   public void setSubtotal(double subtotal) {
      this.subtotal = subtotal;
   }
   
   
}
