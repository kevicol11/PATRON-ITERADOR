package Iteradoor;

public class NotificacionIterador implements Iterador {

    Notificacion []  notificacionList;

    int pos = 0;

    public NotificacionIterador(Notificacion [] notificacionList){
        this.notificacionList = notificacionList;

    }
    public Object next(){
        Notificacion notificacion = notificacionList[pos];
        pos += 1 ; 
        return notificacion ;

    }
    public boolean hasNext(){
    if (pos>= notificacionList.length||
notificacionList[pos]== null){
        return false;
    } else {
        return true;
    }
}

}
