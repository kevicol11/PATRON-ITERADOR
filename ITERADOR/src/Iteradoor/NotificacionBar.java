package Iteradoor;

public class NotificacionBar {
    NotificacionCollection notificaion;
    public NotificacionBar(){
        this.notificaion= new NotificacionCollection();

    }
public void printlnNotificacion(){
    Iterador iterador = notificaion.createIterador();
    System.out.println("___________--- NOTIFICACION BAR______________");
    while (iterador.hasNext()) {
        Notificacion n = (Notificacion)iterador.next();
        System.out.println(n.getNotificacion());
    }
}
}
