package pkgCore;

import java.util.LinkedList;

public class Round {

	private static int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {

		Roll r = new Roll();
		setComeOutScore(r.getScore());
		rolls.add(r);

		int LoopCounter = 0;
		while (LoopCounter < 1) {
			if (getComeOutScore() == 7 || getComeOutScore() == 11) {
				eGameResult = pkgCore.eGameResult.NATURAL;
				break;
			} else if (getComeOutScore() == 2 || getComeOutScore() == 3 || getComeOutScore() == 12) {
				eGameResult = pkgCore.eGameResult.CRAPS;
				break;
			} else {
				Roll NewRoll = new Roll();
				rolls.add(NewRoll);
				if (NewRoll.getScore() == getComeOutScore()) {
					eGameResult = pkgCore.eGameResult.POINT;
					break;
				} else if (NewRoll.getScore() == 7) {
					eGameResult = pkgCore.eGameResult.SEVEN_OUT;
					break;
				}
			}
		}
		for (Roll roll : rolls) {
			System.out.println(roll.getScore());

		}
	}
	
	public eGameResult getResult()
	{
		return this.eGameResult;
	}
	public int RollCount() {

		return rolls.size();
	}

	public static int getComeOutScore() {
		return ComeOutScore;
	}

	public void setComeOutScore(int comeOutScore) {
		ComeOutScore = comeOutScore;
	}

}
