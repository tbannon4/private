package skills3;
import java.util.ArrayList;
public class ZoomMeeting 
{
	private ArrayList<ZoomParticipant> list;
	public ZoomMeeting()
	{
		list = new ArrayList<ZoomParticipant>();
	}
	public ZoomParticipant shortestTime()
	{
		ZoomParticipant shortest = list.get(0);
		for(ZoomParticipant zp : list)
		{
			int minutes = zp.getMinutes();
			if(minutes < shortest.getMinutes()) 
			{
				shortest = zp;
			}
		}
		return shortest;
	}
}
