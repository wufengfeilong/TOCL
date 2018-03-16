package com.fujisoft.translation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 
* create by 張風武 
* 2018/03/16 13:45:20 
*/
@Entity
public class Translation {
    @Id
    @GeneratedValue
    private Integer id;
    private String chinaTran;
    private String englishTran;
    private String japanTran;
    
    public Translation() {
    }

    public Translation(String chinaTran, String englishTran, String japanTran) {
        super();
        this.chinaTran = chinaTran;
        this.englishTran = englishTran;
        this.japanTran = japanTran;
    }

    public String getChinaTran() {
        return chinaTran;
    }

    public void setChinaTran(String chinaTran) {
        this.chinaTran = chinaTran;
    }

    public String getEnglishTran() {
        return englishTran;
    }

    public void setEnglishTran(String englishTran) {
        this.englishTran = englishTran;
    }

    public String getJapanTran() {
        return japanTran;
    }

    public void setJapanTran(String japanTran) {
        this.japanTran = japanTran;
    }
    
    
    
}
