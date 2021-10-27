package skills3;

public class DimmerSwitchRunner
{

	public static void main(String[] args) 
	{
		DimmerSwitch ds = new DimmerSwitch(true, 12);
		int bright = ds.getBrightness();
		boolean onOff = ds.getIsOn();
		System.out.println(bright);
		ds.changeBrightness(12);
		System.out.println();
				

	}

}
