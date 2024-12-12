package akwrk;

interface TvRemote{
	public void volume();
	public void channelno();
	public void power();
	
}

interface SmartTvRemote extends TvRemote{
	public void youtube();
	public void netflix();
	
}

class Tv implements SmartTvRemote{

	@Override
	public void volume() {

		System.out.println("voulume 100");
	}

	@Override
	public void channelno() {


		System.out.println("channel no = 9");
	}

	@Override
	public void power() {

		System.out.println("power on");
		
	}

	@Override
	public void youtube() {

	System.out.println("youtube prime");
	}

	@Override
	public void netflix() {


		System.out.println("Netflix prime");
	}
	
}

public class IntrfaceWrk {

	public static void main(String[] args) {


		Tv ob=new Tv();
		ob.power();
		ob.volume();
		ob.channelno();
		ob.youtube();
		ob.netflix();
		
	}

}
