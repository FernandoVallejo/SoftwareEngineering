package co.edu.poli.objectPool.model;

import java.lang.reflect.InvocationTargetException;

public class CreaturePool extends ObjectPool<Creature> {

	@Override
	protected Creature create(String nameClass) {
		try {
			Class<?> animalClass = Class.forName(Creature.class.getPackageName()+"."+nameClass);
			return (Creature) animalClass.getDeclaredConstructor().newInstance();
		} catch (NoSuchMethodException |
					InvocationTargetException |
						InstantiationException | 
							IllegalAccessException | 
								ClassNotFoundException | 
									IllegalArgumentException | 
										SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}

}
