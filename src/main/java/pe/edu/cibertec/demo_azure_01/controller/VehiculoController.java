package pe.edu.cibertec.demo_azure_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.demo_azure_01.viewmodel.VehiculoModel;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {

    @GetMapping("/")
    public String obtenerVehiculos(Model model){
        List<VehiculoModel> listavehiculos = new ArrayList<VehiculoModel>();
        listavehiculos.add(new VehiculoModel( 1, "Toyota", "Corolla", "Rojo", "TYA-9012"));
        listavehiculos.add(new VehiculoModel( 2, "Hyundai", "Santa Fe", "Gris", "HND-6523"));
        listavehiculos.add(new VehiculoModel( 3, "Honda", "Civic", "Rojo", "HND-1234"));
        listavehiculos.add(new VehiculoModel( 4, "Ford", "Mustang", "Negro", "FRD-5678"));
        listavehiculos.add(new VehiculoModel( 5, "BMW", "Serie 3", "Blanco", "BMW-3456"));

        model.addAttribute("listavehiculos", listavehiculos);
        return "vehiculo";
    }
}
