package skills3;

public class DimmerSwitch 
{
	private boolean isOn;
	private int brightness;
	public DimmerSwitch(boolean isOn, int brightness)
	{
		this.isOn = isOn;
		this.brightness = brightness;
	}
	public boolean getIsOn()
	{
		return isOn;
	}
	public int getBrightness()
	{
		return brightness;
	}
	public void setIsOn(boolean isOn)
	{
		this.isOn = isOn;
	}
	public void setBrightness(int brightness)
	{
		this.brightness = brightness;
	}
	public void changeBrightness(int moreLight)
	{
		if(isOn = true)
		{
			brightness += moreLight;
		}
	}
}
