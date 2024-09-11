package mybatis.service;
// W D 

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PojoAspectJ {

	// Field

	
	// Constructor
	public PojoAspectJ() {
		System.out.println(":: PojoAspectJ Default Constructor");
	}
	
	
	// Method
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("[Around before] "+getClass()+".invoke() start");
		System.out.println("[Around before] Ÿ�� ��ü : "
								+joinPoint.getTarget().getClass().getName());
		System.out.println("[Around before] target Object call Method : "
								+joinPoint.getSignature().getName());
		
		if (joinPoint.getArgs().length != 0) {
			System.out.println("[Around before] target Object method ���� argument : "
									+joinPoint.getArgs()[0]);
			
		}
		
		Object obj = joinPoint.proceed();
		
		System.out.println("[Around after] Ÿ�� ��ü�� ȣ�� �� return value : "+obj);
		System.out.println("[Around after] "+getClass()+".invoke() end");
		
		return obj;
	}

}
// class end