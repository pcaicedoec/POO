package pedidos.prueba;

import java.time.LocalDate;

import pedidos.modelo.Cliente;
import pedidos.modelo.Empresa;
import pedidos.modelo.Pedido;
import pedidos.modelo.Producto;

public class TestPrueba 
{
   public static void main(String[] args) 
   {
      Empresa empresa = new Empresa(100, "Ofcientro");

      Cliente cliente = new Cliente(25, "0914253684", "Juan Jose Perez Sosa");

      Producto p1 = new Producto(10001, "Marcadores de Pizarra", 1.25);
      Producto p2 = new Producto(1002, "Boligrafos de tinta negra", 1.2);
      Producto p3 = new Producto(1006, "Cuaderno Universitario Cuadros", 1.45);
      Producto p4 = new Producto(1010, "Borrador Blanco", 0.56);
   
      Pedido miPedido = new Pedido(2020, LocalDate.now(), empresa, cliente);
   
      //? agregar los productos al pedido
      miPedido.agregarItem(p1, 10);
      miPedido.agregarItem(p2, 5);
      miPedido.agregarItem(p3, 5);
      miPedido.agregarItem(p4, 2);

      System.out.println("...");

   }
}
