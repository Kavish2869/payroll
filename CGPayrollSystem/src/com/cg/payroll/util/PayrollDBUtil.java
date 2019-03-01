package com.cg.payroll.util;
import java.util.*;

import com.cg.payroll.beans.Associate;
public class PayrollDBUtil {

	public static HashMap<Integer,Associate>associates = new HashMap<>();
	
	public static int ASSOCIATE_ID_COUNTER=100;
	public static int getASSOCIATE_ID_COUNTER() {
		return ++ASSOCIATE_ID_COUNTER;
	}
	
}