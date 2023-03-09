package pedidos.repositorio;

import java.util.ArrayList;
import java.util.List;

import pedidos.modelo.Producto;

public class ProductoRepositorioList implements IProductoRepositorio
{
   List<Producto> productosList;

   public ProductoRepositorioList(){
      productosList = new ArrayList<>();

      productosList.add(new Producto(10, "Marcador Pelikan", 2.65, 12));
      productosList.add(new Producto(20, "Usb Kingston 64 GB", 9.16, 17));
      productosList.add(new Producto(30, "Cuaderno cuadros Jean Book", 5.23, 67));
   }

   @Override
   public void ingresar(Producto producto) 
   {
      productosList.add(producto);
   }

   @Override
   public void actualizar(int codigo, Producto producto) 
   {
      int indice = 0;
      Producto productoActualizar = null;

      for (Producto p : productosList) {
         if (p.getCodigo() == codigo){
            productoActualizar = p;
            break;
         }
         indice++;
      }

      if (productoActualizar != null){
         productoActualizar.setDescripcion(producto.getDescripcion());
         productoActualizar.setPrecio(producto.getPrecio());
         productoActualizar.setStock(producto.getStock());

         productosList.set(indice, productoActualizar);
      }

      
   }

   @Override
   public void eliminar(int codigo) {
      Producto productoEliminar = null;

      productoEliminar = obtener(codigo);

      if (productoEliminar != null)
         productosList.remove(productoEliminar);

   }

   @Override
   public Producto obtener(int codigo) 
   {
      Producto p = null;

      for (Producto producto : productosList) 
      {
         if (producto.getCodigo() == codigo)
            p = producto;
      }

      return p;
   }

   @Override
   public List<Producto> consultarTodos() {
      return productosList;
   }
   
}
