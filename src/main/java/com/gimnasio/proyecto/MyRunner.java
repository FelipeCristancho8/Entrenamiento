/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gimnasio.proyecto;

import com.gimnasio.proyecto.modelo.Ejercicio;
import com.gimnasio.proyecto.modelo.Especialista;
import com.gimnasio.proyecto.modelo.GrupoDeportivo;
import com.gimnasio.proyecto.modelo.ParteCuerpo;
import com.gimnasio.proyecto.modelo.Registro;
import com.gimnasio.proyecto.modelo.Rutina;
import com.gimnasio.proyecto.modelo.RutinaId;
import com.gimnasio.proyecto.modelo.TipoEjercicio;
import com.gimnasio.proyecto.repositorio.EjercicioRepositorio;
import com.gimnasio.proyecto.repositorio.EspecialistaRepositorio;
import com.gimnasio.proyecto.repositorio.GrupoDeportivoRepositorio;
import com.gimnasio.proyecto.repositorio.ParteCuerpoRepositorio;
import com.gimnasio.proyecto.repositorio.RegistroRepositorio;
import com.gimnasio.proyecto.repositorio.RutinaRepositorio;
import com.gimnasio.proyecto.repositorio.TipoEjercicioRepositorio;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author felip
 */
@Component
public class MyRunner implements CommandLineRunner{
    
    @Autowired
    private TipoEjercicioRepositorio tipoEjercicioRepositorio;
    
    @Autowired
    private EjercicioRepositorio ejercicioRepositorio;
    
    @Autowired
    private EspecialistaRepositorio especialistaRepositorio;
    
    @Autowired
    private RutinaRepositorio rutinaRepositorio;
    
    @Autowired
    private RegistroRepositorio registroRepositorio;
    
    @Autowired
    private GrupoDeportivoRepositorio grupoDeportivoRepositorio;
    
    @Autowired
    private ParteCuerpoRepositorio parteCuerpoRepositorio;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("*****************************************************************************************************************************************************");
        guardarTipoEjercicio("Aerbico");
        guardarTipoEjercicio("Flexibilidad");
        guardarTipoEjercicio("Fuerza y resistencia");        
        guardarTipoEjercicio("Tipo ejercicio de prueba");
        tipoEjercicioRepositorio.deleteById(4);
        editarTipoEjercicio(1, "Aerobico");
        
        
        System.out.println("----------------------------------------------------");
        guardarEjercicio(1, "Caminata", "Es un ejercicio aerobico");
        guardarEjercicio(1, "Baile", "Es un tipo de ejercicio aerobico");
        guardarEjercicio(2, "Estiramiento de brazos", "Es un tipo de ejercicio de flexibilidad");
        guardarEjercicio(3, "Barras", "Es un tipo de ejercicio de fuerza y resistencia");
        System.out.println("----------------------------------------------------");
        System.out.println("OBTENER TODOS LOS EJERCICIOS");
        obtenerTodosLosEjercicios();
        System.out.println("----------------------------------------------------");
        System.out.println("BUSCAR POR NOMBRE");
        buscarEjercicioPorNombre("Caminata");
        System.out.println("----------------------------------------------------");
        System.out.println("BUSCAR POR NOMBRE QUE COMIENZA EN");
        buscarEjercicioPorNombreIniciadoPor("B");
        System.out.println("----------------------------------------------------");
        System.out.println("BUSCAR POR TIPO EJERCICIO");
        buscarEjercicioPorTipoEjercicio(3);
        System.out.println("----------------------------------------------------");
        System.out.println("EXISTE EL EJERCICIO DADO UN NOMBRE");
        existeEjercicioDadoUnNombre("Barras");
        System.out.println("----------------------------------------------------");
        System.out.println("OBTENER EJERCICIOS ORDENADOS POR NOMBRE DESCENDENTEMENTE");
        obtenerEjerciciosOrdenadosPorNombre();
        System.out.println("----------------------------------------------------");
        System.out.println("OBTENER EJERCICIOS POR NOMBRE IGNORANDO MAYÚSCULAS Y MINÚSCULAS");
        obtenerEjerciciosPorNombreIgnorandoMayusculasYMinusculas("bAILe");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        /*System.out.println("CREAR ESPECIALISTA");
        crearEspealista("Felipe", LocalDate.of(1997,8,8), "123456");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("LISTAR ESPECIALISTAS");
        listarEspecialistas();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("BUSCAR ESPECIALISTA");
        buscarEspealista(2L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("ELIMINAR ESPECIALISTA");
        //eliminarEspecialista(2L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("CREAR RUTINA");
        //crearRutina(3L, 4L, "Lun", 2, 20);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("LISTAR RUTINAS");
        listarRutinas();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("CREAR REGISTRO");
        //crearRegistro(LocalDate.of(2021, 12, 2), 4L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("LISTAR REGISTRO");
        listarRegistros();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("BUSCAR REGISTRO");
        buscarRegistro(1L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("ELIMINAR REGISTRO");
        //eliminarRegistro(1L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("CREAR GRUPO DEPORTIVO");
        //crearGrupoDeportivo(3L, 4L, 1L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("LISTAR GRUPOS DEPORTIVOS");
        listarGruposDeportivos();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("BUSCAR GRUPO DEPORTIVO");
        buscarGrupoDeportivo(2L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("ELIMINAR GRUPO DEPORTIVO");
        //eliminarGrupoDeportivo(1L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("CREAR PARTE DE CUERPO");
        //crearParteCuerpo("Biceps");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("CREAR PARTE DE CUERPO METODO 2");
        //crearParteCuerpo(1L,"Biceps braquial");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("LISTAR PARTES DEL CUERPO");
        listarPartesDelCuerpo();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("BUSCAR PARTE CUERPO");
        buscarParteCuerpo(1L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("ELIMINAR PARTE CUERPO");
        //eliminarParteCuerpo(3L);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("*****************************************************************************************************************************************************");*/
    }
    
    private void guardarTipoEjercicio(String descripcion){
        TipoEjercicio tipoEjercicio = new TipoEjercicio(descripcion);
        tipoEjercicioRepositorio.save(tipoEjercicio);
        System.out.println("El tipo ejercicio fue guardado correctamente");
    }
    
    private void guardarEjercicio(Integer idTipoEjercicio,String nombre, String descripcion){
        TipoEjercicio tipoEjercicio = tipoEjercicioRepositorio.findById(idTipoEjercicio).orElse(null);
        Ejercicio ejercicio = new Ejercicio(tipoEjercicio, nombre, descripcion);
        ejercicioRepositorio.save(ejercicio);
        System.out.println("Se guardo el ejercicio correctamente");
    }
    
    private void buscarEjercicioPorNombre(String nombre){
        List<Ejercicio> ejercicios = ejercicioRepositorio.findByNombreEjercicio(nombre);
        System.out.println(ejercicios);
    }
    
    private void buscarEjercicioPorNombreIniciadoPor(String nombre){
        List<Ejercicio> ejercicios = ejercicioRepositorio.findByNombreEjercicioStartingWith(nombre);
        for(Ejercicio ejercicio : ejercicios)
            System.out.println(ejercicio);
    }
    
    private void buscarEjercicioPorTipoEjercicio(Integer id){
        TipoEjercicio tipoEjercicio = tipoEjercicioRepositorio.findById(id).orElse(null);
        List<Ejercicio> ejercicios = ejercicioRepositorio.findByTipoEjercicio(tipoEjercicio);
        for(Ejercicio ejercicio : ejercicios)
            System.out.println(ejercicio);
    }
    
    private void existeEjercicioDadoUnNombre(String nombre){
        boolean existe = ejercicioRepositorio.existsByNombreEjercicio(nombre);
        System.out.println("¿Existe un ejercicio con el nombre "+nombre+"? : "+existe);
    }
    
    private void obtenerEjerciciosOrdenadosPorNombre(){
        List<Ejercicio> ejercicios = ejercicioRepositorio.findByOrderByNombreEjercicioDesc();
        for(Ejercicio ejercicio : ejercicios)
            System.out.println(ejercicio);
    }
    
    private void obtenerEjerciciosPorNombreIgnorandoMayusculasYMinusculas(String nombre){
        List<Ejercicio> ejercicios = ejercicioRepositorio.findByNombreEjercicioIgnoreCase(nombre);
        for(Ejercicio ejercicio : ejercicios)
            System.out.println(ejercicio);
    }
    
    private void obtenerTodosLosEjercicios(){
        List<Ejercicio> ejercicios = ejercicioRepositorio.findAll();
        for(Ejercicio ejercicio : ejercicios)
            System.out.println(ejercicio);
    }
    
    private void editarTipoEjercicio(Integer id,String descripcion){
        TipoEjercicio tipoEjercicio = tipoEjercicioRepositorio.findById(id).orElse(null);
        tipoEjercicio.setDescripcion(descripcion);
        tipoEjercicioRepositorio.save(tipoEjercicio);
        System.out.println("Se edito el tipo ejercicio correctamente");
    }
    


    //----------------------------------------------AQUI EMPIEZA LAS DEMAS TABLAS DEL PROYECTO---------------------
    //----------------------------------------------ESPECIALISTA------------------------------------------------
    private void crearEspealista(String nombre,LocalDate fechaNacimiento,String tarjetaProfesional){
        Especialista especialista = new Especialista(nombre, fechaNacimiento, tarjetaProfesional);
        especialistaRepositorio.save(especialista);
        System.out.println("Especialista creado satisfactoriamiente");
    }
    
    private void listarEspecialistas(){
        List<Especialista> especialistas = especialistaRepositorio.findAll();
        for(Especialista especialista : especialistas)
            System.out.println(especialista);           
    }
    
    private void buscarEspealista(Long id){
        Especialista especialista = especialistaRepositorio.findById(id).orElse(null);
        
        System.out.println(especialista);
    }
    
    private void eliminarEspecialista(Long id){
        especialistaRepositorio.deleteById(id);
        System.out.println("Especialista borrado correctamente");
    }
    
    //----------------------------------------------RUTINA------------------------------------------------
    
    private void crearRutina(Long idEspecialista, Long idEjercicio, String dia, Integer repeticiones, Integer duracion){
        Especialista especialista = especialistaRepositorio.findById(idEspecialista).orElse(null);
        Ejercicio ejercicio = ejercicioRepositorio.findById(idEjercicio).orElse(null);
        RutinaId rutinaId = new RutinaId(especialista, ejercicio, dia);
        Rutina rutina = new Rutina(rutinaId, repeticiones, duracion);
        rutinaRepositorio.save(rutina);
        System.out.println("Rutina creada correctamente");
    }
    
    private void listarRutinas(){
        List<Rutina> listaRutinas = rutinaRepositorio.findAll();
        for(Rutina rutina : listaRutinas){
            System.out.println(rutina);
        }
    }
    
    //----------------------------------------------REGISTRO------------------------------------------------
    private void crearRegistro(LocalDate fechaRegistro,Long idEspecialista){
        Especialista especialista = especialistaRepositorio.findById(idEspecialista).orElse(null);
        Registro registro = new Registro(fechaRegistro,especialista);
        registroRepositorio.save(registro);
        System.out.println("Registro exitoso");
    }
    
    private void listarRegistros(){
        List<Registro> registros = registroRepositorio.findAll();
        for(Registro registro : registros){
            System.out.println(registro);
        }
    }
    
    public void buscarRegistro(Long id){
        Registro registro = registroRepositorio.findById(id).orElse(null);
        System.out.println(registro);
    }
    
    public void eliminarRegistro(Long id){
        registroRepositorio.deleteById(id);
    }
    
    //----------------------------------------------GRUPO DEPORTIVO------------------------------------------------
    public void crearGrupoDeportivo(Long idEspecialista, Long espIdEspecialista,Long intento){
        Especialista especialista1 = especialistaRepositorio.findById(idEspecialista).orElse(null);
        Especialista especialista2 = especialistaRepositorio.findById(espIdEspecialista).orElse(null);
        GrupoDeportivo grupoDeportivo = new GrupoDeportivo(especialista1, especialista2, intento);
        grupoDeportivoRepositorio.save(grupoDeportivo);
        System.out.println("Grupo deportivo creado con exito");
    }
    
    public void listarGruposDeportivos(){
        List<GrupoDeportivo> gruposDeportivos = grupoDeportivoRepositorio.findAll();
        for(GrupoDeportivo grupoDeportivo : gruposDeportivos){
            System.out.println(grupoDeportivo);
        }
    }
    
    public void buscarGrupoDeportivo(Long id){
        GrupoDeportivo grupoDeportivo = grupoDeportivoRepositorio.findById(id).orElse(null);
        System.out.println(grupoDeportivo);
    }
    
    public void eliminarGrupoDeportivo(Long id){
        grupoDeportivoRepositorio.deleteById(id);
    }
    
    //----------------------------------------------GRUPO DEPORTIVO------------------------------------------------
    private void crearParteCuerpo(String descripcion){
        ParteCuerpo parteCuerpo = new ParteCuerpo(descripcion);
        parteCuerpoRepositorio.save(parteCuerpo);
        System.out.println("Parte creada correctamente");
    }
    
    private void crearParteCuerpo(Long idMusculo,String descripcion){
        ParteCuerpo parteCuerpo = parteCuerpoRepositorio.findById(idMusculo).orElse(null);
        ParteCuerpo parteCuerpoNueva = new ParteCuerpo(parteCuerpo, descripcion);
        parteCuerpoRepositorio.save(parteCuerpoNueva);
        System.out.println("Parte creada correctamente");
    }
    
    private void listarPartesDelCuerpo(){
        List<ParteCuerpo> partesCuerpo = parteCuerpoRepositorio.findAll();
        for(ParteCuerpo parteCuerpo : partesCuerpo){
            System.out.println(parteCuerpo);
        }
    }
    
    private void buscarParteCuerpo(Long id){
        ParteCuerpo parteCuerpo = parteCuerpoRepositorio.findById(id).orElse(null);
        System.out.println(parteCuerpo);
    }
    
    private void eliminarParteCuerpo(Long id){
        parteCuerpoRepositorio.deleteById(id);
    }
}
