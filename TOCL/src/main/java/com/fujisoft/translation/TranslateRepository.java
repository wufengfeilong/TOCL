package com.fujisoft.translation;

import org.springframework.data.jpa.repository.JpaRepository;
import java.lang.String;
import com.fujisoft.translation.Translation;
import java.util.List;

/** 
* create by 張風武 
* 2018/03/16 13:55:17 
*/

public interface TranslateRepository extends JpaRepository<Translation, Integer> {
    List<Translation> findByChinaTran(String chinatran);
    List<Translation> findByEnglishTran(String englishtran);
    List<Translation> findByJapanTran(String japantran);
}
