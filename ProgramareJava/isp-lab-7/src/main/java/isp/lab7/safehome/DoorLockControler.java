
package isp.lab7.safehome;

import java.util.HashMap;
import java.util.Map;


public class DoorLockControler implements ControllerInterface{
    
    private Map<Tenant,AccesKey> vallidAcces= new HashMap<Tenant,AccesKey>();
    private int count=0;
    public Door c=new Door();
    
    public void setDoor(){
           this.c.lockDoor();
       }
    
    public void lista(){
        for (Tenant i : this.vallidAcces.keySet()) 
            System.out.println(i.getName());
    
    }
    
    
    @Override
    public DoorStatus enterPin(String pin) throws InvalidPinException,TooManyAttemptsException{
       
       if(pin=="MasterKeyValue")
       {
       this.c.openDoor();
       count=0;
       return DoorStatus.OPEN;
       }
       
       if(!this.vallidAcces.containsValue(new AccesKey(pin)))
           {this.count++;
           if(count >=3)
           {
               throw new TooManyAttemptsException();
           }
            else
                throw new InvalidPinException();
           }
       else {if(count>=3) throw new TooManyAttemptsException();
               
             if(c.getStatus()==DoorStatus.CLOSE) 
                  {this.c.openDoor();
                  count=0;
                  return DoorStatus.OPEN;}
               else {
                    this.c.lockDoor();
                    return DoorStatus.CLOSE;}
            }
    }

    @Override
    public void addTenant(String pin, String name) throws TenantAlreadyExistsException {
        
         for (Tenant i : this.vallidAcces.keySet()) 
           if(i.getName()==name)
               throw new TenantAlreadyExistsException();
      
         this.vallidAcces.put(new Tenant(name), new AccesKey(pin));
            
    }

    @Override
    public void removeTenant(String name) throws TenantNotFoundException {
        int y=this.vallidAcces.size();
        for (Tenant i : this.vallidAcces.keySet()) 
           if(i.getName()==name)
              { 
               this.vallidAcces.remove(i);
               return ;
              }
        if(y==this.vallidAcces.size())
            throw new TenantNotFoundException();
    }
            
    
}
