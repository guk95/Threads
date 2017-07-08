/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author laboratorio
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //service disparados desde cualquier lugar y nunca reportan al UI , corren procesos y nunca bloquean el MT
    //thread se hacen operaciones que dependen de algo ,"intenert lenta" se bloquea el MT
    //cuando se utiliza un task  se pega a un JSON
    //librerias se pueden bloquear, bloquear librerias se hace lerda la aplicacion , en java las variables no son thread safe
    //volatile variable que no es thread safe
    //synchonized bloquea un metodo safe / atomic   variable que es thread safe
    //thread necesita correr un objeto runnable, ej web service.
    //web service , un servicio que se consume que esta en el internet para traer informacion 
    //patron observer  no usa threads , esta encima de clases , cada que hay cambio manda el cambio
    //Rxjava cada vez que pasa algo en el thread el reacciona , programacion reactiva netflix, sirve para conexiciones lentas
    //javascript es solo para front end
    //gson{
    //"Nombre atributo": "valor",
    //"attr2":"2",
    //"attr3":"false/0",
    //"obj":{......},
    //"list":,
    // }
    // Modelo que sea fiel a json , los nombres tienen que estar igual sino pueden cambiar de una manera serialzedname
    //tarea threadsdemo visuals tiene getx y gety , point variable dentro de los visuals
    //una figura y se le aigna un tread, y se va a mover con las flechas
    }
    
}
