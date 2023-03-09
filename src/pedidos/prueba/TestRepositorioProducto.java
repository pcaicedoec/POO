package pedidos.prueba;

import pedidos.modelo.Producto;
import pedidos.repositorio.IProductoRepositorio;
import pedidos.repositorio.ProductoRepositorioList;

public class TestRepositorioProducto 
{
   public static void main(String[] args) 
   {
      IProductoRepositorio daoProductos = new ProductoRepositorioList();

      Producto p1 = new Producto(10001, "Marcadores de Pizarra", 1.25);
      Producto p2 = new Producto(1002, "Boligrafos de tinta negra", 1.2);
      Producto p3 = new Producto(1006, "Cuaderno Universitario Cuadros", 1.45);
      Producto p4 = new Producto(1010, "Borrador Blanco", 0.56);
   
      // Ingresar producto al repositorio de productos

      daoProductos.ingresar(p1);
      daoProductos.ingresar(p2);
      daoProductos.ingresar(p3);
      daoProductos.ingresar(p4);

      // Actualizar un producto
      p4.setDescripcion("Borrador Pelikan");

      daoProductos.actualizar(1010, p4);

      // Eliminar un producto

      daoProductos.eliminar(1006);

      // Presentar la lista

      System.out.println(daoProductos.consultarTodos());
   }   
}
