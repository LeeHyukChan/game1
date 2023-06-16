package net.hb.day16;
import java.util.Date;
import java.util.Scanner;
public class GameGabo {
	
	private Scanner my = null;
	private boolean flag = true;
	private int you;
	public void GameStart() 
	{
		flag=true;
		select();
		int com = (int)(Math.random()*3+1);
		check(you,com);
		fight(you,com);
	}
	
	
	
	public void select() 
	{
		while(flag)
		{
		try 
			{
				System.out.println("무엇을 내시겠습니까?(주먹 = 1, 가위 = 2, 보자기 = 3)");
				my = new Scanner(System.in);
				you =my.nextInt();
				my.nextLine();
				
			}
		catch(Exception ex)
			{
				System.out.println("1에서 3 사이 숫자 숫자만 입력해주세요");
				continue;
			}
			
			if(you >3 ||you < 1)
			{
				System.out.println("1에서 3까지만 선택할 수 있습니다.");
				continue;
			}
			flag=false;
		}
		
	}
	
	public void check(int you, int com)
	{
		if(you == 1){System.out.println("당신은 주먹을 골랐다.");}
		else if(you ==2){System.out.println("당신은 가위을 골랐다.");}
		else {	System.out.println("당신은 보자기를 골랐다.");}
		if(com == 1){	System.out.println("컴퓨터는 주먹을 골랐다.");}
		else if(com ==2){System.out.println("컴퓨터는 가위을 골랐다.");	}
		else {	System.out.println("컴퓨터는 보자기를 골랐다.");}
		
	}
	
	public void fight(int you, int com)
	{
		if( (you - com) == -1 || (you - com) == 2 )
		{
			System.out.println("당신이 이겼습니다.");
		}
		else if((you - com) == 1 || (you - com) == -2)
		{
			System.out.println("당신이 졌습니다.");
		}
		else
		{
			System.out.println("무승부입니다.");
		}
	}
	public static void main(String[] args) 
	{
		GameGabo game = new GameGabo();
		Date now = new Date();
		for(int i = 0;i<7;i++)
		{
			game.GameStart();
			System.out.println("게임시간 "+ now);
		}
	} 
//scanner 클래스 예외처리
//	총 7게임 4승리 2무승부 1패
//메소드 3개 이상 구현
//난수발생
//게임 시간 2023-06-16-금요일 시:분:초 Calendar
}
