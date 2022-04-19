package isp.lab6.exercise2;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EquipmentController {
    List<Equipment> dff=new LinkedList<Equipment>(); 
    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        this.dff.add(equipment);
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return this.dff;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return this.dff.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        HashMap<String, List<Equipment>> hop=new  HashMap<String, List<Equipment>>();
        String cheie;
        List<Equipment> fg = null;
        for(int i=0;i<dff.size();i++)
           {
            cheie=dff.get(i).getOwner();
            if(hop.containsKey(cheie))
                cheie=null;
            else{
            fg=new LinkedList<Equipment>();
            for(int j=i;j<dff.size();j++)
                if(cheie.equals(dff.get(j).getOwner()))
                    fg.add(dff.get(j));
           
            hop.put(cheie, fg);
            }
           }
        return hop;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        Equipment e = null;
        for(int i=0;i<dff.size();i++)
            if(serialNumber==dff.get(i).getSerialNumber())
               {
                e=dff.get(i);
                dff.remove(i);
                break;
               }
        return e;
        
    }
}
