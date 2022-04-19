
package isp.lab7.safehome;

public class Door {
    private DoorStatus status=DoorStatus.CLOSE;
    
    public void lockDoor(){
        this.status=DoorStatus.CLOSE;
    }
      public void openDoor(){
        this.status=DoorStatus.OPEN;
    }
      public DoorStatus getStatus(){
          return this.status;
      }
}
