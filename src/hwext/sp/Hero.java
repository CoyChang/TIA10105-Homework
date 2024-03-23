package hwext.sp;

public class Hero {
	private String name;
	private String job;
	private int level;
	private double exp;
	
	private AttackStrategy attackStrategy;
	private MoveStrategy moveStrategy;
	private DefendStrategy defendStrategy;
	
	public Hero() {
		this("AIMan", "SwordMan", 1, 0);
	}

	public Hero(String name, String job, int level, double exp) {
		super();
		this.name = name;
		this.job = job;
		this.level = level;
		this.exp = exp;
	}
	
	public void performAttack() {
		attackStrategy.attack();
	}
	
	public void performMove() {
		moveStrategy.move();
	}
	
	public void performDefend() {
		defendStrategy.defend();
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public void setMoveStrategy(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}

	public void setDefendStrategy(DefendStrategy defendStrategy) {
		this.defendStrategy = defendStrategy;
	}

	@Override
	public String toString() {
		return "Hero [name = " + name + ", job = " + job + ", level = " + level + ", exp = " + exp + "]";
	}

}
