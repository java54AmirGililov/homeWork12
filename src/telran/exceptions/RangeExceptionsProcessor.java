package telran.exceptions;

public class RangeExceptionsProcessor {
	private RangeExceptions rangeExceptions;
	private int counterGreaterMax;
	private int counterLessMin;
	private int counterRange;
	public RangeExceptionsProcessor(RangeExceptions rangeException) {
		this.rangeExceptions = rangeException;
	}
	public void numberProceccor(int number) {
		try {
			rangeExceptions.checkNumber(number);
			counterRange++;
		}catch (NumberGreaterRangeMaxException e) {
			counterGreaterMax++;
		}catch (NumberLessRangeMinException e) {
			counterLessMin++;
		}
	}
	public RangeExceptions getRangeExceptions() {
		return rangeExceptions;
	}
	public int getCounterGreaterMax() {
		return counterGreaterMax;
	}
	public int getCounterLessMin() {
		return counterLessMin;
	}
	public int getCounterRange() {
		return counterRange;
	}
}
