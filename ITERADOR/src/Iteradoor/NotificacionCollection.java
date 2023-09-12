package Iteradoor;

public class NotificacionCollection implements Collection {
    static final int MAX_ITEMS = 6;
    int numberOfitems = 0;
    Notificacion[] notificacionList;
    public NotificacionCollection(){
        notificacionList = new Notificacion[MAX_ITEMS];
        addItem("notificacion 1");
         addItem("notificacion 2");
          addItem("notificacion 3");
            addItem("notificacion 4");
              addItem("notificacion 5");
                addItem("notificacion 6");
    }
    public void addItem (String str){
        Notificacion notificacion = new Notificacion(str);
        if(numberOfitems >= MAX_ITEMS) {
            System.err.println("full");
        
        } else {
            notificacionList[numberOfitems] = notificacion;
            numberOfitems = numberOfitems +1;
            
        }
  }

@Override
public Iterador createIterador() {
    
    return new  NotificacionIterador(notificacionList);
}
}