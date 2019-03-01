package com.cg.payroll.daoservice;
import java.util.*;

import com.cg.payroll.beans.Associate;
public interface AssociateDAO {
Associate save(Associate associate);
boolean update(Associate associate);
Associate findOne(int associateId);
List<Associate>findAll();
}
