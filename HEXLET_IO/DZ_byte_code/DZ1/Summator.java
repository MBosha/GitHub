public class Summator{

    public int sum(int a, int b) {

      return a + b;
    }

	/**
	* Default empty Summator constructor
	*/
	public Summator() {
		super();
	}

	public static class Builder {

		public Summator create() {
		}
	}

	/**
	* Create string representation of Summator for printing
	* @return
	*/
	@Override
	public String toString() {

		return "Summator []";
	}
}
