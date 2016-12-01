package com.orion10110.training.ExersizeOne.Starts;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.orion10110.training.ExersizeOne.Annotation.Service;
import com.orion10110.training.ExersizeOne.Annotation.Start;

public class StartEx7 {

	public static void main(String[] args) {
		loadService("com.orion10110.training.ExersizeOne.Ex6.NuclearBoat");
	}

	static void loadService(String className) {
		try {
			Class<?> clazz = Class.forName(className);
			if (clazz.isAnnotationPresent(Service.class)) {

				Class[] paramTypes = new Class[] { double.class, double.class };
				Constructor construct = clazz.getConstructor(paramTypes);
				Field[] fields = clazz.getDeclaredFields();
				for (Field field : fields) {
					System.out.println(field.getName());
				}
				if (construct.isAnnotationPresent(Start.class)) {
					Annotation anot = construct.getAnnotation(Start.class);
					double x = ((Start) anot).x();
					double y = ((Start) anot).y();
					Object serviceObj = construct.newInstance(x, y);

					Method[] methods = clazz.getMethods();
					for (Method method : methods) {
						if (method.isAnnotationPresent(Start.class)) {
							try {
								Annotation methodAnot = method.getAnnotation(Start.class);
								double xMet = ((Start) methodAnot).x();
								double yMet = ((Start) methodAnot).y();
								Object[] args = new Object[] { new Double(xMet), new Double(yMet) };
								method.invoke(serviceObj, args);
							} catch (Exception e) {

							}
						}
					}
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
