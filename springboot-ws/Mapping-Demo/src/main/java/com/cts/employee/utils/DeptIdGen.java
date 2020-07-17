package com.cts.employee.utils;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class DeptIdGen implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

	
		
		long customId=System.currentTimeMillis();
		
		System.out.println("<<>><< ID: "+customId);
		
		return customId+"";
	}
	
	

}
