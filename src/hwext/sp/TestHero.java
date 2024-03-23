package hwext.sp;

public class TestHero {

	public static void main(String[] args) {
		Hero one = new Hero("one", "SwordMan", 1, 0);
		one.setAttackStrategy(new AttackSword());
		one.setMoveStrategy(new MoveRun());
		one.setDefendStrategy(new DefendDefense());
		System.out.println(one.toString());
		one.performAttack();
		one.performMove();
		one.performDefend();
		
		System.out.println("==================================================");
				
		Hero two = new Hero("two", "ArrowMan", 10, 50);
		two.setAttackStrategy(new AttackArrow());
		two.setMoveStrategy(new MoveRun());
		two.setDefendStrategy(new DefendDefense());
		System.out.println(two.toString());
		two.performAttack();
		two.performMove();
		two.performDefend();

	}

}
