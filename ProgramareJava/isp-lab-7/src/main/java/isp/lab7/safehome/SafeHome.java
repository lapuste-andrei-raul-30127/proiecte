package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) throws Exception {
        DoorLockControler xpl=new DoorLockControler();
        xpl.addTenant("4123", "Varul");
        xpl.addTenant("4900", "Ion");
        xpl.addTenant("7812", "Matei");
      
        
        AccesKey h=new AccesKey("4123");
       
        
        
          
        try{
        
        System.out.println(xpl.enterPin("3222"));
        
        
        } catch (InvalidPinException e) {
            System.out.println(e.getMessage());
        } catch(TooManyAttemptsException f){
            System.out.println(f.getMessage());
        } 
        
        try{
        xpl.addTenant("9811", "Ilinca");
        
        xpl.addTenant("9811", "Ilinca");
        } catch (TenantAlreadyExistsException e){
            System.out.println(e.getMessage());
        }
        
     
        
         
    }
}
