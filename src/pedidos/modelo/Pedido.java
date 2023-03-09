package pedidos.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido 
{
   private long numero;
   private LocalDate fecha;
   private String formaEnvio;
   
   private double subtotal;
   private double descuento;
   private double iva;
   private double total;

   //? Asociaciones

   private Empresa empresa;
   private Cliente cliente;
   private List<ItemPedido> articulosPedido = new ArrayList<>();
   
   public Pedido(long numero, LocalDate fecha, Empresa empresa, Cliente cliente) 
   {
      this.numero = numero;
      this.fecha = fecha;
      this.empresa = empresa;
      this.cliente = cliente;
   }

   //? agregar un producto al pedido
   public void agregarItem(Producto producto, int cantidad)
   {
      //? Crear item solicitado y agregarlo al pedido
      ItemPedido item = new ItemPedido(producto, cantidad);
      articulosPedido.add(item);

      //todo 2. calcular subtotal del item solicitado

      //todo 3. calcular subtotal del pedido (recorrer el arrayList)

      //todo 4. calcular iva del pedido 

      //todo 5. calcular total del pedido (recorrer el array List)
   }
   
}
