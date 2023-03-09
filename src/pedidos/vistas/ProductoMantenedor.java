package pedidos.vistas;

import java.io.IOException;
import java.util.Scanner;

import pedidos.modelo.Producto;
import pedidos.repositorio.IProductoRepositorio;
import pedidos.repositorio.ProductoRepositorioList;

public class ProductoMantenedor 
{
   Scanner ingreso = new Scanner(System.in);
   IProductoRepositorio productoRepositorio = new ProductoRepositorioList();

   private void presentarMenuProductos(){

      System.out.println("\n\n\t<< Mantenedor de Productos >>\n");

      System.out.println("\t 1. Crear producto");
      System.out.println("\t 2. Actualizar producto");
      System.out.println("\t 3. Eliminar producto");
      System.out.println("\t 4. Listar Productos");
      System.out.println("\t 5. Salir");

      System.out.print("\n\n Ingresar opcion [1-4]: ");
   }

   public void controlarMenu(){
      int opcion;

      do{
         limpiarPantalla();
         presentarMenuProductos();
         opcion = ingreso.nextInt();
         procesarOpcionMenu(opcion);

         System.out.print("\n Presionar <<Enter>> para continuar: ");
         ingreso.nextLine();
      }
      while(opcion >= 1 && opcion < 5);

   }

   private void procesarOpcionMenu(int opcion)
   {
      Producto producto;

      limpiarPantalla();

      switch (opcion) {
         case 1:
            producto = ingresarProducto();
            break;
         case 2:
            break;
         case 3:
            break;
         case 4:
            listarProductos();
            break;
         default:
            break;
      }
   }

   private Producto ingresarProducto(){

      Producto producto = new Producto();

      System.out.println("<< Ingresar Producto >> \n\n");

      System.out.print("codigo: ");
      producto.setCodigo(ingreso.nextInt());
      ingreso.nextLine();

      System.out.print("descripcion: ");
      producto.setDescripcion(ingreso.nextLine());

      System.out.print("Precio: ");
      producto.setPrecio(Double.parseDouble(ingreso.nextLine()));

      System.out.print("Stock: ");
      producto.setStock(Integer.parseInt(ingreso.nextLine()));

      productoRepositorio.ingresar(producto);

      return producto;
   }

   private void listarProductos()
   {
      System.out.println("\n\n\t << Listado de Productos >>");
      System.out.printf("%s \t %s \t\t %s \t %s\n", "Codigo", "Descripcion", "Precio", "Stock");
      System.out.println("---------------------------------------------------");

      for (Producto producto : productoRepositorio.consultarTodos()) 
         System.out.println(producto);
      
      System.out.print("\n Presionar <<Enter>> para continuar: ");
      ingreso.nextLine();
   }

   public void limpiarPantalla()
   {
      try {
         if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
         else
            Runtime.getRuntime().exec("clear");
      } 
      catch (IOException | InterruptedException ex) {
         
      }
      
   }
}
