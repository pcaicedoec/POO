package pedidos.repositorio;

import java.util.List;

import pedidos.modelo.Producto;

public interface IProductoRepositorio 
{
   public void ingresar(Producto producto);
   public void actualizar(int codigo, Producto producto);
   public void eliminar(int codigo);
   public Producto obtener(int codigo);
   public List<Producto> consultarTodos();
}
