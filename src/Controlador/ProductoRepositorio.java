/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author samue
 */
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorio {

    public static List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Sulfato Ferroso 200mg", "Caja x250 Grageas Sulfato Ferroso 200mg", 28.000, "Tableta"));
        productos.add(new Producto("Sulfato Ferroso Jarabe", "Frasco Jarabe Sulfato Ferroso 120ml ", 5.000, "Jarabe"));
        productos.add(new Producto("Betametasona Crema al 0.05%", "Crema Betametasona al 0.05% 20g", 9.000, "Crema"));
        productos.add(new Producto("Esomeprazol 40mg", "Caja x30 Tabletas Cubiertas", 24.000, "Tableta"));
        productos.add(new Producto("Metocarbamol 750mg", "Caja x20 Tabletas", 13.000, "Tableta"));
        productos.add(new Producto("Naproxeno 500mg", "Caja x10 Tabletas", 8.000, "Tableta"));
        productos.add(new Producto("Loratadina", "Frasco x100mL", 7.000, "Jarabe"));
        productos.add(new Producto("Adrenalina", "Caja x25 Ampollas", 33.000, "Ampolla"));
        productos.add(new Producto("Acetaminofén 500 mg", "Caja x100 tabletas Via Oral", 9.000, "Tableta"));
        productos.add(new Producto("Acetaminofén 150mg", "Frasco x60mL de Acetaminofén Jarabe", 3.000, "Jarabe"));
        productos.add(new Producto("Hioscina 10mg", "Caja x20 Tabletas Buscapina 10mg", 5.000 , "Tableta"));
        productos.add(new Producto("Diclofenaco Gel al 1%", "Gel Diclofenaco al 1% Uso tópico 50g", 8.000, "Crema"));
        productos.add(new Producto("Vita E ", "Caja x30 Capsulas Blandas de Vitamina E", 15.000, "Tableta"));
        productos.add(new Producto("Vita C ", "Caja x100 Tabletas Masticables de Vitamina C", 22.000, "Tableta"));
        productos.add(new Producto("Ibuprofeno 800mg", "Caja x60 Tabletas  de Ibuprofeno 800mg", 12.000, "Tableta"));
        productos.add(new Producto("Clotrimazol Crema", "Crema Vaginal Clotrimazol 1% 40g", 14.000, "Crema"));

        return productos;
    }
}
