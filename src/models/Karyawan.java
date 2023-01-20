
package models;

import java.util.ArrayList;
import Entity.KaryawanEntity;

 
public class Karyawan {
    private static ArrayList<KaryawanEntity> karyawanList = new ArrayList<>();
    
    public static void initialData () {
    }
    
    public static ArrayList<KaryawanEntity> all() {
        
        return karyawanList;
    }
    
    public static KaryawanEntity findNama(String Nama){
        for (KaryawanEntity karyawanEntity : karyawanList) {
            if (karyawanEntity.getnama().equals(Nama)) {
                return karyawanEntity;
            }
        }

        return null;
      
    }
    
    public static void insert (KaryawanEntity kryBaru) {
        karyawanList.add(kryBaru);
    }
    
    public static void update(KaryawanEntity kryEdited) {
        int index = indexData(kryEdited.getnama());
        
        if (index != -1) {
            karyawanList.set(index, kryEdited);
                    
        }
    }
    public static void remove(String nama){
        int index = indexData(nama);
        
        if (index != -1) {
            
        }
    }

    private static int indexData(String nama) {
        KaryawanEntity kryFind = findNama(nama);
        return karyawanList.indexOf(kryFind);
    }
       
      
    
    
    
}
